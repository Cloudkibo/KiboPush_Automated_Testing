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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kibochat'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/LiveChat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/a_Open'))


WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> live_chat_subscribers = driver.findElements(By.xpath('//*[@id="m_widget4_tab1_content"]/div/div'))

live_chat_subscribers[0].click()

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/send_message'), 'value', 'congrats32',60, FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementAttributeValue(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/send_message1'), 'value', 'congrats50',60, FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementAttributeValue(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/send_message2'), 'value', 'congrats51',60, FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementAttributeValue(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/send_message3'), 'value', 'congrats52',60, FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementAttributeValue(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/send_message4'), 'value', 'congrats53',60, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	'congrats33')
WebUI.sendKeys(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	'congrats34')
WebUI.sendKeys(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	'congrats35')
WebUI.sendKeys(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	'congrats36')
WebUI.sendKeys(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	'congrats37')
WebUI.sendKeys(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/input_Ok_m-messenger__form-input'),
	Keys.chord(Keys.ENTER))
WebUI.delay(5)

