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

WebUI.callTestCase(findTestCase('Team Testcases/TC0958'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_KiboPush  Broadcast/input_form-control (2) (1) (1) (1) (1)'), 'TeamX')

WebUI.setText(findTestObject('Page_KiboPush  Broadcast/textarea_1 (3)'), '1')

WebUI.click(findTestObject('Page_KiboPush  Broadcast/a_Add Agents (2)'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/span_All'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/button_Create Team (4)'))

WebUI.click(findTestObject('Page_KiboPush  Broadcast/div_Please select one page atl (2)'))

