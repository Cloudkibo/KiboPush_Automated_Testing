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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('chatBot Testcases/MainPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/span_child1'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/i_child1__chatbot_message_area_header_edit_title'))


WebUI.setText(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/input_Backup__chatbot_message_area_header_t_cae3de'), 
    'child3')

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Backup__chatbot_message_area_header__8276c4'))

WebUI.verifyTextPresent('child3', false)

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/i_child1__chatbot_message_area_header_edit_title'))

WebUI.setText(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/input_Backup__chatbot_message_area_header_t_cae3de'),
	'child1')

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Backup__chatbot_message_area_header__8276c4'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/span_Save'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/div_Saved successfully'))

WebUI.callTestCase(findTestCase('chatBot Testcases/backFunction'), [:], FailureHandling.STOP_ON_FAILURE)

