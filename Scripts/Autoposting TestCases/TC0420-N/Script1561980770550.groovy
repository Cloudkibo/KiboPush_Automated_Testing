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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions

WebUI.callTestCase(findTestCase('Autoposting TestCases/TC0417_N'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement model = driver.findElement(By.xpath('/html/body/div[6]/div/div[2]/div/a'))

model.click()

WebUI.delay(2)


WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Save Changes (2)'))

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Back (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Auto Posting (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/button_User Guide_close'))


WebUI.delay(2)


WebUI.click(findTestObject('Page_KiboPush  Autoposting/a_'))

WebUI.delay(3)

//WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Delete'))
//
WebElement delete_model = driver.findElement(By.xpath('/html/body/div[6]/div/div[2]/div/button'))

delete_model.click()
WebUI.delay(2)
