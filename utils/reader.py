import csv


def get_test():
    print('======== READING TEST PLAN ========\n')
    test_steps = []
    expected_results = []
    test_all = []
    with open('../test_plan.csv', 'rb') as f:
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

        for item in test_steps:
            single_test = item.split('\n')
            test_all.append(single_test)
        # print '-------------'
        # print test_all
        print('Test Plan read successfully\n')
        return test_all, expected_results


if __name__ == '__main__':
    get_test()
