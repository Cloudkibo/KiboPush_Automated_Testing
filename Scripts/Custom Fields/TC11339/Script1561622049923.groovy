import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Custom Fields/create custom field without description'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/button_text_btn btn-primary btn-sm (1) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/h5_Are You Sure (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/button_Cancel (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/h5_Custom Fields (1)'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement previousTable = driver.findElement(By.xpath('//*[@id="m-datatable--27866229129"]/tbody'))

List<WebElement> previous_rows_table = previousTable.findElements(By.tagName('tr'))

int previousSize = previous_rows_table.size()

WebUI.verifyGreaterThanOrEqual(previousSize, 6)

WebUI.callTestCase(findTestCase('Custom Fields/delete custom field'), [:], FailureHandling.STOP_ON_FAILURE)



