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

WebUI.callTestCase(findTestCase('TC0150'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast/input_form-control (6)'), 'Title')

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast/textarea_form-control'), 'Subtitle')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/h6_ Add Button (1)'))

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/button_Cancel (1)'))

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/div_ Add Button (3)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast/input_form-control_1 (2)'), 'KiboPush')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/div_Open a website (2)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Broadcast/input_form-control_2'), 'kibopush.com')

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/button_Done (2)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/button_Next (6)'))

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast/div_Card in gallery must have _1'))

