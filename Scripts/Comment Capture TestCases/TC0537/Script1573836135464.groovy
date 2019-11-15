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

WebUI.callTestCase(findTestCase('Comment Capture TestCases/TC0514'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Track Comments Under_global'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/label_Bot Configuration'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/label_Second Reply'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Any Post_existing'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/label_Post Url'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Link Existing Post_new'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/label_Create a Facebook Post that will be published on your page'))
