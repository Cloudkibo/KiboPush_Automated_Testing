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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/survey'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New (4) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New Survey (2) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Add Survey/button_Add Questions (1) (1) (1) (1) (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Add Survey/button_Add Questions (1) (1) (1) (1) (2)'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> Table1 = driver.findElements(By.xpath('//*[@id=\'identity\']/div[1]/div[4]/div'))

WebUI.click(findTestObject('Page_KiboPush  Add Survey/span_fa fa-times'))

List<WebElement> Table2 = driver.findElements(By.xpath('//*[@id=\'identity\']/div[1]/div[4]/div'))

WebUI.verifyEqual(Table1.size().toString(), '2')

WebUI.verifyEqual(Table2.size().toString(), '1')*/

