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

//WebUI.callTestCase(findTestCase('Whatsapp/WhatsappAirLine ChatBot/open_automation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Whatsapp/WhatsappAirLine ChatBot/Go_to_Automation'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/input_FAQs URL (Optional)__faqs_url'),
	'https://kibopush.com/faqs/')

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/button_Save'))

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/div_WhatsApp chatbot updated successfully'))

WebUI.click(findTestObject('Object Repository/Airline_ChatBot/Page_KiboChat  WhatsApp Airlines Chatbot/span'))

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/span_chatbot published successfully'))

WebUI.click(findTestObject('Object Repository/Airline_ChatBot/Page_KiboChat  WhatsApp Airlines Chatbot/span'))

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/div_chatbot disabled successfully'))
