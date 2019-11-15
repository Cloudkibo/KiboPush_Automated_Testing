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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Messenger Code'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/button_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Messenger Code/h3_Edit Messenger Code'))
WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Messenger Code/button_Opt-In Message_btn btn-circle btn-ic_2ccbba'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Message/div_Opt-In Message'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Message/h5_Text'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Edit Message/textarea_hi'), 'hi')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Message/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Message/button_Save'))

WebUI.delay(1)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Message/button_Back'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Messenger Code/h3_Edit Messenger Code'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Messenger Code/div_hi'))



