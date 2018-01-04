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


test_actions = parse_language()
for test_action in test_actions:
    for action in test_action:
        function = action
        if '.' in action:
            param = action.split('.')[-1]
            function = action.split('.')[0] + '.'
            print('Function called: ', action_step[function])
            print('Parameters:', param)
            action_step[function](param)
        else:
            print('Function called: ', action_step[function])
            action_step[function]()
    print('Function called: logout')
    action_step['logout']()
