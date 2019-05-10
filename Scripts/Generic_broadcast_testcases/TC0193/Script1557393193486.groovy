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

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/TC0131'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/i_Media_fa fa-pencil-square-o'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/h6_ Add Button (7)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Open a website'))

WebUI.setText(findTestObject('Page_KiboEngage  Create Broadcast/input_Open Website_form-control (2)'), 'google.com')

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/button_Edit'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_New text component added (2)'))

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_Button 1 (1)'))

