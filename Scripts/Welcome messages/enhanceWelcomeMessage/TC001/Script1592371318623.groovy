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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Faizan_production_login_kibochat'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Welcome messages/open Manage Pages'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Welcome Messages'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Welcome Message/button_Edit Message'))
WebUI.delay(3)
WebDriver driver = DriverFactory.getWebDriver()

WebElement element=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[3]/div[2]/label/input"));
Actions act= new Actions(driver);
act.moveToElement(element).click().build().perform();
//WebUI.uncheck(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Edit Template/span'))
WebUI.delay(3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Edit Template/div_Please share your Email Address with us'), 5)


act.moveToElement(element).click().build().perform();


WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Edit Template/div_Please share your Email Address with us'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Edit Template/button_Save'))

WebUI.click(findTestObject('Object Repository/enhanced_WelcomeMessage/Page_KiboChat  Edit Template/div_Message saved successfully'))