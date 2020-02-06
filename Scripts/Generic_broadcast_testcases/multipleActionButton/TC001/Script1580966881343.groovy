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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Broadcasts/open_broadcast'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/span_Create New Broadcast (5)'))
//
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/button_Create New Broadcast'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131-S'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/textarea_t'), 
    't')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/h6_ Add Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/input_Button Title_form-control'), 
    'google')

WebUI.delay(1)


WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_ Add Action'))

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Open website'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Open webview'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Unsubscribe from sequence'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Subscribe to sequence'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Set custom field'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Reply with a message'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Google Sheets'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/button_Hubspot'), 5)

