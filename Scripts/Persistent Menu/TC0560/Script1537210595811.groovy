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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.delay(3)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.uploadFile(findTestObject('Page_KiboPush  Menu/upload_file'), img)

WebUI.delay(10)

WebUI.setText(findTestObject('Page_KiboPush  Menu/Gallery Subtitle'), 'Subtitle')

WebUI.click(findTestObject('Page_KiboPush  Menu/h6_ Add Button'))

WebUI.setText(findTestObject('Page_KiboPush  Menu/input_Button Title_form-contro'), 'Button1')

WebUI.click(findTestObject('Page_KiboPush  Menu/h7_Open a website'))

WebUI.setText(findTestObject('Page_KiboPush  Menu/input_Open Website_form-contro'), 'www.kibopush.com')

WebUI.click(findTestObject('Page_KiboPush  Menu/button_Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Menu/button_Save'))

WebUI.delay(2)

