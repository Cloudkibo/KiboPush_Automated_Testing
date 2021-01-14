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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kibochat'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('BigCommerceForMessenger/open_automation'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('BigCommerceForMessenger/chatBot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  ChatBot Automation/div_Test5'))
//
//WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  Commerce Chatbot for Test5/h3_Commerce Chatbot for Test5'))
WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot Analytics/button_Back'))

WebUI.click(findTestObject('Object Repository/new_chatBot/Page_KiboChat  ChatBot Automation/h3_Chatbot Automation'))

