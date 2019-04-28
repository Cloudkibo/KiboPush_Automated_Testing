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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.kibopush.com/')

WebUI.click(findTestObject('Page_KiboPush  Sign In/a_Login'))

WebUI.click(findTestObject('Page_KiboPush  Sign In/button_Team Account'))

WebUI.setText(findTestObject('Page_KiboPush  Sign In/input_form-control m-input'), 'kibopush.com')

WebUI.setText(findTestObject('Page_KiboPush  Sign In/input_form-control m-input_1'), 'bjafri5@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_KiboPush  Sign In/input_form-control m-input_2'), 'enuyVqMnQm89k6F/ESuVQA==')

WebUI.click(findTestObject('Page_KiboPush  Sign In/button_Sign In'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Broadcasts'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/button_Create New Broadcast'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/a_Create New Broadcast'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/div_Image (1)'))

WebUI.delay(1)

WebDriver driver = DriverFactory.getWebDriver()

WebElement upload = driver.findElement(By.xpath('//input[@type=\'file\']'))

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

upload.sendKeys(img)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KiboPush  Create Broadcast/img'), 10)

WebUI.closeBrowser()

