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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/wizard')

suiteProperties.put('name', 'wizard')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\wizard\\20190508_102222\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/wizard', suiteProperties, [new TestCaseBinding('Test Cases/wizard TestCases/TC0028', 'Test Cases/wizard TestCases/TC0028',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0031', 'Test Cases/wizard TestCases/TC0031',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0032', 'Test Cases/wizard TestCases/TC0032',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0038', 'Test Cases/wizard TestCases/TC0038',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0041', 'Test Cases/wizard TestCases/TC0041',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0042', 'Test Cases/wizard TestCases/TC0042',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0047', 'Test Cases/wizard TestCases/TC0047',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0050', 'Test Cases/wizard TestCases/TC0050',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0051', 'Test Cases/wizard TestCases/TC0051',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC0053', 'Test Cases/wizard TestCases/TC0053',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC11062', 'Test Cases/wizard TestCases/TC11062',  null), new TestCaseBinding('Test Cases/wizard TestCases/TC11020', 'Test Cases/wizard TestCases/TC11020',  null)])
