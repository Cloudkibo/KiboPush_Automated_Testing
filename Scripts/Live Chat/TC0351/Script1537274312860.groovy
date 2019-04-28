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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/TeamAccount/Live Chat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Live Chat/i_la la-plus (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Live Chat/select_Select teamabchellohell'), '5b94c3a62f76d36ff0caed1d', 
    true)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Live Chat/button_Assign'))

WebUI.setText(findTestObject('Page_KiboPush  Live Chat/input_m-messenger__form-input'), 'HI')

WebUI.sendKeys(findTestObject('Page_KiboPush  Live Chat/input_m-messenger__form-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_KiboPush  Live Chat/div_You can not send message. '))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Live Chat/span_ab'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Live Chat/i_la la-minus'))

