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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accounts.cloudkibo.com/?continue=https://kiboengage.cloudkibo.com')

WebUI.click(findTestObject('Page_CloudKibo/a_Login (1)'))

WebUI.setText(findTestObject('Page_CloudKibo/input_Sign In_email'), 'arveenkumar55@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_CloudKibo/input_Sign In_password'), 'Sq3Tv/oKKfDNGi1QgSywNA==')

WebUI.click(findTestObject('Page_CloudKibo/button_Sign In (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Organization'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Invite Members'))

WebUI.delay(2)

WebUI.verifyTextNotPresent('Invite Members', false)

