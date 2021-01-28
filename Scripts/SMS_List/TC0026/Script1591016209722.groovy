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

WebUI.callTestCase(findTestCase('SMS_List/TC0002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/button_Reset'))

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/h5_Reset Data'))

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/p_Are you sure you want to reset data'))

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/button_Yes'))

//WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/span_1'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/uploadContact/Page_KiboEngage  Dashboard/div_No data to display'))

