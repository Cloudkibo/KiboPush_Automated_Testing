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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kibochat.cloudkibo.com/')

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=https://kibochat.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/Page_CloudKibo/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_CloudKibo/input_Sign In_email'), 'faizan@cloudkibo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CloudKibo/input_Sign In_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_CloudKibo/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Dashboard/h3_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Dashboard/span_Automation'))

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Dashboard/span_Chatbot Automation'))

WebUI.click(findTestObject('Object Repository/Page_KiboChat  ChatBot Automation/span'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/pageValue'), '5cbb7da7107ea274a7dcf902', 
    false)

WebUI.click(findTestObject('Object Repository/Page_KiboChat  ChatBot Automation/button_Create'))

