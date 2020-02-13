import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Generic_broadcast_testcases/FlowBuilder/TC0014'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_ Add Quick Reply (1)'))

WebUI.setText(findTestObject('Object Repository/reply/Page_KiboEngage  Create Broadcast/input_Upload Image_form-control (1)'),
	'zindgi')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_ Add Action'))

WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/UnAssignTag'))
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/select_Select a messageStep by step help fo_135ba4'))
//
//WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/save_button_1'))
//
//WebUI.delay(2)
////WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_zindgi'))
//WebUI.verifyTextPresent("zindgi", true)