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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Autoposting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/span_Add Feed (3) (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/button_WordPress (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Auto Posting - KiboPush/circle_cross'))
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/button_View Integration Guidel (1) (1)'))
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/a_WordPress.com (1) (1)'))
//
//WebUI.scrollToPosition(0, 0)
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Autoposting/h4_Guidelines for integrating'))
//
