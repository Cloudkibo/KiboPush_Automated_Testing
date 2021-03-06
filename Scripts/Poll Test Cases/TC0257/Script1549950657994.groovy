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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Polls'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Create New (3) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/button_Create New Poll (1) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/textarea_form-control (4) (1)'), 'h')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control (6) (1)'), 'hi')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_1 (2) (1)'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Poll/input_form-control (1)'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Poll/input_form-control_1 (1)'), 'hi')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/button_Create Poll (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/div_Poll sent successfully'))

