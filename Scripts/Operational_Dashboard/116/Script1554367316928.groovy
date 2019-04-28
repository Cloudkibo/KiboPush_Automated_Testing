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

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
WebUI.callTestCase(findTestCase('Operational_Dashboard/Login'), [:], FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver()

WebElement subscriber1 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[1]/div[1]/div/div[3]/span[1]'))
WebElement subscriber2 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[1]/div[2]/div/div[3]/span[1]'))
WebElement subscriber3 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[2]/div[1]/div/div[3]/span[1]'))
WebElement subscriber4 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[2]/div[2]/div/div[3]/span[1]'))
WebElement subscriber5 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[3]/div[1]/div/div[3]/span[1]'))
WebElement subscriber6 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[3]/div[2]/div/div[3]/span[1]'))
WebElement subscriber7 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[4]/div[1]/div/div[3]/span[1]'))
WebElement subscriber8 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[4]/div[2]/div/div[3]/span[1]'))
WebElement subscriber9 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[5]/div[1]/div/div[3]/span[1]'))
WebElement subscriber10 = driver.findElement(By.xpath('//*[@id="m_widget5_tab1_content"]/div/div[5]/div[2]/div/div[3]/span[1]'))
 
subscriber_count_1 = Integer.parseInt(subscriber1.text)
subscriber_count_2 = Integer.parseInt(subscriber2.text)
subscriber_count_3 = Integer.parseInt(subscriber3.text)
subscriber_count_4 = Integer.parseInt(subscriber4.text)
subscriber_count_5 = Integer.parseInt(subscriber5.text)
subscriber_count_6 = Integer.parseInt(subscriber6.text)
subscriber_count_7 = Integer.parseInt(subscriber7.text)
subscriber_count_8 = Integer.parseInt(subscriber8.text)
subscriber_count_9 = Integer.parseInt(subscriber9.text)
subscriber_count_10 = Integer.parseInt(subscriber10.text)

if(subscriber_count_1 > subscriber_count_2 && subscriber_count_2 > subscriber_count_3 && subscriber_count_3 > subscriber_count_4 && subscriber_count_4 > subscriber_count_5 && subscriber_count_5 > subscriber_count_6 && subscriber_count_6 > subscriber_count_7 && subscriber_count_7 > subscriber_count_8 && subscriber_count_8 > subscriber_count_9 && subscriber_count_9 > subscriber_count_10) {
	WebUI.verifyEqual(1, 1)
}
else {
	WebUI.verifyEqual(1, 0)
}

