//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import internal.GlobalVariable as GlobalVariable
//import org.openqa.selenium.By as By
//import org.openqa.selenium.WebDriver as WebDriver
//import org.openqa.selenium.WebElement as WebElement
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//
//WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Dashboard'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Settings'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Page_KiboEngage  Api Settings/a_Configuration (1) (1) (2)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Api Settings/span_Configuration (1) (1) (2)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Api Settings/button_Edit (1) (2)'))
//
//WebUI.click(findTestObject('Page_KiboEngage  Api Settings/h3_Connect with Twilio (1) (2)'))
//
//WebUI.delay(10)
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement sid = driver.findElement(By.xpath('/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/input'))
//
//sid.clear()
//
//sid.sendKeys('a')
//
//WebElement token = driver.findElement(By.xpath('/html/body/div[2]/div/div[2]/div/div/div[1]/div[2]/input'))
//
//token.clear()
//
//token.sendKeys('a')
//
//WebUI.delay(10)
//
//WebUI.click(findTestObject('Page_KiboEngage  Api Settings/button_Submit (2)'))
//
////WebUI.click(findTestObject('Page_KiboEngage  Api Settings/div_Twilio account not found Please enter correct details (2)'))
//
