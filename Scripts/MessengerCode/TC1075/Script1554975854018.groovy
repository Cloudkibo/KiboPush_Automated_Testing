import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Messenger Code'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//*[@id="ajax_data"]/table'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

WebUI.verifyGreaterThanOrEqual(rows_table.size(), 1)

