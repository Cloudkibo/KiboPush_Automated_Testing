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

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Growth Tools (3) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Landing Pages (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Landing Pages/span_Create New'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Landing Pages/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Landing Page/a_Opt-In Actions'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Landing Page/a_Next_btn btn-circle btn-icon-only btn-default m-input-icon__icon m-input-icon__icon--right'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/h3_Landing Page Opt-In Message (1)'))

