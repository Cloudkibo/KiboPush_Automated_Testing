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

WebUI.callTestCase(findTestCase('KiboLite/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_ Dashboard/span_Broadcast (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/a_Create Push Message (1)'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Image'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New image component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Card'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New card component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Gallery'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New gallery component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Audio'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New audio component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Video'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New video component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_File'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New file component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_List'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New list component added'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/h6_Media'))

WebUI.click(findTestObject('Object Repository/Page_ Business Gateway/div_New media component added'))

