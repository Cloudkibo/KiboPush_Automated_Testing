

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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
WebUI.callTestCase(findTestCase('SMS_List/goTouploadContact'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS_List/AddNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/i_Valid Records_la la-angle-down'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/a_next (1)'))
WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

WebUI.verifyGreaterThanOrEqual(rows_count, 1)

