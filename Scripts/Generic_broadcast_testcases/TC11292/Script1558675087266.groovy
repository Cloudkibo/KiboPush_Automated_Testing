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
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC11290'), [:], FailureHandling.STOP_ON_FAILURE)

//WebDriver driver = DriverFactory.getWebDriver()
//WebElement input = driver.findElement(By.xpath('/html/body/div[6]/div/div[2]/div/div/div[1]/input'))
//
//input.sendKeys('https://www.youtube.com/watch?v=V_bFT_T3f8')
//WebUI.delay(20)

WebUI.setText(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/input_YouTube Link_form-control'),
	'https://www.youtube.com/watch?v=V_bFT_T3f8')
WebUI.delay(15)

WebUI.verifyTextPresent("*Please enter a valid YouTube video link", false)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/button_Next'))

WebUI.click(findTestObject('Object Repository/simplify_broadcast/Page_KiboEngage  Create Broadcast/button_'))

WebUI.delay(2)

