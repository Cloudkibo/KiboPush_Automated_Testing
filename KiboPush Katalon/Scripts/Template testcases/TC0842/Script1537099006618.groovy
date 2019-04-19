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
WebUI.callTestCase(findTestCase('Template testcases/TC0834'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control (4)'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/textarea_form-control (3)'), 'h')

WebDriver driver = DriverFactory.getWebDriver()

WebElement   subTitle = driver.findElement(By.xpath('//*[@id="List1"]/div/div/div[3]/div[2]/div/div[2]/div[1]/center/textarea'))

subTitle.sendKeys("abc")

WebElement   title = driver.findElement(By.xpath('//*[@id="List1"]/div/div/div[3]/div[2]/div/div[2]/div[1]/center/input'))
 
 title.sendKeys("abc")
 
 WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/category'))
 
 WebUI.delay(1)
 
 WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/li_Customer Behavior'))
 

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/button_Create'))

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/div_Broadcast created successf'))

