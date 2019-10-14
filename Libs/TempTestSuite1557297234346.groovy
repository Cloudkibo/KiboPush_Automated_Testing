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


suiteProperties.put('id', 'Test Suites/Faizan Suits/Landing Pages')

suiteProperties.put('name', 'Landing Pages')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\Landing Pages\\20190508_113354\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/Landing Pages', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Invite subscribers/open growth tools', 'Test Cases/Invite subscribers/open growth tools',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11270', 'Test Cases/Landing Pages/TC11270',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11260', 'Test Cases/Landing Pages/TC11260',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11275', 'Test Cases/Landing Pages/TC11275',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11277', 'Test Cases/Landing Pages/TC11277',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11268', 'Test Cases/Landing Pages/TC11268',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11263', 'Test Cases/Landing Pages/TC11263',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11272', 'Test Cases/Landing Pages/TC11272',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11265', 'Test Cases/Landing Pages/TC11265',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11266', 'Test Cases/Landing Pages/TC11266',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11257', 'Test Cases/Landing Pages/TC11257',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11274', 'Test Cases/Landing Pages/TC11274',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11239', 'Test Cases/Landing Pages/TC11239',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11278', 'Test Cases/Landing Pages/TC11278',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11261', 'Test Cases/Landing Pages/TC11261',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11262', 'Test Cases/Landing Pages/TC11262',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11245', 'Test Cases/Landing Pages/TC11245',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11271', 'Test Cases/Landing Pages/TC11271',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11267', 'Test Cases/Landing Pages/TC11267',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11259', 'Test Cases/Landing Pages/TC11259',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11269', 'Test Cases/Landing Pages/TC11269',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11241', 'Test Cases/Landing Pages/TC11241',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11276', 'Test Cases/Landing Pages/TC11276',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11279', 'Test Cases/Landing Pages/TC11279',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11240', 'Test Cases/Landing Pages/TC11240',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11264', 'Test Cases/Landing Pages/TC11264',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11258', 'Test Cases/Landing Pages/TC11258',  null), new TestCaseBinding('Test Cases/Landing Pages/TC11273', 'Test Cases/Landing Pages/TC11273',  null)])
