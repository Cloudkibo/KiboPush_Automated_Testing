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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
WebUI.callTestCase(findTestCase('Whatsapp/broadcast/TC11236'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)


//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h6_File'))

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h5_File'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/h3_Add File Component'))

WebUI.delay(2)
WebDriver driver = DriverFactory.getWebDriver()

WebElement upload = driver.findElement(By.xpath('//input[@type=\'file\']'))

String pdf_file = RunConfiguration.getProjectDir() + '/sample.pdf'

upload.sendKeys(pdf_file)

WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Next'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Send'))

WebUI.delay(2)
WebUI.verifyTextPresent('BROADCAST SENT SUCCESSFULLY', true)