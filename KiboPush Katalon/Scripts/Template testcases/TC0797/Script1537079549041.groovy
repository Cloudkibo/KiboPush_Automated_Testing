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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Template testcases/TC0788'), [:], FailureHandling.STOP_ON_FAILURE)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.uploadFile(findTestObject('Page_KiboPush  Create Broadcast Tem/gal_img'), img)

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control (4)'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/textarea_form-control (3)'), 'h')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/h6_ Add Button (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control_1 (1)'), 'google')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/div_Open a website (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control_2'), 'google.com')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/button_Done (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/h6_ Add Button (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control_1 (1)'), 'google')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/div_Open a website (1)'))

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/input_form-control_2'), 'google.com')

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/button_Done (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/category'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboPush  Create Broadcast Tem/li_Customer Behavior'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/button_Create (1)'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_KiboPush  Create Broadcast Tem/div_Broadcast created successf'))
