import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

WebUI.navigateToUrl('https://skiboengage.cloudkibo.com/')

WebUI.navigateToUrl('https://saccounts.cloudkibo.com/?continue=https://skiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_CloudKibo/a_Login (6)'))

WebUI.setText(findTestObject('Page_CloudKibo/input_email (1)'), 'arveen@arveen.com')

WebUI.setEncryptedText(findTestObject('Page_CloudKibo/input_password (4)'), 'Sq3Tv/oKKfCfT8/WA5LKPA==')

WebUI.click(findTestObject('Page_CloudKibo/button_Sign In (12)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/h3_Dashboard (57)'))

WebUI.delay(3)

//WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasting (4)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasts (3)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Broadcast/span_Create New (3)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Broadcast/button_Create New Broadcast (2)'))
//
//WebUI.delay(2)
//
//WebUI.scrollToPosition(0, 0)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h3_Create Broadcast'))
//
