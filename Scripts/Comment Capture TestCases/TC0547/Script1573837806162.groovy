import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Comment Capture TestCases/TC0514'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Title_title'), 'test')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Link Existing Post_new'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/textarea_facebook post'), 'facebook post')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/button_Create Link Carousel'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/div_ Add Link'))
WebUI.delay(2)

//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement textBox = driver.findElement(By.xpath("//*[@id='linkCarousel']/div/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/input"))
//textBox.sendKeys('https://www.dawnnews.tv')
// 
// WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/div_Link is valid'))
// 
// WebUI.delay(3)
// WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/button_Cancel'))
// WebUI.scrollToPosition(0, 0)
// WebUI.delay(1)