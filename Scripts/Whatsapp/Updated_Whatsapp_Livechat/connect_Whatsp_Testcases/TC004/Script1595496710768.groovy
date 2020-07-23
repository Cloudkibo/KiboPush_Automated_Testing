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

WebUI.callTestCase(findTestCase('Whatsapp/Updated_Whatsapp_Livechat/connect_Whatsp_Testcases/RedirectTowhtspScreen'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/button_Connect'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/h5_Connect with FlockSend WhatsApp'))

WebUI.setText(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/input_FlockSend Access Token_form-control'), 
    '5ef497d3f5ced46d5016a442')

WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/button_Submit'))

WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/div_Invalid Number'))


WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/button_'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/connect_whastp/Page_KiboPush  api_settings/h3_Settings'))
