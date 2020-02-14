import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kiboengage.cloudkibo.com/')

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=https://kiboengage.cloudkibo.com')

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_CloudKibo/a_Login'))

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_CloudKibo/input_email'), 'individual@cloudkibo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/broadcast_test_cases_new/Page_CloudKibo/input_password (3)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_CloudKibo/button_Sign In (3)'))

WebUI.navigateToUrl('https://kiboengage.cloudkibo.com/')

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Dashboard/span_Dashboard'))

WebUI.selectOptionByValue(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Operational Dashboard/select_Filter by LocaleALLEnglish UNITED ST_7d80dd'), 
    'en_US', true)

