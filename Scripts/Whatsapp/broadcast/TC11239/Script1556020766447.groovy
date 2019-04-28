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

WebUI.callTestCase(findTestCase('Whatsapp/broadcast/TC11231'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/input_Push Message_form-control m-input (3) (1) (2) (1)'), 'title')

WebUI.scrollToPosition(0, 0)

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with (4)'), 
    'is', true)

WebUI.setText(findTestObject('Page_KiboEngage  Broadcasts/input_Value_text (4)'), 'faizan')

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/span_Send (12)'))

WebUI.click(findTestObject('Page_KiboEngage  Broadcasts/span_Please choose a valid condition (2)'))

