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

WebUI.callTestCase(findTestCase('Manual_Integeration/TC0001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Update Stories'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Manual_integeration/Page_ News Section/button_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/span_Please enter a valid website link'))

WebUI.setText(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/input_Story 1 URL_form-control m-input'), 
    'https://www.google.com/')

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/span_Link is valid'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Add More'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/i_Please enter a valid website link_fa fa-close'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Save'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/div_Feed has been updated successfully'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Back'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/h3_News Integration'))