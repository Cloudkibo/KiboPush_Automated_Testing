import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Autopost_RSS_FEED/TC0017'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/button_Enabled'))
WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/h5_Disable Integration'))

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/button_Yes'))

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/div_Feed has been updated successfully'))

WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/button_Disabled'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/RSS_Feed/Page_KiboEngage  Rss Integration for News P_8908ba/div_Feed has been updated successfully'))

