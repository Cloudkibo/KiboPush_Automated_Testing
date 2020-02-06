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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131-S'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/textarea_t'), 
    't')

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/button_action_function'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h6_ Add Button'))
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Button Title_form-control'),'google')
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h7_Open a website'))
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Open Website_form-control'),
//    'google.com')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_New text component added'))

