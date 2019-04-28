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

WebUI.callTestCase(findTestCase('Template testcases/TC0788'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast Tem/input_form-control (4) (2)'), 'hello')

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast Tem/textarea_form-control (3) (1)'), 'h')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/h6_ Add Button (1) (2)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast Tem/input_form-control (16) (1)'), 'google')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/div_Open a website (1) (2)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast Tem/input_form-control_1 (8) (1)'), 'www.google.com')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/button_Done (1) (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/button_Create (8) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Broadcast Template/div_Card in gallery must have an image'))

