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


WebUI.callTestCase(findTestCase('s-sidebar_navigation/individualAccount/Autoposting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/span_Add Feed (4) (1)'))

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Twitter (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush  Autoposting/input_form-control (4)'), 'https://twitter.com/arveenkumar55')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Autoposting/button_Add Twitter Feed'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/i_la la-gear (3)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/New create broadcast/Page_KiboEngage  Autoposting/button_User Guide_close'))
//
//WebUI.delay(2)
WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Feed Settings'))

WebUI.delay(2)

WebUI.verifyTextPresent("Action", false)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Back (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_KiboPush  Autoposting/h3_Auto Posting (1)'))

WebUI.delay(2)


//WebUI.click(findTestObject('Page_KiboPush  Autoposting/a_'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Page_KiboPush  Autoposting/button_Delete'))
//
//WebUI.delay(2)
