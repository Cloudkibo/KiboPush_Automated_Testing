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

WebUI.callTestCase(findTestCase('Segment subscribers/TC0712'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/input_segmentationType (9) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Dashboard/input_listName (9) (1)'), '34')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Dashboard/select_Select ConditionFirst N (8) (1)'), 
    'page', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Dashboard/select_Select Criteriais (1) (1)'), 
    'is', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Dashboard/select_Select a PageTest5Naya'), 'Arveen kumar', 
    true)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/button_Save (12)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/div_List created successfully (5)'))