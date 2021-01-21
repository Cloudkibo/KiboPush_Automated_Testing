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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SMS/sms broadcast/TC11189'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/input_Title_form-control m-input'),
	'ok')

//WebUI.click(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_12283357721'))



WebUI.setText(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_Message will be sent from selected phon_fc423a'), '+12283357721')


//WebUI.sendKeys(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_Message will be sent from selected phon_fc423a'),
//	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/textarea_Message_postTextArea'),
	'm')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/button_Send'))

//WebUI.click(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_Message will be sent from selected phon_fc423a'))
//
//WebUI.click(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_Message will be sent from selected phon_ff5bec'))
//
//WebUI.click(findTestObject('Object Repository/SMS_broadcast/Page_KiboEngage  Broadcasts/div_Message will be sent from selected phon_ff5bec_1'))


