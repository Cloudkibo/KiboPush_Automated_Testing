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

WebUI.callTestCase(findTestCase('SMS/SMSPlatform'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/span_Upload Contacts (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/h3_Upload Contacts (1) (1) (1) (1) (1) (1) (1) (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/button_Enter phone numbers manually (1) (1) (1) (1) (1) (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/button_Add (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/span_Please fill all the fields (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/input_Upload Contacts_form-control m-input (1) (1) (1) (1) (1)'), 
    'Faizan')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/input_Upload Contacts_form-control m-input (2) (1) (1) (1)'), 
    '+923333739566')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/button_Add (2) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/i_Faizan_fa fa-times-circle'))

