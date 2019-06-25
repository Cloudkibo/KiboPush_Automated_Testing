import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/button_Create Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/h5_Create New Custom Field'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Subscribers/input_Name_name (1) (1) (1)'), 'automated testing')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Subscribers/select_SelectTextNumberDateDate and TimeTrueFalse (1) (1) (1)'),
	'text', true)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Subscribers/textarea_a (1)'), 'automated testing')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/button_Create (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/div_New Custom Field Created'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Subscribers/div_New Custom Field Created'))

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/h5_Custom Fields (1)'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//*[@id="m-datatable--27866229129"]/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int size = rows_table.size()

WebUI.verifyGreaterThanOrEqual(size, 6)