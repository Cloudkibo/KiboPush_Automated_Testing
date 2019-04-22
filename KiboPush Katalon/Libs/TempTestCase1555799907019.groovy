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


RunConfiguration.setExecutionSettingFile('/tmp/Katalon/20190421_033826/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.callTestCase(findTestCase(\'Template testcases/open broadcasting\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.callTestCase(findTestCase(\'s-sidebar_navigation/individualAccount/Template\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_KiboEngage  Templates/select_filter_template_broadcast_templates\'), \'Research\', \n    true)\n\nWebUI.delay(2)\n\nWebDriver driver = DriverFactory.getWebDriver()\n\nList<WebElement> rows_table = driver.findElements(By.xpath(\'//*[@id=\"local_data\"]/table/tbody/tr\'))\n\nString category = rows_table.get(0).findElement(By.xpath(\'.//td[4]\')).getText()\n\nprintln(category)\n\nif (category == \'Research\') {\n    WebUI.verifyEqual(1, 1)\n} else {\n    WebUI.verifyEqual(0, 1)\n}\n\n', FailureHandling.STOP_ON_FAILURE, true)
