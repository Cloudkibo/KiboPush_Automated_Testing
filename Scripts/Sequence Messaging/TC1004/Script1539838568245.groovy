import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
WebUI.callTestCase(findTestCase('Sequence Messaging/TC1002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select ConditionFirst N (2) (1) (1)'), 
    'page', true)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select Criteriais (1) (1)'), 'is', true)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> rows_table1 = driver.findElements(By.xpath('//*[@id="m-datatable--27866229129"]/tbody/tr/td[3]/select/option'))

println(rows_table1.size())

rows_table1[2].click()

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Sequence/button_Save'))

