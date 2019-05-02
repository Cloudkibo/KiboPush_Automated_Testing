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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasting (1) (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasts (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/span_Create New'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/button_Create New Broadcast (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_List (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/input_Broadcast Title_form-control (2)'), 'Title1')

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/TextArea-ListItem1'), 'SubTitle1')

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/Input_Add_Title_Item_2'), 'title2')

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/TextArea_ListItem2'), 'Subtitle2')

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/a_Add Action (3)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Open a webview (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/input_Url_form-control (7)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/button_Done (6)'))

WebUI.delay(2)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item1'), img)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/h4_KIBOPUSH'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/a_Add Action_1 (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/h7_Open a webview (9)'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/input_Url_form-control (7)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/button_Done (6)'))

String img2 = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload_Image_List_Item2'), img2)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/h4_KIBOPUSH'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/button_Next (4)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/button_Send (3)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Sending broadcast You will be notified when it is sent (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Conversation successfully sent (3)'))

