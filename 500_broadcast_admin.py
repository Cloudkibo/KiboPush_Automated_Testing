from utils.steps import *
from datetime import *
from time import sleep

open_kibopush()
login('admin')


def send_broadcast(num):
	print sidebar_click('broadcast')
	print click_on('create new broadcast')
	print click_on('create new broadcast')

	print click_on('text')
	print click_on('enter your text')
	print write('Sample Broadcast '+str(num))
	print click_on('next')
	print sleep(1)
	print click_on('send')
	print str(num) + " Completed"

a = datetime.now()
for x in range(0,500):	
	send_broadcast(x)

print a
print datetime.now()
