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

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Sequence Messaging/TC0982'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Sequence Messaging/input_Sequence Name_form-contr (4)'), 'Sequence1')

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Create (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Sequence/button_Back'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Edit Sequence/h3_Warning'))

