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

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Automation'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Sequence Messaging'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Sequence/button_Create New Sequence'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Sequence/input_Sequence Name_form-control'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Sequence/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Sequence/button_Add Message'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Sequence/div_New MessageTriggerNone -- EditScheduleAfter 1 day(s) -- EditSegmentNone -- Edit0Sent0Seen0Clicked'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Sequence/span_New Message'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Sequence Message/div_Text'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Sequence Message/h6_ Add Button'))
WebUI.verifyTextNotPresent(' Open a webview', false)
