import csv
import gspread
from oauth2client.service_account import ServiceAccountCredentials
import config
test_plan = 'test_plan.csv'

def check_status(buyer, admin, agent, individual, status):
    if buyer == status or admin == status or agent == status or individual == status:
        return True
    else:
        return False


def get_csv_online():
    """Uses Gspread API to get latest sheet, and update"""
    test_plan_url = 'https://docs.google.com/spreadsheets/d/1lJ-dZOSxjuLS7MJJBFrWcZkkjVvpIGWV3MwWss0UT5E/edit#gid=738044569'

    credentials = ServiceAccountCredentials.from_json_keyfile_name(
        '.env/Automated-Testing-0784bdff48f1.json',
        ['https://spreadsheets.google.com/feeds'])
    client = gspread.authorize(credentials)

    sheet = client.open_by_url(test_plan_url)
    worksheet = sheet.get_worksheet(2)
    exported_csv = worksheet.export(format='csv')
    f = open('Test_Plan/' + test_plan, 'wb')
    f.write(exported_csv)
    f.close()


def get_rows(row_number):
    '''Returns category, description, steps and expected results of the provided list of row numbers'''
    with open('Test_Plan/' + test_plan, 'rb') as f:
        reader = csv.reader(f)
        category = []
        description = []
        steps = []
        expected_result = []
        row_no = []

        for index, row in enumerate(reader):
            if index in row_number:
                # Category, Description, Steps, Expected Result,
                category.append(row[1])
                description.append(row[2])
                steps.append(row[3])
                expected_result.append(row[4])
                row_no.append(index)

    return row_no, category, description, steps, expected_result


def get_test():
    try:
        get_csv_online()
        print('Fetched Latest CSV')
    except:
        print('Could not fetch latest CSV')

    print('======== READING TEST PLAN ========\n')
    test_steps = []
    expected_results = []
    test_all = []
    row_number = []
    with open('Test_Plan/' + test_plan, 'rb') as f:
        reader = csv.reader(f)

        filtered = True

        if config.test_failed and config.test_passed:
            filtered = False

        for index, row in enumerate(reader):

            # Skipping the Header
            if not index:
                continue
            elif row[3] == '':
                continue
            elif row[6] != 'Yes':
                continue
            elif config.categorized:
                if not row[1].lower() in config.categories:
                    continue
            elif filtered:
                if config.test_passed:
                    passing = check_status(row[8],row[9],row[10],row[11], 'Passed')
                    if not passing:
                        continue
                if config.test_failed:
                    failing = check_status(row[8],row[9],row[10],row[11], 'Failed')
                    if not failing:
                        continue

            test_steps.append(row[3])
            expected_results.append(row[4])
            row_number.append(index)

        for item in test_steps:
            single_test = item.split('\n')
            test_all.append(single_test)
        # print '-------------'
        # print test_all
        print('Test Plan read successfully\n')
        return test_all, expected_results, row_number


if __name__ == '__main__':
    get_test()
