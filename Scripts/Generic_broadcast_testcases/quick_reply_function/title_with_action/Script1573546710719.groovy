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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/select_Select an actionsend new messagesubs_789dbf'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/select_Select a messageStep by step help fo_135ba4'))

WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_Save (1)'))

WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/quickReply/Page_KiboEngage  Create Broadcast/button_zindgi'))
WebUI.verifyTextPresent("zindgi", false)
