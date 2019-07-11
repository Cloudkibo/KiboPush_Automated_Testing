import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

String date_page1 = getFirstRowDate()

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/a_next (1)'))

WebUI.delay(5)

String date_page2 = getFirstRowDate()

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/a_next (1)'))

WebUI.delay(5)

String date_page3 = getFirstRowDate()

WebUI.verifyNotMatch(date_page1, date_page2, false)

WebUI.verifyNotMatch(date_page1, date_page3, false)

WebUI.verifyNotMatch(date_page2, date_page3, false)

DateFormat dateFormat = new SimpleDateFormat('EEE MMM dd yyyy hh:mm aaa', Locale.ENGLISH)

Date date1 = dateFormat.parse(date_page1)

Date date2 = dateFormat.parse(date_page2)

Date date3 = dateFormat.parse(date_page3)

println(date1)

println(date2)

println(date3)

if (!(date1.after(date2) && date2.after(date3))) {
    KeywordUtil.markFailed('Dates not in proper order')
}

String getFirstRowDate() {
    WebDriver driver = DriverFactory.getWebDriver()

    try {
        WebElement Table = driver.findElement(By.xpath('//table/tbody'))

        List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

        String dates = new ArrayList<String>()

        date = rows_table.get(0).findElement(By.xpath('.//td[@data-field="datetime"]')).getText()

        return date
    }
    catch (Exception e) {
        KeywordUtil.markFailed('ERROR: No Table Present')
    } 
}

