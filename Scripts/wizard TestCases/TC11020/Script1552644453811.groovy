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

WebUI.callTestCase(findTestCase('wizard TestCases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_cloudkibo (9)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Setup Using Wizard (7) (6)'))

WebUI.click(findTestObject('Page_KiboPush  Add Pages/a_Continue (7) (1) (6)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Getting Started/div_4Autoposting Feeds'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Getting Started/span_4'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/h3_Step 4 Autoposting Feeds'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login-KiboChat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_cloudkibo (9)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Setup Using Wizard (7) (6)'))

WebUI.click(findTestObject('Page_KiboPush  Add Pages/a_Continue (7) (1) (6)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Getting Started/span_5'))

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Response Methods/h3_Step 5 Live Chat Response Methods'))

