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

WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Login_Muzamil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/Muzamil Profile button'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Setup Using Wizard (4) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Add Pages/a_Continue (2) (1) (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Getting Started/a_Share Page Link'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Getting Started/button_Copy Link'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Getting Started/div_CopiedLink Copied Successfully'))

