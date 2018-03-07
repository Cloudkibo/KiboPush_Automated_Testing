import utils.mapper
import argparse
import utils.config
import utils.mapper

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

    args = parser.parse_args()
    if args.failed == args.passed == False:
        utils.config.test_failed = True
        utils.config.test_passed = True
    else:
        utils.config.test_failed = args.failed
        utils.config.test_passed = args.passed

    if args.categories != None:
        utils.config.categories = args.categories

    if args.user != None:
        utils.config.user_category = args.user

    utils.mapper.map_and_report()