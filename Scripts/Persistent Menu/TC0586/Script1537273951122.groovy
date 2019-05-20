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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Persistent Menu/Go_to_menu_item'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Persistent Menu/TC0537'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h6_Media'))

String img = RunConfiguration.getProjectDir() + '/video.mp4'

WebUI.uploadFile(findTestObject('Page_KiboPush  Menu/upload_file'), img)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h6_ Add Button'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/h7_Open a website'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Create Menu/input_Open Website_form-control'), 'google.com')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/div_New media component added'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/div_Message Saved Successfully'))

