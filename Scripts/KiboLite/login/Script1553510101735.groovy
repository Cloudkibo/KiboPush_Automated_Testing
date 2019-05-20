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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kibolite.cloudkibo.com/')

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=http://kibolite.cloudkibo.com')

WebUI.click(findTestObject('Page_CloudKibo/a_Login (2) (1) (1)'))

WebUI.setText(findTestObject('Page_KiboPush/input_email (10) (1) (1)'), 'faizan@cloudkibo.com')

WebUI.setEncryptedText(findTestObject('Page_CloudKibo/input_Sign In_password (7)'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Page_CloudKibo/button_Sign In (4) (1)'))

WebUI.click(findTestObject('Page_ Dashboard/h3_Dashboard (1)'))

WebUI.delay(3)

