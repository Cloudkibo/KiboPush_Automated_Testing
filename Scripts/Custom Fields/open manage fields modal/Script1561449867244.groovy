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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Subscriber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Subscribers/input_generalSearch (1)'), 'arveen')

WebUI.delay(15)

WebUI.click(findTestObject('Page_KiboPush  Subscribers/span_Arveen Maheshwari (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_KiboPush  Subscribers/span_Facebook Page (1)'))

WebUI.click(findTestObject('Page_KiboPush  Subscribers/span_Source (1)'))

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/a_Manage Fields (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboEngage  Subscribers/h5_Custom Fields (1)'))

