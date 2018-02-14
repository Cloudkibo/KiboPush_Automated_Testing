import csv

test_plan = 'test_plan_sample.csv'

def get_rows(row_number):

    with open('../'+test_plan, 'rb') as f:
        reader = csv.reader(f)
        for index, row in enumerate(reader):
            if index in row_number:
                #Ideally send each column separately, instead of row
                return row

def get_test():
    print('======== READING TEST PLAN ========\n')
    test_steps = []
    expected_results = []
    test_all = []
    row_number = []
    with open('../'+test_plan, 'rb') as f:
        reader = csv.reader(f)
        for index, row in enumerate(reader):

            # Skipping the Header
            if not index:
                continue
            elif row[3] == '':
                continue
            elif row[6] != 'Yes':
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
