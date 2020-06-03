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
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('WLB/TC006'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('WLB/Switch Window'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WLB/Page_WhatsApp Router/i_httpsbitly3cvoWIQ_la la-edit'))

WebUI.click(findTestObject('Object Repository/Page_React App/span_delete_forever'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Are you sure you want to delete this _c9a449'), 'arvee@cloudkibo.com')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Delete'))
WebUI.delay(2)

WebUI.verifyTextPresent('Email did not matched.', false)

WebUI.refresh()