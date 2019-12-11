import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/FlowBuilder/TC0064'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Create Carousel using Links_form-control'),
	'https://images.dawn.com/news/118402')
WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()
WebElement textBox = driver.findElement(By.xpath("//*[@id='singleModal']/div/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/input"))
textBox.sendKeys('6')
WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_Link is valid'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h6_ Add Link'))
WebUI.delay(2)


WebElement textBox2 = driver.findElement(By.xpath("//*[@id='singleModal']/div/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/input"))
textBox2.sendKeys('https://www.dawn.com/news/149609')

WebUI.delay(3)
textBox2.sendKeys('3')
WebUI.delay(3)


WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(1)

WebUI.verifyTextPresent("NEW GALLERY COMPONENT ADDED", true)