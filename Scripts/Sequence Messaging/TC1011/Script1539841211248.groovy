<<<<<<< HEAD
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import internal.GlobalVariable as GlobalVariable
//
//WebUI.callTestCase(findTestCase('Sequence Messaging/TC0980'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_Edit (1) (1)'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/Delete Message Icon (1)'))
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Delete (3) (1)'))
//
//WebUI.delay(4)
//
//WebUI.scrollToPosition(0, 0)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1) (1)'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_New Message (4) (1)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/i_New Message_convoTitle (3) (1)'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_Rename_form-control (3) (1)'), 'Message1')
//
//WebUI.scrollToElement(findTestObject('Page_KiboPush  Edit Message/div_View Facebook guidelines r (1) (1)'), 2)
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save (3) (1)'))
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/div_Text (2) (1)'))
//
//WebUI.setText(findTestObject('Page_KiboPush  Edit Message/Set Text Component'), 'Text1')
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/h6_ Add Button (1)'))
//
//WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_Button Title_form-contro (1)'), 'Button1')
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/h7_Open a website'))
//
//WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_form-control'), 'www.google.com')
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Done (1)'))
//
//WebUI.scrollToPosition(0, 0)
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1 (3)'))
//
//WebUI.click(findTestObject('Page_KiboPush  Edit Message/a_Back (3)'))
//
=======
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
WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_Edit (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/Delete Message Icon (1)'))

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Delete (3) (1)'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)


WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1) (1)'))
WebUI.scrollToPosition(0, 0)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h5_Text'))

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/textarea_t'), 't')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Sequence Message/button_Next'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_New text component added'))

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1'))

WebUI.scrollToPosition(0, 0)
WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/span_New Message (4) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/i_New Message_convoTitle (3) (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Edit Message/input_Rename_form-control (3) (1)'), 'Message1')

WebUI.scrollToElement(findTestObject('Page_KiboPush  Edit Message/div_View Facebook guidelines r (1) (1)'), 2)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save (3) (1)'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h5_Text'))

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/textarea_t'),
	't')
WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/div_ Add Button'))

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/div_Open a website'))

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/input_Button Title_form-control'),
	'Button 1')

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/input_Open Website_form-control'), 
    'gooogle.com')


WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/div_Button 1'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Sequence Message/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/Page_KiboEngage  Create Broadcast/div_New text component added'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1 (3)'))
WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

//WebUI.click(findTestObject('Page_KiboPush  Edit Message/a_Back (3)'))

>>>>>>> c25a5a27b3d22921f31a2343ee449522beca7feb
