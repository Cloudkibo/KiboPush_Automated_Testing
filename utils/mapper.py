from parser import parse_language
from steps import *


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

test_actions, expected_result = parse_language()
print('======== STARTING TEST ========\n')
for index, test_action in enumerate(test_actions):
    print('\n')
    last_action = 'Success'
    print('======== TEST:', index + 1, ' ========')
    print("Expected Result: ", expected_result[index])
    print('-------------------------------')
    for action in test_action:
        if last_action != "Success":
            break
        function = action
        if '-' in action:
            param = action.split('-')[-1]
            function = action.split('-')[0] + '-'
            print('Function called: ', action_step[function])
            print('Parameters:', param)
            last_action = action_step[function](param)
        else:
            if('login' in action):
                did_login = True
            print('Function called: ', action_step[function])
            last_action = action_step[function]()

        print('Status: ', last_action)

    # To logout after every test
    if did_login:
        did_login = False
        print('Function called: logout')
        last_action_logout = action_step['logout']()
        print('Status: ', last_action_logout)

    if last_action == 'Success':
        passed = passed + 1
        print("----------------")
        print("TEST SUCCESSFUL")
        print("----------------")
    else:
        failed = failed + 1
        failed_action.append(function + ' ' + param)
        print("----------------")
        print("TEST FAILED")
        print("----------------")


print("=================")
print("SUMMARY")
print("=================")

print("Total Passed:", passed)
print("Total Failed:", failed)

print("----------------")
print("FAILED ACTIONS")
print("----------------")

for action in failed_action:
    print action

close_browser()
