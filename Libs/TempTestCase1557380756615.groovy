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


RunConfiguration.setExecutionSettingFile('C:\\Users\\CLOUDK~1\\AppData\\Local\\Temp\\Katalon\\20190509_104556\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.maximizeWindow()\n\nWebUI.navigateToUrl(\'https://skiboengage.cloudkibo.com/\')\n\nWebUI.navigateToUrl(\'https://saccounts.cloudkibo.com/?continue=https://skiboengage.cloudkibo.com\')\n\nWebUI.click(findTestObject(\'Page_CloudKibo/a_Login (6)\'))\n\nWebUI.setText(findTestObject(\'Page_CloudKibo/input_email (1)\'), \'arveen@arveen.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_CloudKibo/input_password (4)\'), \'Sq3Tv/oKKfCfT8/WA5LKPA==\')\n\nWebUI.click(findTestObject(\'Page_CloudKibo/button_Sign In (12)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/span_Broadcasting (4)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Dashboard/span_Broadcasts (3)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Broadcast/span_Create New (3)\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Broadcast/button_Create New Broadcast (2)\'))\n\nWebUI.delay(2)\n\nWebUI.scrollToPosition(0, 0)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Create Broadcast/h3_Create Broadcast\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

