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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Keys as Keys

WebUI.delay(3)

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_KiboPush  Menu/upload_file (1)'), img)

WebUI.delay(15)

WebUI.click(findTestObject('Page_KiboEngage  Dashboard/h4_KIBOPUSH'))

WebUI.sendKeys(findTestObject('Page_KiboPush  Menu/input_Message_form-control (1)'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_KiboPush  Menu/input_Message_form-control (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_KiboPush  Menu/Card Sub Title (2)'), 'Sub Title')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Create Menu/button_Save (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_KiboEngage  Create Menu/div_card must have a title'))

WebUI.delay(2)
