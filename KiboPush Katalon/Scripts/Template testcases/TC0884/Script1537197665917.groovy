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

WebUI.callTestCase(findTestCase('Template testcases/TC0871'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Create Survey/h3_Create Template Survey (4) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Survey/input_form-control (1) (1) (1) (1) (1)'), 'hi')

WebUI.setText(findTestObject('Page_KiboPush  Create Survey/textarea_form-control (1) (1) (1) (1)'), 'bye')

WebUI.click(findTestObject('Page_KiboPush  Create Survey/button_Add Questions (2) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Create Survey/input_form-control (2) (1)'), 'hi')

WebUI.setText(findTestObject('Page_KiboPush  Create Survey/input_form-control input-sm (1)'), 'hi')

WebUI.click(findTestObject('Page_KiboPush  Create Survey/button_Create Survey (6)'))

WebUI.click(findTestObject('Page_KiboPush  Create Survey/div_Please select a category (3)'))

