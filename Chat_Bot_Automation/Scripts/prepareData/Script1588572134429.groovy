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

def Excelsheet = findTestData('Data Files/Data')

def data = Excelsheet.allData

println(data.size())

//WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_ Add'))
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Title_form-control m-input'), 'test')
//
//WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/span'))
//
//
////WebUI.setText(findTestObject('Object Repository/Page_KiboChat  ChatBot Automation/blockOption'), 'Welcome')
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Select_react-select-3-input'), Keys.chord('welcome',Keys.ENTER))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_Save'))
//
