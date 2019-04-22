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


suiteProperties.put('id', 'Test Suites/Faizan Suits/ManagePages')

suiteProperties.put('name', 'ManagePages')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/faizan/Drive/KiboPush_Automated_Testing/KiboPush Katalon/Reports/Faizan Suits/ManagePages/20190420_215128/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/ManagePages', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Welcome messages/open Manage Pages', 'Test Cases/Welcome messages/open Manage Pages',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0402', 'Test Cases/Manage Pages TestCases/TC0402',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0403', 'Test Cases/Manage Pages TestCases/TC0403',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0404', 'Test Cases/Manage Pages TestCases/TC0404',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0405', 'Test Cases/Manage Pages TestCases/TC0405',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0406', 'Test Cases/Manage Pages TestCases/TC0406',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0407', 'Test Cases/Manage Pages TestCases/TC0407',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0408', 'Test Cases/Manage Pages TestCases/TC0408',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0409', 'Test Cases/Manage Pages TestCases/TC0409',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0410', 'Test Cases/Manage Pages TestCases/TC0410',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0411', 'Test Cases/Manage Pages TestCases/TC0411',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0412', 'Test Cases/Manage Pages TestCases/TC0412',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0413', 'Test Cases/Manage Pages TestCases/TC0413',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0414', 'Test Cases/Manage Pages TestCases/TC0414',  null), new TestCaseBinding('Test Cases/Manage Pages TestCases/TC0415', 'Test Cases/Manage Pages TestCases/TC0415',  null)])
