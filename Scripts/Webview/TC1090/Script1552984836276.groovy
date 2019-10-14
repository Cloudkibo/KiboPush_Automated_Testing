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

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasting (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Broadcasts'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/span_Create New'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Broadcast/button_Create New Broadcast (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/div_Card (1) (1) (2)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/input_Broadcast Title_form-control (1) (2)'), 
    'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/textarea_Broadcast Title_form-control (1) (2)'), 
    'subtitle')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h6_ Add Button (3) (1) (2)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/input_Button Title_form-control (5)'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h7_Open a webview (5)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/input_Url_form-control (4)'), 'https://kiboengage.cloudkibo.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/button_Done (2) (1) (2)'))

WebUI.delay(1)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/Upload Image (1) (2)'), img)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/h4_KIBOPUSH'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/button_Next (3) (1) (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/button_Send (2) (1) (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Sending broadcast You will be notified when it is sent (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/div_Conversation successfully sent (2) (1) (2)'))

