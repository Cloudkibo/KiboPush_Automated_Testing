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


WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_ Add Quick Reply (1)'))

WebUI.setText(findTestObject('Object Repository/reply/Page_KiboEngage  Create Broadcast/input_Upload Image_form-control (1)'), 
    'zindgi')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_ Add Action'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/quick_reply_broadcast/Page_KiboEngage  Create Broadcast/button_Reply with a message'))

WebUI.click(findTestObject('Object Repository/quick_reply_broadcast/Page_KiboEngage  Create Broadcast/div_New message will be created when you cl_d0a0b7'))

WebUI.click(findTestObject('Object Repository/broadcast_test_cases_new/Page_KiboEngage  Create Broadcast/save_button'))

WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_zindgi'))
WebUI.verifyTextPresent("zindgi", false)

