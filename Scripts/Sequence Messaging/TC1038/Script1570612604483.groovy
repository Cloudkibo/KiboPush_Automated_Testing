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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Whatsapp/broadcast/go to broadcasting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sequence Messaging/go to surveys'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New (4) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Survey/button_Create New Survey (2) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Add Survey/a_Survey'))

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_form-control_1 (1) (1) (1) (1)'), 'hi')

WebUI.click(findTestObject('Page_KiboEngage  Add Survey/button_Add Questions (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_form-control (1) (1) (1) (1)'), '1')

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_form-control input-sm_2 (1) (1) (1) (1)'), '2')

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_form-control input-sm (1) (1) (1) (1)'), '3')

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_form-control input-sm_1 (1) (1) (1) (1)'), '4')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboEngage  Add Survey/input_Choices_form-control input-sm (1)'), '4')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/button_Set Action'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KiboEngage  Create Poll/i_Subscribe to Sequence_la la-plus'), 1)