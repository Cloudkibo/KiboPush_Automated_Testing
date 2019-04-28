import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Smart Replies/Test-Actions-Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Waiting Subscribers (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/h3_Subscribers waiting for res (1)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/a_Back (6)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/i_la la-ellipsis-h (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/span_Delete'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/button_Delete (6)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/div_Bot deleted successfully'))

