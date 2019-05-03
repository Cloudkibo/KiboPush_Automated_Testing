import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Smart Replies/TC0619'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_KiboPush  Create Bot/button_Add Questions'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Create Bot/Bot Question1'), 'How are you?')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Create Bot/Bot Question2'), 'How are you doing?')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Create Bot/Bot Question3'), 'How are you feeling?')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Create Bot/Bot Answer Questions'), 'I am doing good.')

WebUI.delay(2)
