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

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Dashboard'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Upload Contacts'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/h3_Upload Contacts (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/button_Enter phone numbers manually (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Upload Contacts/button_Back'))

