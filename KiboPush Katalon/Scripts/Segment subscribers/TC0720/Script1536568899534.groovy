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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Segment subscribers/TC0712'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/h3_Create SubList of Subscribe (4) (1) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/input_segmentationType (3) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Dashboard/input_listName (2) (1) (1)'), '27')

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Dashboard/select_Select ConditionFirst N (7) (1)'), 'email', true)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/td_Select Criteriais'))

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Dashboard/select_Select Criteriais'), 'is', true)

WebUI.setText(findTestObject('Page_KiboPush  Dashboard/input_text (7)'), 'i141615@nu.edu.pk')

WebUI.click(findTestObject('Page_KiboPush  Dashboard/button_Save (11)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/div_New list is empty. Try cre (1)'))

