import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/survey'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New'))

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New Survey'))

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/input_form-control'), 'hello')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_form-control'), 'h')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_h'), 'hi')

WebUI.click(findTestObject('Page_KiboPush  Add Survey/button_Add Questions'))

//*[@id="question0"]/input
WebDriver driver = DriverFactory.getWebDriver()

try {
    WebElement data = driver.findElement(By.xpath('.//*[@id=\'question0\']/input'))

    println(data.getText())

    WebUI.verifyEqual(data.getText(), '') //println(rows_table.get(0).getText())
}
catch (Exception e) {
    e.printStackTrace()
} */

