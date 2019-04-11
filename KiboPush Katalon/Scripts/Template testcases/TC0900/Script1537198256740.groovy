import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Template testcases/TC0899'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control (1) (1)'), 'hi')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/polls_category'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/li_Customer Behavior'))

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/textarea_form-control (5)'), 'q1')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_1 (1) (1)'), '1')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_2 (1) (1)'), '2')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_3 (1)'), '3')

WebUI.click(findTestObject('Page_KiboPush  Create Poll/button_Create Poll (2) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Templates/h3_Broadcasts'))
