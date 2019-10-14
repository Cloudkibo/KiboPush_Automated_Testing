import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)

WebUI.callTestCase(findTestCase('Persistent Menu/TC0537'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/div_Text (3) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Menu/textarea_Text_form-control'), 'Text')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h6_ Add Button (6)'))

WebUI.sendKeys(findTestObject('Object Repository/Page_KiboEngage  Create Menu/input_Button Title_form-control'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_KiboEngage  Create Menu/input_Button Title_form-control'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h7_Open a website (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Menu/input_Open Website_form-control (1)'), 'google.com')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KiboEngage  Create Menu/button_Add'))

