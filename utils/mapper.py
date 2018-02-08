from parser import parse_language
from steps import *
from logger import *

# . indicates parameter

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
    "send_broadcast_templates": send_broadcast_templates
}

did_login = False
failed_action = []
passed = 0
failed = 0
user_category = ['agent', 'admin', 'buyer', 'individual']
# user_category = ['buyer']
clear_logs()
close_popup = False

test_actions, expected_result = parse_language()
log('======== STARTING TEST ========\n')
for index, test_action in enumerate(test_actions):
    for category in user_category:
        log('\n')
        log('======== Category :%s ========'% category)
        last_action = 'Success'
        log('======== TEST: %s ========' % str(index+1))
        log("Expected Result: %s" % expected_result[index])
        log('-------------------------------')
        for action in test_action:
            if last_action != "Success":
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
                        close_help_popup()
                        close_popup = True
                    did_login = True
                    last_action = action_step[function](category)
                    continue;
                log('Function called: %s' % action_step[function])
                last_action = action_step[function]()

            log('Status: %s ' % last_action)

        # To logout after every test
        if did_login:
            did_login = False
            log('Function called: logout')
            last_action_logout = action_step['logout']()
            log('Status: %s' % last_action_logout)

        if last_action == 'Success':
            passed = passed + 1
            log("----------------")
            log("TEST SUCCESSFUL")
            log("----------------")
        else:
            failed = failed + 1
            failed_action.append(action)
            log("----------------")
            log("TEST FAILED")
            log("----------------")


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

close_browser()
