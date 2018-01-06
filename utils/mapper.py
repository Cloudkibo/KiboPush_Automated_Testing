from parser import parse_language
from steps import *


# . indicates parameter

action_step = {
    "login": login,
    "logout": logout,
    "click.": click_on,
    "sidebar_hamburger": sidebar_hamburger,
    "sidebar.": sidebar_click,
    "choose.": choose_select,
    "open_kibopush": open_kibopush
}

did_login = False

test_actions, expected_result = parse_language()
print('======== STARTING TEST ========\n')
for index, test_action in enumerate(test_actions):
    print('\n')
    print('======== TEST:', index+1, ' ========')
    print("Expected Result: ", expected_result[index])
    print('-------------------------------')
    for action in test_action:
        function = action
        if '.' in action:
            param = action.split('.')[-1]
            function = action.split('.')[0] + '.'
            print('Function called: ', action_step[function])
            print('Parameters:', param)
            action_step[function](param)
        else:
            if('login' in action):
                did_login = True
            print('Function called: ', action_step[function])
            action_step[function]()

    # To logout after every test
    if did_login:
        did_login = False
        print('Function called: logout')
        action_step['logout']()
