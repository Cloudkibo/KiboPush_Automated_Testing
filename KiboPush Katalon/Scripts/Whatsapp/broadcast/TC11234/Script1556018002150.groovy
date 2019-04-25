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

WebUI.callTestCase(findTestCase('Whatsapp/broadcast/TC11231'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Push Message_form-control m-input (3)'),
	'title')

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

WebElement message = driver.findElement(By.xpath('//*[@id="postTextArea"]'))

message.clear()

message.sendKeys('')

WebUI.delay(10)

WebUI.scrollToPosition(0, 0)

//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/span_Send (9)'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/div_Please use one of the templates to send'))

