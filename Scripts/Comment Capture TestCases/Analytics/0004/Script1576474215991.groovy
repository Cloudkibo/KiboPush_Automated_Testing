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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Invite subscribers/open growth tools'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Comment capture'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/Page_KiboEngage  Comment Capture/select_Filter by TypeAny PostExisting PostN_7b3b5d'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/span_New Post'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/span_Any Post'), 10)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/span_Existing Post'), 10)
