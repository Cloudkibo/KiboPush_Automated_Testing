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

WebUI.callTestCase(findTestCase('Sponsor_Messaging_V2/TC036'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Sponsored Messaging/Page_KiboEngage  Create Sponsored Message/button_Schedule'))

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Sponsored Messaging/Page_KiboEngage  Create Sponsored Message/h5_Schedule Broadcast'))

WebUI.click(findTestObject('Object Repository/sponsor_v2/Page_KiboEngage  Sponsored Messaging/Page_KiboEngage  Create Sponsored Message/button_'))

WebUI.scrollToPosition(0, 0)
WebUI.click(findTestObject('Object Repository/sponsor_messaging_v2/Page_KiboEngage  Create Sponsored Message/h5_Step 04'))
