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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Broadcast/span_Create New Broadcast'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/a_Create New Broadcast'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast/div_Card (3) (1)'))

WebUI.delay(1)

WebDriver driver = DriverFactory.getWebDriver()

WebElement upload = driver.findElement(By.xpath('//input[@type=\'file\']'))

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

upload.sendKeys(img)

WebUI.delay(5)

WebElement image_popup = driver.findElement(By.xpath('/html/body/div[5]/div/div[2]/div/a'))

image_popup.click()
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast/input_form-control (4) (1)'), 'Card Title')

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast/textarea_form-control'), 'Card Subtitle')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast/button_Next (4) (1)'))
WebUI.delay(1)

WebUI.verifyTextPresent('CARD MUST HAVE AT LEAST ONE BUTTON.', false)


