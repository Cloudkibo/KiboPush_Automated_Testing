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

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h6_Card'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/i_Landing Page Opt-In Message_fa fa-times fa-stack-2x'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/input_Landing Page Opt-In Message_form-control'), 
    'title')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/Card_Subtitle_textarea'), 'subtitle')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/a_Add Action'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Open a webview'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Message/input_Url_form-control (3)'), 'https://kiboengage.cloudkibo.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Done (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h6_ Add Button (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Add Share button'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Done (3)'))

WebUI.delay(2)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload Image'), img)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h4_KIBOPUSH'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/button_Save (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/div_Message has been saved (2)'))

