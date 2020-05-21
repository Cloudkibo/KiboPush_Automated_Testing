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

WebUI.callTestCase(findTestCase('Sponsor_Messaging_V2/TC064'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_ Add Button'))

WebUI.setText(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/input__form-control'),
	'test')
WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_Save'))

WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_ Add Button'))

WebUI.setText(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/input__form-control'),
	'test1')
WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_Save'))

WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_ Add Button'))

WebUI.setText(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/input__form-control'),
	'test2')
WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_Save'))

WebUI.delay(3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_ Add Button'), 5)

WebUI.scrollToPosition(0, 0)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/Page_KiboEngage  Create Sponsored Message/button_Save'))

WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Sponsored Messaging/h3_Manage Sponsored Messages'))

WebUI.delay(2)
