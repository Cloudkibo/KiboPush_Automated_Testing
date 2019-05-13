import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\CLOUDK~1\\AppData\\Local\\Temp\\Katalon\\20190509_094903\\execution.properties')

TestCaseMain.beforeStart()

         TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Create Broadcast/h6_Text\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Create Broadcast/h3_Add Text Component\'))\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Create Broadcast/button_Add\'))\n\nWebUI.delay(2)\n\nWebUI.scrollToPosition(0, 0)\n\nWebUI.click(findTestObject(\'Page_KiboEngage  Create Broadcast/div_New text component added\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

