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

WebUI.callTestCase(findTestCase('SMS/SMSPlatform'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasting (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasts'))

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/h3_Broadcasts (1) (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/span_Create New (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/button_Create New Broadcast (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/input_Push Message_form-control m-input (1) (1) (1) (1) (1) (1)'), 
    'faizan')

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/textarea_Automated testing (1) (1)'), 'Automated testing')

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Broadcasts/select_Select Conditionnamenumber (2) (1) (1)'), 'number', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with (2) (1) (1)'), 
    'is', true)

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/input_Value_text (2) (1) (1)'), '+923333739566')

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/button_ Add Condition'))

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Broadcasts/select_Select Conditionnamenumber (3)'), 'name', true)

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with (3)'), 
    'contains', true)

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/input_Remove_text'), 'Fa')

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/span_Send (6)'))

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/div_Broadcast sent successfully (1)'))

