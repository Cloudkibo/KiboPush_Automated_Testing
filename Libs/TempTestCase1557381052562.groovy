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


RunConfiguration.setExecutionSettingFile('/tmp/Katalon/20190509_105052/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.maximizeWindow()\n\nWebUI.navigateToUrl(\'https://kiboengage.cloudkibo.com/\')\n\nWebUI.navigateToUrl(\'https://accounts.cloudkibo.com/?continue=https://kiboengage.cloudkibo.com\')\n\nWebUI.click(findTestObject(\'Page_CloudKibo/a_Login (2) (1) (1)\'))\n\nWebUI.setText(findTestObject(\'Page_KiboPush/input_email (10) (1) (1)\'), \'individual@cloudkibo.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_CloudKibo/input_Sign In_password (7)\'), \'RigbBhfdqOBGNlJIWM1ClA==\')\n\nWebUI.click(findTestObject(\'Page_KiboPush/button_Sign In (10) (1) (2)\'))\n\nWebUI.click(findTestObject(\'Page_KiboPush  Dashboard/h3_Dashboard (57)\'))\n\nWebUI.delay(3)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/a_SMS (2) (1) (1) (1) (3)\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/span_Messenger (1) (1) (1) (3)\'))\n\nWebUI.delay(2)\n\n', FailureHandling.STOP_ON_FAILURE, true)

