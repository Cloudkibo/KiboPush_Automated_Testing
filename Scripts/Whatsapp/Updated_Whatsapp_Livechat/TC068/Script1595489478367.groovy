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

WebUI.callTestCase(findTestCase('Whatsapp/Updated_Whatsapp_Livechat/go to live chat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/button_Send_m-portlet__nav-link btn btn-lg _365529'))

WebUI.click(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/h5_Send Message Template to WhatsApp Number'))

WebUI.setText(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/input_WhatsApp Number_form-control border-danger'), 
    '+923403630780')

WebUI.setText(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/textarea_Hi 1Thank you for contacting 2Plea_a06bd3'), 
    'nothing')
WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/button_Send'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Whatsp_chat/Page_KiboChat  Dashboard/button_Cancel'))


