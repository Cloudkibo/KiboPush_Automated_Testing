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

WebUI.callTestCase(findTestCase('Whatsapp/WhatsappBigCommerce/Go_to_Automation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot/span_Analytics'))

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot Analytics/h3_Commerce Chatbot Analytics'))

WebUI.click(findTestObject('Object Repository/bigCommerceChatBot/Page_KiboChat  WhatsApp Commerce Chatbot Analytics/button_Back'))

WebUI.click(findTestObject('Object Repository/commerce_chatBOt/Page_KiboChat  WhatsApp Commerce Chatbot/h3_WhatsApp Commerce Chatbot'))
WebUI.delay(2)