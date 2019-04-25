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
import org.apache.poi.ss.formula.functions.Today as Today
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.builtin.SendKeysKeyword as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat


WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count_before = rows_table.size()

WebUI.setText(findTestObject('Page_KiboPush  Broadcast/input_example-text-input'), '7')

WebUI.delay(2)

Table = driver.findElement(By.xpath('//table/tbody'))

rows_table = Table.findElements(By.tagName('tr'))

int rows_count_after = rows_table.size()

WebUI.verifyNotMatch(rows_count_before.toString(), rows_count_after.toString(), false)

String lastDateStr = Table.findElement(By.xpath(('./tr[' + rows_count_after) + ']/td[3]')).getText()

DateFormat dateFormat = new SimpleDateFormat('EEE MMM dd yyyy hh:mm aaa', Locale.ENGLISH)

Date lastDate = dateFormat.parse(lastDateStr)

Date currentDate = new Date()

long ltime = currentDate.getTime() - ((((7 * 24) * 60) * 60) * 1000)

currentDate = new Date(ltime)
println(lastDate)
println(currentDate)

if (currentDate.compareTo(lastDate).toString() == '-1' ) {
    WebUI.verifyMatch('-1', currentDate.compareTo(lastDate).toString(), false)
}
else if(currentDate.compareTo(lastDate).toString() == '1' ) {
    WebUI.verifyMatch('1', currentDate.compareTo(lastDate).toString(), false)
}
 else {
    WebUI.verifyMatch('1', currentDate.compareTo(lastDate).toString(), false)
}

