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
WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Operational_Dashboard/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()


WebElement popup_chatBot = driver.findElement(By.xpath('/html/body/div[2]/div/div/div/div[2]/div[3]/div[12]/div/div/div/div[2]/ul/li[3]'))
popup_chatBot.click()

WebUI.delay(5)

WebElement daysSearch = driver.findElement(By.xpath('/html/body/div[2]/div/div/div/div[2]/div[3]/div[12]/div/div/div[2]/div/div/div[1]/div[2]/div/input'))
daysSearch.clear()
daysSearch.sendKeys('100')
 
 WebUI.delay(5)

List<WebElement> rows_table = driver.findElements(By.xpath('/html/body/div[2]/div/div/div/div[2]/div[3]/div[12]/div/div/div[2]/div/div/div[2]/table/tbody/tr'))

int rows_count = rows_table.size()

WebUI.verifyGreaterThanOrEqual(rows_count, 1)