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

WebUI.callTestCase(findTestCase('Webview/TC11126'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Message/a_Edit Action (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/input_Url_form-control (6)'), 'https://skiboengage.cloudkibo.com')

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Create Message/select_COMPACTTALLFULL (2)'), 'COMPACT', true)

WebUI.click(findTestObject('Page_KiboEngage  Create Message/button_Done (6)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/button_Save (4)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Create Message/div_Message has been saved (3)'))

