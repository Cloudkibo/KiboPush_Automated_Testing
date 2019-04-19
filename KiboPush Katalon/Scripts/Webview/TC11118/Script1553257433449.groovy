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

WebUI.callTestCase(findTestCase('Persistent Menu/open_popover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Menu/input_Open a submenu_replyWithMessage (1) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Menu/a_Create Message (1) (1) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/div_List (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/input_Message_form-control (2) (1)'), 'title1')

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/input_Add Action_form-control (1)'), 'title2')

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/Subtitle_List_Item1 (1)'), 'subtitle1')

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/Subtitle_List_Item2 (1)'), 'Subtitle2')

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/a_Add Action (2) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/div_Open a webview (2) (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/input_Url_form-control (3) (1)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/button_Done (6) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/a_Add Action_1 (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/div_Open a webview (2) (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Menu/input_Url_form-control (3) (1)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/button_Done (6) (1)'))

WebUI.delay(1)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item1 (1)'), img)

WebUI.delay(10)

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/h4_KIBOPUSH (1) (1) (1)'))

WebUI.delay(2)

String img2 = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item2 (1)'), img2)

WebUI.delay(10)

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/h4_KIBOPUSH (1) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/a_Edit Action (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Create Menu/select_COMPACTTALLFULL (1)'), 'COMPACT', true)

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/button_Done (7)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/button_Save (5) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/div_Message Saved Successfully (6) (1)'))

