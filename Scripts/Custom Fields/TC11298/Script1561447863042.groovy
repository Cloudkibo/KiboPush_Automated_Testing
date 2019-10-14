import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Custom Fields/create custom field without description'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Custom Fields/delete custom field'), [:], FailureHandling.STOP_ON_FAILURE)