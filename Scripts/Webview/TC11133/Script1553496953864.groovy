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

WebUI.callTestCase(findTestCase('Welcome Message TestCases/Open Welcome Message Edit Screen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/i_Welcome Message_fa fa-times fa-stack-2x'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/div_Card (1) (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/input_ Add Button_form-control (1) (1)'), 'title')

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/Card Subtitle TextArea (1) (1)'), 'subtitle')

WebUI.delay(2)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboEngage  Create Broadcast/Upload Image'), img)

WebUI.delay(8)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/h4_KIBOPUSH (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/a_Add Action (1) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/h7_Open a webview (4) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/input_Url_form-control (3) (1) (1)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/button_Done (3) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/h6_ Add Button (7) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/h7_Add Share button (1) (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/button_Done (3) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/button_Save (3) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/div_Message saved successfully (3) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/i_Welcome Message_fa fa-times fa-stack-2x'))

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/h6_Text'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/Text Text Area Post Card'), 'Hi {{user_full_name}}! Thanks for getting in touch with us on Messenger. Please send us any questions you may have')

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/button_Save (3) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Template/div_Message saved successfully (3) (1) (1)'))

