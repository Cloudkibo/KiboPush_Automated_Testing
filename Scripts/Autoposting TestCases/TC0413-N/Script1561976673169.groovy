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
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Autoposting TestCases/open automation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Autoposting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/span_Add Feed (4) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Twitter (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Autoposting/input_form-control (4)'), 'https://twitter.com/arveenkumar55')

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Add Twitter Account (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/i_la la-gear (3)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Feed Settings'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.delay(2)


WebDriver driver = DriverFactory.getWebDriver()
List<WebElement> oRadioButton = driver.findElements(By.cssSelector("input[type=radio]"))
println(oRadioButton.size())

//WebElement oRadioButton1 = driver.findElements(By.cssSelector("input[type=radio]"))
//println(oRadioButton.get(0).isSelected())
//println(oRadioButton.get(1).isSelected())
//println(oRadioButton.get(2).isSelected())
//println(oRadioButton.get(3).isSelected())
//println(oRadioButton.get(4).isSelected())
//println(oRadioButton.get(5).isSelected())
//println(oRadioButton.get(6).isSelected())


WebUI.verifyEqual(true,oRadioButton.get(5).isSelected())
WebUI.verifyEqual(false,oRadioButton.get(6).isSelected())

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Back (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Auto Posting (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Delete'))

WebUI.delay(2)
