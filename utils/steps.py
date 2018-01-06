from selenium import webdriver
import unicodecsv as csv
import platform
import time
from selenium.webdriver.common.keys import Keys

chrome_options = webdriver.ChromeOptions()
prefs = {"profile.default_content_setting_values.notifications" : 2}
chrome_options.add_experimental_option("prefs",prefs)

if platform.system() == 'Darwin':
    driver = webdriver.Chrome('../driver/macos/chromedriver', chrome_options=chrome_options)
elif platform.system() == 'Linux':
    driver = webdriver.Chrome('../driver/linux/chromedriver', chrome_options=chrome_options)
elif platform.system() == 'Windows':
    driver = webdriver.Chrome('../driver/windows/chromedriver.exe', chrome_options=chrome_options)

WAIT_TIME = 5 # number of seconds to wait after clicking something
# user='maria_rdhorxy_zerosub@tfbnw.net ', pw='cloudkibo123'

def open_kibopush():
    driver.get('https://staging.kibopush.com/')

def login(user='mike_vrhkeqg_repeatuser@tfbnw.net', pw='kibo54321'):
    login_button = driver.find_element_by_class_name('btn-brand')
    login_button.click()
    time.sleep(WAIT_TIME)
    email = driver.find_element_by_id('email')
    password = driver.find_element_by_id('pass')
    login = driver.find_element_by_id('loginbutton')
    email.send_keys(user)
    password.send_keys(pw)
    login.click()

def click_on(name):
    name = name.lower()
    element = driver.find_element_by_xpath("//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '%s')]" % name)
    element.click()

def logout():
    user_pic = driver.find_element_by_class_name('m-topbar__userpic')
    user_pic.click()
    click_on('Logout')


def sidebar_hamburger():
    sidebar_hamburger = driver.find_element_by_id('m_aside_left_minimize_toggle')
    sidebar_hamburger.click()

def sidebar_click(sidebar_item):
    sidebar = driver.find_element_by_class_name('m-menu__nav')
    sidebar_element = sidebar.find_element_by_xpath("//*[contains(text(), '%s')]" % sidebar_item)
    sidebar_element.click()

def choose_select(select_label, select_item):
    label = driver.find_element_by_xpath("//*[contains(text(), '%s')]" % select_label)
    label_parent = label.find_element_by_xpath("..")
    select = label_parent.find_element_by_tag_name('select')
    select.click()
    item = select.find_element_by_xpath("//*[contains(text(), '%s')]" % select_item)
    item.click()

def add_broadcast_component(component_name):
    click_on(component_name)


    
if __name__ == "__main__":
    try:
        open_kibopush()
        time.sleep(WAIT_TIME)
        login('mike_vrhkeqg_repeatuser@tfbnw.net', 'kibo54321')
        time.sleep(WAIT_TIME)
        sidebar_click('Subscribe to Messenger')
        time.sleep(WAIT_TIME)
        choose_select('Choose Page', 'Test 2')
        time.sleep(WAIT_TIME)
    finally:
        driver.close()