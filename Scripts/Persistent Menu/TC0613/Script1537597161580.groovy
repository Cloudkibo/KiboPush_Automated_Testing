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

WebUI.callTestCase(findTestCase('Persistent Menu/open_popover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Menu/input_Reply with a message_ope (2) (1) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Menu/h7_Open a website (2)'))


WebUI.setText(findTestObject('Page_KiboPush  Menu/input_Website URL to open_form (2) (1) (1)'), 'www.google.com')

WebUI.click(findTestObject('Page_KiboPush  Menu/button_Done (4) (1) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Menu/button_ Add Sub Menu (3) (1) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Menu/Open Popover sub menu (2) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Menu/input_Reply with a message_ope (3) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Menu/h7_Open a website (2)'))


WebUI.setText(findTestObject('Page_KiboPush  Menu/input_Website URL to open_form (3) (1)'), 'www.dawn.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Menu/input_Website URL to open_form (4)'), 'www.dawn.com')

WebUI.click(findTestObject('Page_KiboPush  Menu/button_Done (5)'))

