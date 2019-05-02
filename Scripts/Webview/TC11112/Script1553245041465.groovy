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

WebUI.callTestCase(findTestCase('Persistent Menu/open_popover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Menu/input_Open a submenu_replyWithMessage (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Menu/a_Create Message (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/div_Text (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h6_ Add Button (1) (1)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Menu/input_Button Title_form-control (1) (1)'), 
    'Testing Webview')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h7_Open a webview (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/button_Cancel'))

WebUI.delay(1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_KiboEngage  Create Menu/div_Button TitleWhen this button is pressed Open a website Open a webview Done  Cancel'), 
    0)

