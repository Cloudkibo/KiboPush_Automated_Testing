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


WebUI.callTestCase(findTestCase('Whatsapp/Updated_Whatsapp_Livechat/connect_Whatsp_Testcases/RedirectTowhtspScreen'), [:],
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Integeration/Page_KiboChat  Api Settings/button_Disconnect'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Integeration/Page_KiboChat  Api Settings/h5_Disconnect WhatsApp Account'))

WebUI.setEncryptedText(findTestObject('Object Repository/Integeration/Page_KiboChat  Api Settings/input_If you wish to proceed please enter y_388405'),
	'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Integeration/Page_KiboChat  Api Settings/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Integeration/Page_KiboChat  Api Settings/div_Disconnected Successfully'))