import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Whatsapp/ChatBot/TC002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/button_Add Child'))

WebUI.setText(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/input_Add Child_form-control m-input'), 
    'child1')

WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/button_Add'))

WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/div_Saved successfully'))

WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  WhatsApp Commerce Chatbot/Page_KiboChat  Configure ChatBot/span_child1'))

WebUI.setText(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/textarea_Text__chatbot_message_area_text_input'),
	'child1')
WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Whatsp_chatBot/Page_KiboChat  Configure ChatBot/div_Saved successfully'))


WebUI.callTestCase(findTestCase('Whatsapp/ChatBot/back_button'), [:], FailureHandling.STOP_ON_FAILURE)

