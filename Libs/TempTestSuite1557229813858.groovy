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


suiteProperties.put('id', 'Test Suites/Faizan Suits/welcomeMessages')

suiteProperties.put('name', 'welcomeMessages')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\welcomeMessages\\20190507_165013\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/welcomeMessages', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Welcome messages/open Manage Pages', 'Test Cases/Welcome messages/open Manage Pages',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1034', 'Test Cases/Welcome messages/TC1034',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1035', 'Test Cases/Welcome messages/TC1035',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1036', 'Test Cases/Welcome messages/TC1036',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1037', 'Test Cases/Welcome messages/TC1037',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1038', 'Test Cases/Welcome messages/TC1038',  null), new TestCaseBinding('Test Cases/Welcome messages/TC1039', 'Test Cases/Welcome messages/TC1039',  null)])
