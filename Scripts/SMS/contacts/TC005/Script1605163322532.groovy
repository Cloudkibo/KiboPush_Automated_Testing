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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kibochat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SMS/contacts/Open Subscribers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/button_-_m-portlet__nav-link btn m-btn m-bt_d31960'))

WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/h5_Edit Subscriber'))

WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/button_'))

WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/h3_Manage Subscribers'))

//WebUI.setText(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/input_Edit Subscriber_form-control m-input'),
//    '')
//
//WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/s_subscriber/Page_KiboChat  Subscribers/div_Subscriber name cannot be empty'))


