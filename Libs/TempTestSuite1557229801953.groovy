import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Faizan Suits/greetingText')

suiteProperties.put('name', 'greetingText')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\greetingText\\20190507_165001\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/greetingText', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Welcome messages/open Manage Pages', 'Test Cases/Welcome messages/open Manage Pages',  null), new TestCaseBinding('Test Cases/Greeting text/TC1027', 'Test Cases/Greeting text/TC1027',  null), new TestCaseBinding('Test Cases/Greeting text/TC1028', 'Test Cases/Greeting text/TC1028',  null), new TestCaseBinding('Test Cases/Greeting text/TC1029', 'Test Cases/Greeting text/TC1029',  null), new TestCaseBinding('Test Cases/Greeting text/TC1030', 'Test Cases/Greeting text/TC1030',  null), new TestCaseBinding('Test Cases/Greeting text/TC1032', 'Test Cases/Greeting text/TC1032',  null), new TestCaseBinding('Test Cases/Greeting text/TC1033', 'Test Cases/Greeting text/TC1033',  null)])
