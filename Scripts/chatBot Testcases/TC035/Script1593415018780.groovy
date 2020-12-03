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

WebUI.callTestCase(findTestCase('chatBot Testcases/MainPage'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Analytics'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/h3_Thar needs halp Chat Bot Analytics'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Times bot started using triggers_m-p_c8d8ae'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Test Chatbot_m-portlet__nav-link btn_841cec'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/span_Welcome'))


WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/button_Disable'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/div_Bot disbabled successfully'))