import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC11297'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/input_Create Carousel using Links_form-control'), 
    'https://www.dawn.com/news/149609')

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()
WebElement textBox = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/input"))
textBox.sendKeys('3')
//WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/input_Create Carousel using Links_form-control'),
//	'3')


//WebUI.modifyObjectProperty(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/input_Create Carousel using Links_form-control'), 'value', 'equals', 'https://www.dawn.com/news/1496093', true)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/div_Link is valid'))

WebElement button = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[4]/div/button[2]"))

button.click()
WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/div_New card component added'))


