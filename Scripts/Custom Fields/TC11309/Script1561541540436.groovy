import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/div_number  Not Set'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/h3_Set number Value'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/span_Custom Fields'))

