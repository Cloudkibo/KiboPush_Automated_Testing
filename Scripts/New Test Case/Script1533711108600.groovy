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

WebUI.navigateToUrl('https://staging.kibopush.com/')

WebUI.click(findTestObject('Page_KiboPush  Sign In/a_Login'))

WebUI.click(findTestObject('Page_KiboPush  Sign In/button_Individual Account'))

WebUI.setText(findTestObject('Page_KiboPush  Sign In/input_form-control m-input'), 'i141615@nu.edu.pk')

WebUI.setEncryptedText(findTestObject('Page_KiboPush  Sign In/input_form-control m-input_1'), 'Sq3Tv/oKKfDNGi1QgSywNA==')

WebUI.click(findTestObject('Page_KiboPush  Sign In/button_Sign In'))

WebUI.click(findTestObject('Page_KiboPush  Dashboard/span_Broadcasts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboPush  Broadcast/select_Filter by type...textim (5)'), 
    'list', true)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Broadcast/span_list'))

WebUI.closeBrowser()

