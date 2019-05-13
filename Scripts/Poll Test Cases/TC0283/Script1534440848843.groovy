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

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Create New (1) (3)'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/button_Create New Poll (1) (1) (3)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/textarea_form-control'), 'h')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Poll/input_Response1_form-control'), '1')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Poll/input_Response2_form-control'), '2')

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Poll/input_Response3_form-control (1)'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/button_Next (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/a_See Segmentation Here'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Segmented Lists/h3_Subscribers Segmentation Lists (2)'))

