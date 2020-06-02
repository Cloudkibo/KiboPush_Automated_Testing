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

WebUI.setText(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/input_welcome_react-select-2-input'), 
    'ok')

WebUI.sendKeys(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/input_welcome_react-select-2-input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/path'))
WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/span_Save'))

WebUI.click(findTestObject('Object Repository/chatbot/Page_KiboChat  Configure ChatBot/div_Saved successfully'))

WebUI.callTestCase(findTestCase('chatBot Testcases/backFunction'), [:], FailureHandling.STOP_ON_FAILURE)

