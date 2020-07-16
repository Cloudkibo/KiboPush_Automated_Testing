import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//WebUI.callTestCase(findTestCase('CannResponses/cannResponse'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/cannResponses'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/button_Create'))

WebUI.click(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/h5_Create New Canned Message'))

WebUI.setText(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/input__name'), 'test2')

WebUI.setText(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/textarea_Canned Response_description'),
	'test2')



WebUI.click(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/button_Close'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/cannResponses/Page_KiboChat  Api Settings/span_Canned Responses (1)'))
WebUI.verifyTextNotPresent('test2', false)
