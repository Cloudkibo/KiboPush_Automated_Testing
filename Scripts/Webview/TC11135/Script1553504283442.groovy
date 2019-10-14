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

WebUI.callTestCase(findTestCase('Welcome Message TestCases/Open Welcome Message Edit Screen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/i_Welcome Message_fa fa-times fa-stack-2x (2) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h6_List'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Edit Template/input_Welcome Message_form-control'), 'title1')

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/List Item2 Title'), 'title2')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/a_Add Action (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h7_Open a webview (5)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Edit Template/input_Url_form-control (5)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/button_Done (5)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/a_Add Action_1'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h7_Open a webview (5)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Edit Template/input_Url_form-control (5)'), 'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/button_Done (5)'))

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/List Item1 Subtitle'), '1')

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/List Item2 Subtitle'), '2')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/button_Save (5)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/div_Message saved successfully (5)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/i_Welcome Message_fa fa-times fa-stack-2x (3)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h6_Text (2)'))

WebUI.setText(findTestObject('Page_KiboEngage  Edit Template/Text Text Area Post Card'), 'Hi {{user_full_name}}! Thanks for getting in touch with us on Messenger. Please send us any questions you may have')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/button_Save (5)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/div_Message saved successfully (5)'))

