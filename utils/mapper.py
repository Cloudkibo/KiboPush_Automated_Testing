from parser import parse_language
from steps import *


action_step = {

    "login": login,
    "logout": logout,
    "click_": "click",
    "collapse sidebar": "sidebar_hamburger",
    "expand sidebar": "sidebar_hamburger",
    "go to ": "sidebar_",
    "choose ": "choose_",
    "lands on webpage": "open_kibopush"
}


test_action = parse_language()

for action in test_action:
	param = ''
	function = action
	if '_' in action:
		param = action.split('_')[-1]
		function = action.split('_')[0]
	action_step[action](param)