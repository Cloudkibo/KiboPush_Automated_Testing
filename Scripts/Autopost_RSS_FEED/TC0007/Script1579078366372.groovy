import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Autopost_RSS_FEED/TC0006'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/button_Save (1)'))

WebUI.setText(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/input_Rss Feed Url_form-control m-input (1)'), 
    'https://feeds.a.dj.com/rss/WSJcomUSBusiness.xml')

//WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/input_Rss Feed Title_form-control m-input'))
WebUI.setText(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/input_Rss Feed Title_form-control m-input (1)'), 
    'Rss Feed')

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/div_Rss feed saved successfully (1)'))

WebUI.setText(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/input_Rss Feed Url_form-control m-input (1)'), 
    'https://kiboengage.cloudkibo.com/')

WebUI.setText(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/input_Rss Feed Title_form-control m-input (1)'), 
    'Rss Feed1')


WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/span_Please enter a valid Rss feed url'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/RSS_Feed/Page_ Rss Feeds/button_Save (1)'))
