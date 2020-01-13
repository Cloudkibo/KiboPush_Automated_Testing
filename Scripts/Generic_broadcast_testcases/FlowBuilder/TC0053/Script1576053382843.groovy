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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/FlowBuilder/TC0050'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)
WebDriver driver = DriverFactory.getWebDriver()

WebElement upload = driver.findElement(By.xpath('//input[@type=\'file\']'))

String video = RunConfiguration.getProjectDir() + '/video.mp4'

upload.sendKeys(video)

WebUI.delay(20)


WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h6_ Add Button'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Button Title_form-control'),'google')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/h7_Open a website'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_Open Website_form-control'),
	'google.com')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/div_New media component added'))
WebUI.delay(1)