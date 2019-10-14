import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboEngage  Getting Started/span_4'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/span_Add Feeds'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/button_WordPress'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/button_View Integration Guidelines'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/a_WordPresscom'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/h4_Guielines for integrating WordPress blogs'))

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Object Repository/Page_KiboEngage  Autoposting/h4_Guielines for integrating WordPress blogs'), 
    1000, 1000)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Object Repository/Page_KiboEngage  Autoposting/button_WordPress'), 1000, 1000)

WebUI.delay(2)

