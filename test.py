import utils.mapper
import argparse
import utils.config
import utils.mapper
from utils.steps import *
import utils.reporter


def interact():
	import code
	code.InteractiveConsole(locals=globals()).interact()

if __name__ == "__main__":
    parser = argparse.ArgumentParser()

    parser.add_argument("-f", "--failed", action="store_true",
                        help="Runs only previously failed tests in Test Plan")

    parser.add_argument("-p", "--passed", action="store_true",
                        help="Runs only previously passed tests in Test Plan")

    parser.add_argument("-c", "--categories", type=str.lower, choices=utils.config.categories,
                        nargs='+', help="Specifies what categories to test on")

    parser.add_argument("-u", "--user", type=str.lower, choices=utils.config.user_category,
                        nargs='+', help="Specifies whatuser to test on")

    parser.add_argument("-d", "--debug", action="store_true",
                        help="Runs the script in debug mode to try different functions")

    parser.add_argument("-s", "--server", type=str.lower, choices=['production','staging'],
                        help="Runs the script in the specified server")

    args = parser.parse_args()

    if args.debug:
    	interact()

    if args.failed == args.passed == False:
        utils.config.test_failed = True
        utils.config.test_passed = True
    else:
        utils.config.test_failed = args.failed
        utils.config.test_passed = args.passed

    if args.categories != None:
        utils.config.categories = args.categories
        utils.config.categorized = True

    if args.user != None:
        utils.config.user_category = args.user
    else:
    	utils.config.user_category = ['buyer', 'admin', 'agent', 'individual']

    if args.server != None and args.server == 'production':
        utils.config.change_account(args.server);

    utils.config.print_config()
    
    test_status, summary = utils.mapper.mapping()
    utils.reporter.gather_report(test_status,summary)
