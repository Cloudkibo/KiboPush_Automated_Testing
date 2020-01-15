import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/user_input/TC0001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/textarea_Question 1 for User_form-control'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/select_Select a Reply TypeTextNumberEmailPh_d1a2b6'), 
    'text', true)

WebUI.click(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/h6_ Add Action'))

WebUI.click(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/h7_Custom Fields'))

WebUI.click(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/h6_Assign User Responses to Custom Fields'))

WebUI.delay(5)
//WebUI.selectOptionByValue(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/select_Select a Custom Fieldcitydobfefe'), 
//    '5c7e527d90c12d2af1a2a8fc', true)
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> rows_table1 = driver.findElements(By.xpath('//*[@id="ActionModal"]/div/div/div/div[3]/div[2]/div/div[3]/div/div/select/option'))
 
 println(rows_table1.size())
 
 rows_table1[1].click()

WebUI.click(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/button_Save'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/user_input/Page_KiboEngage  Create Broadcast/div_New User Input component added'))

