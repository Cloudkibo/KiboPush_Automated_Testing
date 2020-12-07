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

WebUI.callTestCase(findTestCase('chatBot_enhancement_testcases/TC002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/new_chatBot/Page_KiboChat  Configure ChatBot/button_Add Child'))

WebUI.setText(findTestObject('Object Repository/new_chatBot/Page_KiboChat  Configure ChatBot/input_Add Child_form-control m-input'), 
    'child1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/new_chatBot/Page_KiboChat  Configure ChatBot/button_Add'))

WebUI.click(findTestObject('Object Repository/new_chatBot/Page_KiboChat  Configure ChatBot/div_You can not create two children with same name'))

WebUI.callTestCase(findTestCase('chatBot_enhancement_testcases/backButton'), [:], FailureHandling.STOP_ON_FAILURE)
