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
    try:
        driver.get('https://staging.kibopush.com/')
    except Exception, e:
        return "Error: " + str(e)
    return "Success"

def login(user='mike_vrhkeqg_repeatuser@tfbnw.net', pw='kibo54321'):
    try:
        login_button = driver.find_element_by_class_name('btn-brand')
        login_button.click()
        time.sleep(WAIT_TIME)
        if ('facebook' in str(driver.current_url)):
            email = driver.find_element_by_id('email')
            password = driver.find_element_by_id('pass')
            login = driver.find_element_by_id('loginbutton')
            email.send_keys(user)
            password.send_keys(pw)
            login.click()
    except Exception, e:
        return "Error: " + str(e)
    return "Success"


def click_on(name, scope=driver):
    try:
        name = name.lower()
        elements = scope.find_elements_by_xpath("//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '%s') or contains(translate(@placeholder, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '%s')]" % (name, name))
        for element in elements:
            if element.is_displayed():
                driver.execute_script("arguments[0].click();", element)
                break
    except Exception, e:
        return "Error: " + str(e)
    return "Success"

def press_enter():
    try:
        focused_element = driver.switch_to.active_element
        focused_element.send_keys(Keys.ENTER)
    except Exception, e:
        return "Error: " + str(e)
    return "Success"

def logout():
    try:
        user_pic = driver.find_element_by_class_name('m-topbar__userpic')
        user_pic.click()
        click_on('Logout')
    except Exception, e:
        return "Error: " + str(e)
    return "Success"


def sidebar_hamburger():
    try:
        sidebar_hamburger = driver.find_element_by_id('m_aside_left_minimize_toggle')
        sidebar_hamburger.click()
    except Exception, e:
        return "Error: " + str(e)
    return "Success"
        

def sidebar_click(sidebar_item):
    try:
        sidebar = driver.find_element_by_class_name('m-menu__nav')
        click_on(sidebar_item, scope=sidebar)
    except Exception, e:
        return "Error: " + str(e)
    return "Success"

def write(text):
    try:
        focused_element = driver.switch_to.active_element
        focused_element.send_keys(text)
    except Exception, e:
        return "Error: " + str(e)
    return "Success"

def choose_select(select_label, select_item=None):
    try:
        if select_item is not None:
            label = driver.find_element_by_xpath("//*[contains(text(), '%s')]" % select_label)
            label_parent = label.find_element_by_xpath("..")
            select = label_parent.find_element_by_tag_name('select')
            select.click()
            click_on(select_item, scope=select)
    except Exception, e:
         return "Error: " + str(e)
    return "Success"

# def livechat_attachment():
#     try:
#         attachment = driver.find_element_by_xpath('//*[@data-tip="attachments"]')
#         attachment.send_keys("sample.jpg")
#     except Exception, e:
#          return "Error: " + str(e)
#     return "Success"


def add_broadcast_component(component_name):
    try:
        click_on(component_name)
    except Exception, e:
         return "Error: " + str(e)
    return "Success"



    
if __name__ == "__main__":
    try:
        print(open_kibopush())
        time.sleep(WAIT_TIME)
        print('login')
        print(login('mike_vrhkeqg_repeatuser@tfbnw.net', 'kibo54321'))
        time.sleep(WAIT_TIME)
        print('going to Live Chat')
        print(sidebar_click('live chat'))
        time.sleep(WAIT_TIME)
        print(click_on("type here"))
        print(write('hey'))
        print(press_enter())
        time.sleep(WAIT_TIME)
    finally:
        driver.close()