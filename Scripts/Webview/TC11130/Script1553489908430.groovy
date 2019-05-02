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

WebUI.callTestCase(findTestCase('Welcome Message TestCases/Open Welcome Message Edit Screen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h6_ Add Button (1) (3)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/h7_Open a webview (1) (3)'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Edit Template/button_Cancel'))

WebUI.verifyElementNotPresent(findTestObject('Page_KiboEngage  Edit Template/h6_Button Title'), 0)

