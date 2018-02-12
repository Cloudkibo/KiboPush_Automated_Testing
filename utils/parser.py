from reader import get_test
import string
# Key = Language. Value = Action
# Check for the given language string in the step, and if it contains that string
# It assigns it the appropriate action

language_action = {

    "login": "login",
    "logout": "logout",
    "click on ": "click-",
    "collapse sidebar": "sidebar_hamburger",
    "expand sidebar": "sidebar_hamburger",
    "go to ": "sidebar-",
    "choose ": "choose-",
    "lands on webpage": "open_kibopush",
    "kibopush": "open_kibopush",
    "write ": "write-",
    "press enter": "enter",
    "upload ": "upload-",
    "select emoji": "select_emoji",
    "select emoticon": "select_emoji",
    "send gif": "send_gif",
    "send sticker": "send_sticker",
    "verify table": "verify_table",
    "table exists": "verify_table",
    "verify alert": "verify_alert",
    "remove channel": "remove_channel",
    "channel setting": "setting_channel",
    "download sample csv": "download_phone_csv",
    "download user csv": "download_user_csv",
    "add broadcast component ": "click-",
    "remove component ": "remove_broadcast_component",
    "click component ": "click_component-",
    "next image": "next_gallery",
    "previous image": "prev_gallery",
    "gallery page ": "gallery_upload-",
    "send all broadcasts": "send_broadcast_templates"

}


def get_param(action, step, language):
    if action[-1] != '-':
        return action
    else:
        # Gets the word after that language from the given step
        param = step[step.find(language) + len(language):]
        # Remove any punctuation
        if not 'write' in action:
        	param = param.translate(None, string.punctuation)
        # adding param to previous action
        action = action + param
        return action


def get_action(step):
    step = step.lower()
    action = "Not Defined"
    # To check for ambiguity, whether one step is translated to multiple action
    repeat = 0
    # print language_action.keys()
    for language in language_action.keys():
        if language in step:
            action = language_action[language]
            # For complex action with params
            action = get_param(action, step, language)
            repeat = repeat + 1
        if repeat > 1:
            action = "Ambigous"
    return action


def criteria(test):
    errors = ['Ambigous', 'Not Defined']
    for error in errors:
        if test[-1] == error:
            return False
    return True


def criteria_simple(test):
    errors = ['Ambigous', 'Not Defined']
    for error in errors:
        if test == error:
            return False
    return True


def remove_incomplete(all_test):
    pruned_list = [x for x in all_test if criteria(x)]
    return pruned_list


def parse_language():

    all_test, expected_result, row_number = get_test()
    print('======== PARSING TEST PLAN ========\n')
    unparsable = []
    ambigous = []
    test_actions = []
    test_case = []
    not_parsed = 0

    for index, case in enumerate(all_test):
        for step in case:
            if step == '':
                continue
            action = get_action(step)
            test_actions.append(action)
            if action == "Not Defined":
                expected_result[index] = "Not Defined"
                row_number[index] = "Not Defined"
                unparsable.append(step)
                not_parsed = not_parsed + 1
                break
            elif action == "Ambigous":
                expected_result[index] = "Ambigous"
                row_number[index] = "Ambigous"
                ambigous.append(step)
                not_parsed = not_parsed + 1
                break
        test_case.append(test_actions)
        test_actions = []

    print('Test Plan Parsed sucessfully')
    print("Total Cases : ", len(all_test))
    print("Not Parsed : ", not_parsed)
    print("UnParsed : ", unparsable)
    print("Ambigous:", ambigous)

    pruned_test = remove_incomplete(test_case)
    pruned_result = [x for x in expected_result if criteria_simple(x)]
    pruned_row = [x for x in row_number if criteria_simple(x)]

    print("Length of Pruned Test: ", len(pruned_test))
    print('\n')
    # print pruned_test

    return pruned_test, pruned_result, pruned_row


if __name__ == '__main__':
    parse_language()
