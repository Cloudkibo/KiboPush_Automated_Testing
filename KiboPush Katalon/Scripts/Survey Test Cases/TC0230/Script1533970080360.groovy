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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/survey'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New'))

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New Survey'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/input_form-control'), 'hi')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_form-control'), 'h')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_h'), 'he')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_he'), 'hel')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_hel'), 'hell')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/textarea_hell'), 'hello')

WebUI.click(findTestObject('Page_KiboPush  Add Survey/button_Add Questions'))

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/input_form-control_1'), 'hi')

WebUI.setText(findTestObject('Page_KiboPush  Add Survey/input_form-control input-sm'), 'bye')

WebUI.click(findTestObject('Page_KiboPush  Add Survey/button_Create Survey'))

WebUI.click(findTestObject('Page_KiboPush  Add Survey/div_Please fill all the fields'))

