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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasting (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasts'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/span_Create New (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/button_Create New Broadcast (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/div_Text (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h6_ Add Button (1)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/input_Button Title_form-control (1)'), 
    'test')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h7_Open a webview (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/a_Whitelist url domains to open in-app browser'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  api_settings/span_Whitelist Domains'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Whitelist Domains/span_Whitelist Domains'))

