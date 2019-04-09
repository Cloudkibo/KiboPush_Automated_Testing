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

WebUI.callTestCase(findTestCase('Persistent Menu/open_popover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Menu/input_Reply with a message_ope (4) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/h7_Open a webview (2) (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Menu/input_Url_form-control (2) (1) (1)'), 'https://kiboengage.cloudkibo.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/button_Done (2) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/button_Save Menu (2) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/div_Menu saved successfully (2) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/Open_Popover_Edit (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Menu/select_COMPACTTALLFULL (1)'), 'COMPACT', 
    true)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/button_Done (3) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/button_Save Menu (3) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/div_Menu saved successfully (3) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Menu/button_Remove Main Menu'))

