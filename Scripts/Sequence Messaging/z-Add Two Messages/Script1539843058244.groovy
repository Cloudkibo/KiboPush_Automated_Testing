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

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/i_Messages_fa fa-edit (3)'))

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/Delete Message Icon'))

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Delete (4)'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (2)'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_New Message (5)'))

WebUI.click(findTestObject('Page_KiboPush  Edit Message/i_New Message_convoTitle (4) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_Rename_form-control (4) (1)'), 'Message1')

WebUI.scrollToElement(findTestObject('Page_KiboPush  Edit Message/div_View Facebook guidelines r (2)'), 2)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save (4) (1)'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/div_Text (3) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Edit Message/Set Text Component (3)'), 'Text1')

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1 (4) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/a_Back'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (2)'))

WebUI.delay(2)

