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


RunConfiguration.setExecutionSettingFile('/tmp/Katalon/20190315_144611/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'wizard TestCases/Login\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.delay(3)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/i_cloudkibo_fa fa-chevron-down\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/span_Setup Using Wizard\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Getting Started/a_Continue\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Getting Started/span_5\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Sub Menu\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Nested Menu\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Nested Menu\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Nested Menu\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Nested Menu\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Persistent Menu/button_ Add Nested Menu\'))\n\nWebUI.delay(2)\n\nWebUI.verifyTextNotPresent(\'+ Add Nested Menu\', false)\n\n', FailureHandling.STOP_ON_FAILURE, true)

