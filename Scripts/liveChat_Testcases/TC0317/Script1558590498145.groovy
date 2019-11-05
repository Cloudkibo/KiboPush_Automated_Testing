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
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kibochat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/LiveChat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Live Chat/a_Closed'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> live_chat_subscribers = driver.findElements(By.xpath('//*[@id="m_widget4_tab1_content"]/div/div'))

live_chat_subscribers[0].click()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/livechat_test/Page_KiboChat  Live Chat/i_StatusUnassigned_fa fa-envelope-open-o'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboChat  Live Chat/p_Please select a session to view its chat'))

