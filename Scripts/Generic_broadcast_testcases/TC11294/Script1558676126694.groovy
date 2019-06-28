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


WebDriver driver = DriverFactory.getWebDriver()
WebElement input = driver.findElement(By.xpath('/html/body/div[6]/div/div[2]/div/div/div[1]/input'))

input.sendKeys('https://www.youtube.com/watch?v=TZmBoMZFC8g')


WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/div_The size of this YouTube video exceeds the 25 Mb limit imposed by Facebook Please try another video'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast/button_Add'))