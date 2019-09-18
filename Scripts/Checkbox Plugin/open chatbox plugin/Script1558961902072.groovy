import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.executeJavaScript("document.getElementById('mCSB_1_container').style.top='0px'", null)


WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Invite Subscribers'))

WebUI.delay(1)

WebUI.executeJavaScript("document.getElementById('mCSB_1_container').style.top='-500px'", null)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Invite Subscribers/span_Checkbox Plugin'))

WebUI.delay(1)