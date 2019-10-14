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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Landing Pages Test Cases/Open Create Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h6_Card (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/i_Landing Page Opt-In Message_fa fa-times fa-stack-2x (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/input_Landing Page Opt-In Message_form-control (1)'), 
    'title')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/Card_Subtitle_textarea (1)'), 'subtitle')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/a_Add Action (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Open a webview (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/input_Url_form-control (3) (1)'), 'https://kiboengage.cloudkibo.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Done (3) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h6_ Add Button (3) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Add Share button (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Done (3) (1)'))

WebUI.delay(2)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload Image'), img)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h4_KIBOPUSH (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Save (2) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Message has been saved (2) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/a_Edit Action'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/input_Url_form-control (4)'), 'https://skiboengage.cloudkibo.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Create Message/select_COMPACTTALLFULL (1)'), 
    'COMPACT', true)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Done (4)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Save (3)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Message has been saved (2) (1)'))

