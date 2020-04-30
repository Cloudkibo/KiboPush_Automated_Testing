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
import com.kms.katalon.core.webui.keyword.builtin.SendKeysKeyword as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
WebUI.callTestCase(findTestCase('Sponsor_Messaging_V2/TC036'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Sponsored Messaging/Page_KiboEngage  Create Sponsored Message/button_Schedule'))

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Sponsored Messaging/Page_KiboEngage  Create Sponsored Message/h5_Schedule Broadcast'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = driver.findElement(By.xpath('//*[@id="sponsoredMessage"]/div/div/div[2]/div/input[2]'))

element.sendKeys('01:00')

WebUI.delay(3)