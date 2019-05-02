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

WebUI.delay(3)

String list = WebUI.executeJavaScript('return (Math.floor(Math.random() * (+20 - +1)) + +1).toString()+ new Date().getHours().toString()+new Date().getMinutes().toString()+new Date().getSeconds().toString();;', 
    null)

WebUI.setText(findTestObject('Page_KiboPush  Dashboard/input_listName (11) (1)'), list)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Dashboard/select_Select ConditionFirst N (10) (1)'), 'locale', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_KiboPush  Dashboard/select_Select Criteriais (3) (1)'), 'is', true)

WebUI.selectOptionByValue(findTestObject('Page_KiboEngage  Create Sublist/select_Select a Localeen_USen_GB'), 'en_US', true)

WebUI.click(findTestObject('Page_KiboEngage  Create Sublist/button_Save'))

WebUI.click(findTestObject('Page_KiboEngage  Create Sublist/div_List created successfully'))

