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


suiteProperties.put('id', 'Test Suites/Dashboard')

suiteProperties.put('name', 'Dashboard')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-muzamil/Downloads/Test cases/production/KiboPush/Reports/Dashboard/20190325_144205/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Dashboard', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard TestCases/TC0104', 'Test Cases/Dashboard TestCases/TC0104',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11070', 'Test Cases/Dashboard TestCases/TC11070',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11069', 'Test Cases/Dashboard TestCases/TC11069',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11068', 'Test Cases/Dashboard TestCases/TC11068',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11065', 'Test Cases/Dashboard TestCases/TC11065',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11064', 'Test Cases/Dashboard TestCases/TC11064',  null), new TestCaseBinding('Test Cases/Dashboard TestCases/TC11063', 'Test Cases/Dashboard TestCases/TC11063',  null)])
