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

WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/button_View'))

WebUI.scrollToPosition(0, 0)
WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/h3_Title  zameen'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_KiboEngage  Comment Capture/a_httpsfacebookcom2090553931018635_31269196_e99dd9'))


WebUI.switchToWindowUrl('https://www.facebook.com/permalink.php?story_fbid=3126919677382050&id=2090553931018635')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/comment_capture_Analytics/Page_Test5 - demo post  Facebook/p_demo post'))

WebUI.switchToWindowUrl('https://kiboengage.cloudkibo.com/PostResult')
WebUI.delay(2)


