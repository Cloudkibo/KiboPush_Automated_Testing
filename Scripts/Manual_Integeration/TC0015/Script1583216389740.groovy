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

WebUI.selectOptionByValue(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/select_Filter by PageAllTest5Education123Te_f1a78b'), 
    '5c090d111276ef481a715931', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/span_Test5'))

WebUI.click(findTestObject('Object Repository/Manual_integeration/Page_KiboEngage  News Integration/h3_feed1'))
