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

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/i_Media_fa fa-pencil-square-o'))

//WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/h6_ Add Button (7)'))
//
////WebUI.delay(2)
////WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/h7_Add Share button'))
////
WebUI.delay(1)

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/button_action_function'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.verifyTextPresent('TEXT COMPONENT EDITED', false)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

