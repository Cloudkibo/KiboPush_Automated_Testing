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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Broadcasts/open_broadcast'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/span_Create New Broadcast'))
//
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/button_Create New Broadcast'))

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131-S'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/textarea_t'), 
    'testing')

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h6_ Add Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Button Title_form-control'), 
    'google')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/h7_Hubspot (1)'))

WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/h6_Submit data to a form'))

WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/h6_HubSpot Submit data to a form'))

WebUI.selectOptionByValue(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/select_Select a HubSpot Formtesting_hubspot'), 
    'a6b78d00-0508-4d8b-9e84-466fab533a52', true)

WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/select_field_1'))

WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/select_field_2'))
WebUI.click(findTestObject('Object Repository/hubpost/Page_KiboEngage  Create Broadcast/button_Save'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_New text component added'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Next'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Send'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/div_Conversation successfully sent'))


