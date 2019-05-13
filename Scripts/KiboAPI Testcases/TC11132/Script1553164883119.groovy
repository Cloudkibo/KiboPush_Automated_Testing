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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.delay(2)

String api_key = WebUI.getAttribute(findTestObject('Object Repository/Page_KiboAPI/input_API Key_key (1)'), 'value')

String secret_key = WebUI.getAttribute(findTestObject('Object Repository/Page_KiboAPI/input_API Secret_secret (1)'), 'value')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboAPI/span_Show_refreshButton'))

WebUI.delay(2)

String api_key_reset = WebUI.getAttribute(findTestObject('Page_KiboAPI/input_API Key_key'), 'value')

String secret_key_reset = WebUI.getAttribute(findTestObject('Page_KiboAPI/input_API Secret_secret (1)'), 'value')

if ((api_key != api_key_reset) && (secret_key != secret_key_reset)) {
    WebUI.verifyEqual('1', '1')
} else {
    WebUI.verifyEqual('1', '0')
}

