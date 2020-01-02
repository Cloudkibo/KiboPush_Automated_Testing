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

WebUI.setText(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/input_Rename_form-control'), 'automated testing')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/button_Save'))

WebUI.click(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/div_Bot updated successfully'))

WebUI.verifyElementPresent(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/h3_automated testing'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/i_LuckyOrange_convoTitle'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/h5_Rename'), 1)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/input_Rename_form-control'), 'LuckyOrange')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/button_Save'))

WebUI.click(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/div_Bot updated successfully'))

WebUI.verifyElementPresent(findTestObject('Object Repository/smart_replies/Page_KiboChat  Create Bot/h3_LuckyOrange'),1)

