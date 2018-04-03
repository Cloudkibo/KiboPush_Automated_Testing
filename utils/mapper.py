from reporter import *
from parser import parse_language
from steps import *
from logger import *
import config

# - indicates parameter

action_step = {
    "login": login,
    "logout": logout,
    "click-": click_on,
    "sidebar_hamburger": sidebar_hamburger,
    "sidebar-": sidebar_click,
    "choose-": choose_select,
    "open_kibopush": open_kibopush,
    "write-": write,
    "enter": press_enter,
    "tab": press_tab,
    "upload-": upload,
    "select_emoji": select_emoji,
    "send_gif": send_GIF,
    "send_sticker": send_sticker,
    "verify_table": verify_table,
    "verify_alert": verify_alert,
    "remove_channel": remove_autoposting,
    "setting_channel": autopost_settings,
    "download_phone_csv": download_phone_csv,
    "download_user_csv": download_opdashboard_csv,
    "remove_broadcast_component-": remove_broadcast_component,
    "click_component-": click_on_broadcast_component,
    "next_gallery": gallery_next,
    "prev_gallery": gallery_prev,
    "gallery_upload-": gallery_upload,
    "send_broadcast_templates": send_broadcast_templates,
    "clear_field": clear_field,
    "add_menu": add_menu,
    "close_menu-": close_menu
}


category_count = {
    "buyer": [0, 0],
    "admin": [0, 0],
    "agent": [0, 0],
    "individual": [0, 0],
    "0sub": [0, 0]
}
# Would be filled like this:
# "category" : [passed, failed]
# Example:
# "admin" : [24 , 4]

test_status = {}
# Would be filled like this:
# {
# 1: ['Passed','Passed','Failed','Passed', Remarks]
# 3: ['Passed','Failed','Failed','Passed', Agent: Failed at Step 2 Admin: Failed at step 4]
# }


def mapping():
    failed_action = []
    failed_row = set()
    passed = 0
    failed = 0
    close_popup = True
    did_login = False
    test_actions, expected_result, row_number, test_for = parse_language()
    # Opening KiboPush at the start
    open_kibopush()

    log('======== STARTING TEST ========\n')
    for index, test_action in enumerate(test_actions):
        test_status[row_number[index]] = []
        temp_remarks = ''
        for category in config.user_category:
            log('\n')
            log('======== Category : %s ========' % category)
            last_action = 'Success'
            log('======== TEST: %s ========' % str(index + 1))
            log("Expected Result: %s" % expected_result[index])
            log('-------------------------------')
            for action in test_action:
                if last_action != "Success":
                    screenshot_name = "%s_%s_%s" % (str(row_number[index]), str(
                        category), str(action_step[function])[10:-19])
                    screenshot(screenshot_name)
                    break
                function = action
                if '-' in action:
                    param = action.split('-')[-1]
                    function = action.split('-')[0] + '-'
                    log('Function called: %s' % action_step[function])
                    log('Parameters: %s' % param)
                    last_action = action_step[function](param)
                else:
                    if('login' in action):
                        if not close_popup:
                            log('Function called: close_help_popup')
                            last_action = close_help_popup()
                            close_popup = True
                            log('Status: %s' % last_action)
                        did_login = True
                        log('Function called: login')
                        last_action = action_step[function](category)
                        log('Status: %s' % last_action)
                        continue
                    log('Function called: %s' % action_step[function])
                    last_action = action_step[function]()

                log('Status: %s ' % last_action)

            # To logout after every test
            if did_login:
                did_login = False
                log('Function called: logout')
                last_action_logout = action_step['logout']()
                log('Status: %s' % last_action_logout)

            if (last_action == 'Success' and test_for[index].lower() == 'all') or (last_action == 'Success' and category in test_for[index].lower()) or (last_action != 'Success' and category not in test_for[index].lower()):
                test_status[row_number[index]].append('Passed')
                passed = passed + 1
                category_count[category][0] = category_count[category][0] + 1
                log("----------------")
                log("TEST SUCCESSFUL")
                log("----------------")
            else:
                test_status[row_number[index]].append('Failed')
                temp_remarks = temp_remarks + \
                    str(category) + ": " + str(action) + '\n'
                failed_row.add(row_number[index])
                failed = failed + 1
                category_count[category][1] = category_count[category][1] + 1
                failed_action.append(action)
                log("----------------")
                log("TEST FAILED")
                log("----------------")
        test_status[row_number[index]].append(temp_remarks)

    log("=================")
    log("SUMMARY")
    log("=================")

    log("Total Passed: %s" % passed)
    log("Total Failed: %s" % failed)

    log("----------------")
    log("FAILED ACTIONS")
    log("----------------")

    for action in failed_action:
        log(action)

    print(test_status)
    # print(category_count)

    failed_test = list(failed_row)

    summary = {
        'tests_passed': passed,
        'tests_failed': failed,
        'failed_tests': failed_test
    }
    close_browser()
    return test_status, summary


if __name__ == "__main__":
    test_status, summary = mapping()
    gather_report(test_status, summary)
