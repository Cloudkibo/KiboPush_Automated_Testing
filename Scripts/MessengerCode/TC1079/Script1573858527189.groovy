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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Messenger Code'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/button_Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/Delete'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/div_Messenger Ref URL has been deleted'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/a_Create New'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Messenger Code/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Messenger Code/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Messenger Code/div_Messenger Code saved successfully'))

