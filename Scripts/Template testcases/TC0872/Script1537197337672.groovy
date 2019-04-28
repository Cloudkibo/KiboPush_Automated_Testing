import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Template testcases/TC0871'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/input_form-control'), 'hi')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/textarea_form-control'), 'bye')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Survey/button_Add Questions'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/input_form-control_1'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/input_form-control input-sm'), '1')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/input_form-control input-sm_1'), '2')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Survey/input_form-control input-sm_2'), '3')

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = driver.findElement(By.xpath('//*[@id="desc"]/div/div/span/span[1]/span/ul/li/input'))

element.click()

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/li_Customer Behavior'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Survey/button_Create Survey'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Survey/h3_Templates'))

