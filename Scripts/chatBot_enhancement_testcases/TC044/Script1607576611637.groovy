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

WebUI.callTestCase(findTestCase('chatBot_enhancement_testcases/TC042'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/messenger_UI/Page_KiboChat  Configure ChatBot/input_Title_form-control'), 
    'title1')

WebUI.verifyElementClickable(findTestObject('Object Repository/messenger_chatbot/Page_KiboChat  Configure ChatBot/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/messenger_chatbot/Page_KiboChat  Configure ChatBot/Page_KiboChat  Configure ChatBot/button_'))

WebUI.click(findTestObject('Object Repository/messenger_chatbot/Page_KiboChat  Configure ChatBot/button_Yes'))

//WebUI.click(findTestObject('Object Repository/messenger_chatbot/Page_KiboChat  Configure ChatBot/button_Cancel'))

//WebUI.click(findTestObject('Object Repository/messenger_chatbot/Page_KiboChat  Configure ChatBot/button_Next'))