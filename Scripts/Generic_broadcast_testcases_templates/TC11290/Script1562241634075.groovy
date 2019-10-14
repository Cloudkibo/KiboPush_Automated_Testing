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
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h6_YouTube'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h3_Add Video from YouTube'))
WebUI.delay(2)
//WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/input_YouTube Link_form-control'), 
//    'https://www.youtube.com/watch?v=KhX4CfqRSrI')
//
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/div_New media component added'))

