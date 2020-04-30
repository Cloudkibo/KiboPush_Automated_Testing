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

WebUI.delay(1)
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC11290'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/simplify_broadcast/Page_KiboEngage  Create Broadcast/input_YouTube_facebook'))

WebUI.delay(2)
//WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_YouTube Link_form-control'),
//	'https://www.facebook.com/gnnhd.tv/videos/225323292030997/')
WebUI.setText(findTestObject('Object Repository/simplify_broadcast/Page_KiboEngage  Create Broadcast/input_Please enter a valid YouTube video li_a7b52c'),
	'https://www.facebook.com/gnnhd.tv/videos')
WebUI.delay(15)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.click(findTestObject('Object Repository/simplify_broadcast/Page_KiboEngage  Create Broadcast/button_'))
WebUI.click(findTestObject('Object Repository/simplify_broadcast/Page_KiboEngage  Create Broadcast/button_Yes'))
WebUI.delay(2)