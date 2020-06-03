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

WebUI.navigateToUrl('https://swlb.cloudkibo.com/')

WebUI.click(findTestObject('Object Repository/WLB/Page_WhatsApp Router/a_Login with Google'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in - Google Accounts/input_Enter your email_Email'), 'arveen@cloudkibo.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/input_Enter your email_signIn'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Google Accounts/input_Enter your password_Passwd'), 'Sq3Tv/oKKfDNGi1QgSywNA==')

WebUI.click(findTestObject('Object Repository/Page_Google Accounts/input_Enter your password_submit'))

//WebUI.click(findTestObject('Object Repository/Page_Request for Permission/button_Allow'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_Need help in understanding WLB Here is _a4fa14'))


