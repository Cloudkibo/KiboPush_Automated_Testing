import csv

def get_test():
	test_steps = []
	test_all = []
	with open('../test_plan.csv', 'rb') as f:
		reader = csv.reader(f)
		for index,row in enumerate(reader):

			#Skipping the Header
			if not index:
				continue
			elif row[3]=='':
				continue

			test_steps.append(row[3])

		for item in test_steps:
			single_test = item.split('\n')
			test_all.append(single_test)
		print '-------------'
		print test_all

		return test_all

