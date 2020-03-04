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

WebUI.callTestCase(findTestCase('Manual_Integeration/TC0001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/h3_feed1'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/label_Page'))

//WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/label_Subscriptions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Enabled'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/button_Update Stories'), FailureHandling.STOP_ON_FAILURE)

