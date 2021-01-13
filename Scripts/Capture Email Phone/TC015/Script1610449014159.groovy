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

WebUI.refresh()

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/LiveChat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Capture Email Phone/sessionClick'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Capture Email Phone/TC013'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Email_phoneNumber/Page_KiboChat  Live Chat/textarea_Please provide your phone number'), 
    'phone number')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Email_phoneNumber/Page_KiboChat  Live Chat/input'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Email_phoneNumber/Page_KiboChat  Live Chat/div_subscribers phone numberskip'))
WebUI.click(findTestObject('Object Repository/Email_phoneNumber/Page_KiboChat  Live Chat/button_Cancel'))

