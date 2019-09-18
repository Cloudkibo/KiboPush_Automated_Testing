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
//
//WebUI.callTestCase(findTestCase('Sequence Messaging/TC0982'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Sequence Messaging/input_Sequence Name_form-contr'), 'Sequence1')
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboPush  Sequence Messaging/button_Create'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1)'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1)'))
//
//WebUI.delay(2)
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


WebUI.callTestCase(findTestCase('Sequence Messaging/TC0982'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboPush  Sequence Messaging/input_Sequence Name_form-contr'), 'Sequence1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Sequence Messaging/button_Create'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1)'))

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
WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Sequence Messaging/button_Add Message (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/h5_Text'))

WebUI.setText(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Create Broadcast/textarea_t'), 't')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Sequence Message/button_Next'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboEngage  Create Broadcast/div_New text component added'))

WebUI.click(findTestObject('Page_KiboPush  Edit Message/button_Save_1'))
WebUI.delay(2)
>>>>>>> c25a5a27b3d22921f31a2343ee449522beca7feb
