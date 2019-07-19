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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Template testcases/open broadcasting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Template'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/button_Create New'))

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/h3_Create Broadcast Template'))

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131-S'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/textarea_t'), 
    'testing')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast Template/button_Next'))
