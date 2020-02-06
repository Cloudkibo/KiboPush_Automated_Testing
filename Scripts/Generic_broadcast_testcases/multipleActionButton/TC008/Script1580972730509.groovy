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

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/multipleActionButton/TC001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Reply with a message'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h7_Reply with a Message'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_New message will be created when you cl_b7acd5'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/i_Reply with a Message_la la-close'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h7_Reply with a Message'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_New message will be created when you cl_b7acd5'), 5)


