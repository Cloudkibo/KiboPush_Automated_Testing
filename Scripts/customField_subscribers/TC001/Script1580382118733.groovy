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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('customField_subscribers/open_sidebar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/customFields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/subscribers/Page_KiboEngage  Custom Fields/h3_Default Fields'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> rows_table = driver.findElements(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[7]/div[2]/div/div/div/div[2]/div/table/tbody/tr'))

println(rows_table.size())

WebUI.verifyEqual(10, rows_table.size())



//WebUI.click(findTestObject('Object Repository/subscribers/Page_KiboEngage  Custom Fields/h3_User Fields'))
//
//rows_table = driver.findElements(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[7]/div[3]/div/div/div/div[2]/div/table/tbody/tr'))
//
//println(rows_table.size())
//
//WebUI.verifyGreaterThanOrEqual(rows_table.size(), 1)
