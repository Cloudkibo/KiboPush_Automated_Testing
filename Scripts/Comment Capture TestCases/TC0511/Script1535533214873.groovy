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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Comment capture'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table1 = driver.findElement(By.xpath('//table/tbody/tr[1]/td[4]/span'))

String date_page1 = Table1.getText()

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Comment Capture/a_2'))

WebUI.delay(5)

WebElement Table2 = driver.findElement(By.xpath('//table/tbody/tr[1]/td[4]/span'))

String date_page2 = Table2.getText()

println(date_page1)

println(date_page2)

DateFormat dateFormat = new SimpleDateFormat('EEE MMM dd yyyy hh:mm aaa', Locale.ENGLISH)

Date date1 = dateFormat.parse(date_page1)

Date date2 = dateFormat.parse(date_page2)

WebUI.verifyMatch('1', date1.compareTo(date2).toString(), false)

