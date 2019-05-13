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

WebUI.navigateToUrl('https://saccounts.cloudkibo.com/?continue=https://skiboengage.cloudkibo.com')

WebUI.delay(2)

WebUI.click(findTestObject('Page_CloudKibo/a_Login (4) (2)'))

WebUI.setText(findTestObject('Page_CloudKibo/input_Sign In_email (4)'), 'muzamil.abbas@khi.iba.edu.pk')

WebUI.setEncryptedText(findTestObject('Page_CloudKibo/input_Sign In_password (4)'), 'ZOMPkeJIpHVS6OGLcNHjig==')

WebUI.click(findTestObject('Page_CloudKibo/button_Sign In (8)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/h4_KIBOPUSH (3)'))

