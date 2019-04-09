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
WebUI.callTestCase(findTestCase('Setting testcases/TC1014'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_KiboPush  api_settings/span'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement element1 = driver.findElement(By.xpath('//*[@id="m_user_profile_tab_1"]/form/div/div[3]/div[1]/div/input'))

String text1=element1.getAttribute("value")

WebElement element2 = driver.findElement(By.xpath('//*[@id="m_user_profile_tab_1"]/form/div/div[3]/div[2]/div/input'))
 
String text2=element2.getAttribute("value")

WebUI.click(findTestObject('Object Repository/Page_KiboPush  api_settings/button_Reset'))

WebUI.delay(3)

WebElement element3 =  driver.findElement(By.xpath('//*[@id="m_user_profile_tab_1"]/form/div/div[3]/div[1]/div/input'))

 
 WebElement element4 = driver.findElement(By.xpath('//*[@id="m_user_profile_tab_1"]/form/div/div[3]/div[2]/div/input'))
  
 WebUI.verifyNotEqual(text1, element3.getAttribute("value"))
 WebUI.verifyNotEqual(text2, element4.getAttribute("value"))
 
 WebUI.click(findTestObject('Object Repository/Page_KiboPush  api_settings/span'))
 