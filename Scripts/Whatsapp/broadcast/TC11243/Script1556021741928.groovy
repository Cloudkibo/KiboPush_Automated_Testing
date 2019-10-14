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

WebUI.callTestCase(findTestCase('Whatsapp/broadcast/TC11236'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcasts/h5_Text'))

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcasts/textarea_t'), 't')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Next'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Next_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcasts/select_Select Conditionnamenumber'), 
    'name', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with'), 
    'is', true)

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcasts/input_Value_targetingText'), 
    'vishal')

WebUI.delay(2)
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Send'))
