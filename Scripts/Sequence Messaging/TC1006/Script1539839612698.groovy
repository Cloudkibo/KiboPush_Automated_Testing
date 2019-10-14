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

WebUI.callTestCase(findTestCase('Sequence Messaging/TC1002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select ConditionFirst N (4) (1) (1)'), 
    'locale', true)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Sequence Messaging/select_Select a Localeen_USen_ (2)'), 'en_US', 
    true)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Save (17)'))

