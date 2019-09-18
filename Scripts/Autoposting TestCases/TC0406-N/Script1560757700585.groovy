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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Autoposting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/i_la la-gear (3)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/button_User Guide_close'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Feed Settings'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()
WebElement oRadioButton = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[3]/div/form/div[1]/div[3]/div[2]/div[2]/div/label[3]/input"))

Actions actions = new Actions(driver);

actions.moveToElement(oRadioButton).click().perform();

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/button_Save Changes (1)'))

WebUI.click(findTestObject('Page_KiboPush  Autoposting/div_Changes saved successfully (1)'))

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Back (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/button_User Guide_close'))


WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Auto Posting (1)'))


WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/i_la la-gear (3)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Feed Settings'))

WebUI.delay(2)

List<WebElement> oRadioButtonList = driver.findElements(By.cssSelector("input[type=radio]"))
//WebElement oRadioButton1 = driver.findElements(By.cssSelector("input[type=radio]"))
//println(oRadioButton1.isSelected())
WebUI.verifyEqual(false,oRadioButtonList.get(0).isSelected())
WebUI.verifyEqual(false,oRadioButtonList.get(1).isSelected())
WebUI.verifyEqual(true,oRadioButtonList.get(2).isSelected())

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Back (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Auto Posting (1)'))

WebUI.delay(2)


WebUI.click(findTestObject('Page_KiboPush  Autoposting/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Delete'))

WebUI.delay(2)