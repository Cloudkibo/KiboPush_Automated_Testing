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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
WebUI.callTestCase(findTestCase('Sponsor_Messaging_V2/TC057'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/label_Text and Image'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement upload = driver.findElement(By.xpath('//input[@type=\'file\']'))

String image = RunConfiguration.getProjectDir() + '/sample.jpg'

upload.sendKeys(image)

WebUI.delay(10)

//WebUI.setText(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/input_Image title_form-control m-input'), 
//    'title')
//
//WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/h6_title'))
//
//WebUI.setText(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/input_Image subtitle (optional)_form-contro_adeaa4'), 
//    'subtitle')
//
//WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Create Sponsored Message/p_subtitle'))

