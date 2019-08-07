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
WebUI.callTestCase(findTestCase('Operational_Dashboard/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Operational Dashbo/select_Filter by lastAll10 day'), 
    '30', true)

WebUI.delay(20)

WebDriver driver = DriverFactory.getWebDriver()

WebElement broadcast = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/div/div'))

broadcast_data_1 =  Integer.parseInt((broadcast.text.split("\n")[0]).toString())
println(broadcast_data_1)

WebElement poll = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/div/div'))
 
 poll_data_1 =  Integer.parseInt((poll.text.split("\n")[0]).toString())
 println(poll_data_1)
 
 WebElement survey = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div'))
  
  survey_data_1 =  Integer.parseInt((survey.text.split("\n")[0]).toString())
  println(survey_data_1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Operational Dashbo/select_Filter by lastAll10 day'), 
    '10', true)

WebUI.delay(3)

 broadcast = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/div/div'))
 
 broadcast_data_2 =  Integer.parseInt((broadcast.text.split("\n")[0]).toString())
 println(broadcast_data_2)
 
  poll = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/div/div'))
  
  poll_data_2 =  Integer.parseInt((poll.text.split("\n")[0]).toString())
  println(poll_data_2)
  
   survey = driver.findElement(By.xpath('//*[@id="content"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div'))
   
   survey_data_2 =  Integer.parseInt((survey.text.split("\n")[0]).toString())
   println(survey_data_2)

   if(broadcast_data_1 > broadcast_data_2 &&  poll_data_1 > poll_data_2 &&  survey_data_1 >  survey_data_2) {
	   WebUI.verifyEqual(1, 1)
   }
   else {
	   WebUI.verifyEqual(1, 0)
   }