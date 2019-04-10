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

WebUI.click(findTestObject('Page_KiboEngage  Create Message/div_List'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/i_Landing Page Opt-In Message_fa fa-times fa-stack-2x (2)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/input_Landing Page Opt-In Message_form-control (2)'), 'title1')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/List Subtitle1 Text Area'), 'st1')

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/List Title 2'), 'Title2')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/List Subtitle2 Text Area'), 'st2')

WebUI.click(findTestObject('Page_KiboEngage  Create Message/a_Add Action (2)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/h7_Open a webview (3)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/input_Url_form-control (5)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Message/button_Done (5)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/a_Add Action_1'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/h7_Open a webview (3)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Message/input_Url_form-control (5)'), 'https://kiboengage.cloudkibo.com/')

WebUI.click(findTestObject('Page_KiboEngage  Create Message/button_Done (5)'))

WebUI.delay(2)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item1'), img)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h4_KIBOPUSH (1)'))

WebUI.delay(2)

String img2 = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item2'), img2)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Message/h4_KIBOPUSH (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/button_Save (4)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Message/div_Message has been saved (3)'))

