import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/tmp/Katalon/20190325_142016/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Welcome Message TestCases/Open Welcome Message Edit Screen\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/i_Welcome Message_fa fa-times fa-stack-2x (2) (1)\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/h6_List\'))\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/input_Welcome Message_form-control\'), \'title1\')\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/List Item2 Title\'), \'title2\')\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/a_Add Action (2)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/h7_Open a webview (5)\'))\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/input_Url_form-control (5)\'), \'https://kiboengage.cloudkibo.com\')\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/button_Done (5)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/a_Add Action_1\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/h7_Open a webview (5)\'))\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/input_Url_form-control (5)\'), \'https://kiboengage.cloudkibo.com\')\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Edit Template/button_Done (5)\'))\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/List Item1 Subtitle\'), \'1\')\n\nWebUI.setText(findTestObject(\'Page_KiboEngage  Edit Template/List Item2 Subtitle\'), \'2\')\n\n', FailureHandling.STOP_ON_FAILURE, true)

