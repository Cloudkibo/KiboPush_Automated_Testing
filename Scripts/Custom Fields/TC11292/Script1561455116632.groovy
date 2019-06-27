import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Custom Fields/create custom field without description'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/button_text_btn btn-primary btn-sm (2)'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement name = driver.findElement(By.xpath('//*[@id="m-datatable--27866229129"]/tbody/tr[6]/td[2]/span/input'))

WebUI.verifyEqual(name.isEnabled(), true)

WebElement description = driver.findElement(By.xpath('//*[@id="m-datatable--27866229129"]/tbody/tr[6]/td[4]/span/input'))

WebUI.verifyEqual(description.isEnabled(), true)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/button_text_btn btn-primary btn-sm (1) (1) (1)'))

WebUI.callTestCase(findTestCase('Custom Fields/delete custom field'), [:], FailureHandling.STOP_ON_FAILURE)

