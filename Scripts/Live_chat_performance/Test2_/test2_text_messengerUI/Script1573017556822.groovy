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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://m.facebook.com/')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/messenger_UI/Page_Facebook  log in or sign up/input_facebook_email'), 'arveen.langhani@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/messenger_UI/Page_Facebook  log in or sign up/input_facebook_pass'), 
    'Sq3Tv/oKKfDNGi1QgSywNA==')

WebUI.click(findTestObject('Object Repository/messenger_UI/Page_Facebook  log in or sign up/button_Log In'))


WebUI.click(findTestObject('Object Repository/livechat_test/Page_Facebook/h3_Log In With One Tap'))

WebUI.click(findTestObject('Object Repository/livechat_test/Page_Facebook/button_OK'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/livechat_test/Page_Facebook/div_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/livechat_test/Page_Messages/a_Education123'))

//WebUI.delay(35)
//WebUI.verifyTextPresent("congrats10", true)

WebUI.setText(findTestObject('Object Repository/livechat_test/Page_Education123/textarea_Failed to send message_body'),
	'congrats32')
WebUI.click(findTestObject('Object Repository/livechat_test/Page_Education123/button_Send'))

WebUI.setText(findTestObject('Object Repository/livechat_test/Page_Education123/textarea_Failed to send message_body'),
	'congrats50')
WebUI.click(findTestObject('Object Repository/livechat_test/Page_Education123/button_Send'))

WebUI.delay(10)
////
//////WebUI.delay(5)
WebUI.verifyTextPresent("congrats33", true)
WebUI.verifyTextPresent("congrats34", true)