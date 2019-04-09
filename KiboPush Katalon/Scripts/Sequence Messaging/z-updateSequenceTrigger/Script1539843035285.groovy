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

WebUI.callTestCase(findTestCase('Sequence Messaging/Test Edit Sequence Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/Edit Trigger Button (1) (1)'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select Event seesclicks (1) (1) (1)'), 
    'sees', true)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select Message New Mess (3)'), '5c3825e4f0fb5639eae21713', 
    true)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Save (11) (1)'))

