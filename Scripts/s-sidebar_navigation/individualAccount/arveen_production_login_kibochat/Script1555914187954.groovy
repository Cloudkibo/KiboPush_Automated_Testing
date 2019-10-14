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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kibochat.cloudkibo.com/')

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=https://kibochat.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboPush/a_Login (10)'))

WebUI.setText(findTestObject('Page_KiboPush/input_email (10) (1) (1)'), 'individual@cloudkibo.com')

WebUI.setEncryptedText(findTestObject('Page_CloudKibo/input_Sign In_password (7)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Page_KiboPush/button_Sign In (11)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/h3_Dashboard (58)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/a_SMS (2)'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Messenger'))
WebUI.delay(2)

