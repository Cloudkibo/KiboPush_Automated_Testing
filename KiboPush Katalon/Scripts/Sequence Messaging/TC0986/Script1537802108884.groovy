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

WebUI.callTestCase(findTestCase('Sequence Messaging/TC0980'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_Edit (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/Delete Message Icon'))

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Delete (3)'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_New Message (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/i_New Message_convoTitle'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_Rename_form-control'), 'Message1')

WebUI.scrollToElement(findTestObject('Page_KiboPush  Edit Message/div_View Facebook guidelines r'), 2)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/div_Text'))

WebUI.setText(findTestObject('Page_KiboPush  Edit Message/Set Text Component'), 'Text1')

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/a_Back'))

