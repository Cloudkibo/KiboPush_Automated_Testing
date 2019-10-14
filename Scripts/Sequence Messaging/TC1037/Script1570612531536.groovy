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

//WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Whatsapp/broadcast/go to broadcasting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sequence Messaging/open polls'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboEngage  Polls/button_Create New'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Polls/h3_Create Poll'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_KiboEngage  Polls/button_Create New Poll'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/textarea_form-control (5)'), 'h')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control (7)'), '1')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_1 (3)'), '2')

WebUI.setText(findTestObject('Page_KiboPush  Create Poll/input_form-control_2 (2)'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Poll/button_Set Action (1)'))

WebUI.delay(2)



