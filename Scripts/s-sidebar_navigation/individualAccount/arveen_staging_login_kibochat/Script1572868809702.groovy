import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://skibochat.cloudkibo.com/')

WebUI.navigateToUrl('https://saccounts.cloudkibo.com/?continue=https://skibochat.cloudkibo.com')

WebUI.navigateToUrl('https://saccounts.cloudkibo.com/?continue=https://skibochat.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/livechat_test/Page_CloudKibo/a_Login'))

WebUI.setText(findTestObject('Object Repository/livechat_test/Page_CloudKibo/input_Sign In_email'), 'individual@cloudkibo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/livechat_test/Page_CloudKibo/input_Sign In_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/livechat_test/Page_CloudKibo/button_Sign In'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/livechat_test/Page_KiboChat  Dashboard/h3_Dashboard'))

WebUI.delay(3)