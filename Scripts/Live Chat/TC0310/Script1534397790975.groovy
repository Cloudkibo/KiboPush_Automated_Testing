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

WebUI.callTestCase(findTestCase('Live Chat/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Live Chat (Beta)'))

String t1 = WebUI.getText(findTestObject('Page_KiboPush  Live Chat/chat_timestamp1'))

String t2 = WebUI.getText(findTestObject('Page_KiboPush  Live Chat/chat_timestamp2'))

String t3 = WebUI.getText(findTestObject('Page_KiboPush  Live Chat/chat_timestamp3'))

String t4 = WebUI.getText(findTestObject('Page_KiboPush  Live Chat/chat_timestamp4'))

String t5 = WebUI.getText(findTestObject('Page_KiboPush  Live Chat/chat_timestamp5'))

if (!(t1.contains("minutes ago") || t1.contains("hours ago") || t1.contains("days ago"))) {
	KeywordUtil.markFailed("No timestamp for 1st chat")
}
if (!(t2.contains("minutes ago") || t2.contains("hours ago") || t2.contains("days ago"))) {
	KeywordUtil.markFailed("No timestamp for 2nd chat")
}
if (!(t3.contains("minutes ago") || t3.contains("hours ago") || t3.contains("days ago"))) {
	KeywordUtil.markFailed("No timestamp for 3rd chat")
}
if (!(t4.contains("minutes ago") || t4.contains("hours ago") || t4.contains("days ago"))) {
	KeywordUtil.markFailed("No timestamp for 4th chat")
}
if (!(t5.contains("minutes ago") || t5.contains("hours ago") || t5.contains("days ago"))) {
	KeywordUtil.markFailed("No timestamp for 5th chat")
}
