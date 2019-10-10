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

WebUI.callTestCase(findTestCase('Whatsapp/broadcast/TC11227'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/select_Filter by typetextaudiofilemediamiscellaneousall'), 
    'text', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/span_text'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/select_Filter by typetextaudiofilemediamiscellaneousall'), 
    'audio', true)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/span_audio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/select_Filter by typetextaudiofilemediamiscellaneousall'), 
    'file', true)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/span_file'))
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/select_Filter by typetextaudiofilemediamiscellaneousall'), 
    'media', true)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/span_media'))
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/select_Filter by typetextaudiofilemediamiscellaneousall'), 
    'miscellaneous', true)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Broadcast/Page_KiboEngage  Broadcasts/span_Miscellaneous'))

