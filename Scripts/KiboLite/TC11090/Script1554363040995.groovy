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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Subscribers/span_Subscribers (5)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_ Dashboard/span_Broadcast'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_ Business Gateway/a_Target Customers (2)'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> Select = driver.findElements(By.xpath('//*[@id="m-datatable--27866229129"]/tbody/tr/td[2]/select/option'))

println(Select.size())

WebUI.verifyGreaterThanOrEqual(Select.size(), 3)
