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
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/FlowBuilder/TC0065'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/edit_module_button'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/i_Cancel_fa fa-pencil-square-o'))

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Create Carousel using Links_form-control'),
	'https://images.dawn.com/news/118402')
WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()
WebElement textBox = driver.findElement(By.xpath("//*[@id='singleModal']/div/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/input"))
textBox.sendKeys('7')

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Create Broadcast/div_card component edited'))
WebUI.verifyTextPresent("LINKS CAROUSEL COMPONENT EDITED", true)