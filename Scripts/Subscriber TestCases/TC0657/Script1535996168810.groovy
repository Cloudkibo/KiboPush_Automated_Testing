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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Subscriber'), [:], FailureHandling.STOP_ON_FAILURE)


//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Subscribers/select_Filter by Tags...ALLhel'), 
//    'all', true)
//
//WebUI.delay(2)

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> rows_table1 = driver.findElements(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div/div[1]/div[4]/div/div[2]/select/option'))
 
 println(rows_table1.size())
 
 rows_table1[1].click()
 
 WebUI.delay(3)

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int size = rows_table.size()

WebUI.verifyGreaterThanOrEqual(size, 1)

