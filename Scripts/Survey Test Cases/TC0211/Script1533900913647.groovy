import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.By as By
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/survey'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.delay(3)

String date_page1 = getFirstRowDate()

WebUI.click(findTestObject('Page_KiboPush  Survey/a_3'))

WebUI.delay(5)

String date_page2 = getFirstRowDate()

WebUI.click(findTestObject('Page_KiboPush  Survey/a_4'))

WebUI.delay(5)

String date_page3 = getFirstRowDate()

DateFormat dateFormat = new SimpleDateFormat('EEE MMM dd yyyy hh:mm aaa', Locale.ENGLISH)

Date date1 = dateFormat.parse(date_page1)

Date date2 = dateFormat.parse(date_page2)

Date date3 = dateFormat.parse(date_page3)

WebUI.verifyMatch('1', date1.compareTo(date2).toString(), false)

WebUI.verifyMatch('1', date2.compareTo(date3).toString(), false)

String getFirstRowDate() {
    WebDriver driver = DriverFactory.getWebDriver()

    try {
        WebElement Table = driver.findElement(By.xpath('//table/tbody'))

        List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

        String date

        date = rows_table.get(0).findElement(By.xpath('.//td[3]')).getText()

        KeywordLogger log = new KeywordLogger()

        log.logInfo(date)

        return date
    }
    catch (Exception e) {
        KeywordUtil.markFailed('ERROR: No Table Present')
    } 
}*/

