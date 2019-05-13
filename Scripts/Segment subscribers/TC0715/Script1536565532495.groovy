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

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/h3_Create SubList of Subscribe (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/input_segmentationType (1)'))

String list = WebUI.executeJavaScript('return (Math.floor(Math.random() * (+20 - +1)) + +1).toString()+ new Date().getHours().toString()+new Date().getMinutes().toString()+new Date().getSeconds().toString();;', 
    null)

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Dashboard/input_listName'), list)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/span_Please choose a valid con'))

