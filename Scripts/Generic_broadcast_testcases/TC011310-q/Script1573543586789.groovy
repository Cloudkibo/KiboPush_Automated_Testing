import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Broadcasts/open_broadcast'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Broadcasts'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/span_Create New Broadcast'))
//
//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/button_Create New Broadcast'))
//
//WebUI.delay(1)

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/quick_reply_function/title_with_action'), [:], FailureHandling.STOP_ON_FAILURE)




