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

WebUI.callTestCase(findTestCase('Autopost_RSS_FEED/0001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/input_RSS Feed Url_form-control'), 
    'https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/button_Add RSS Feed'))

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/div_Failed to craete autoposting'))
WebUI.verifyTextPresent('FAILED TO CRAETE AUTOPOSTING', true)
