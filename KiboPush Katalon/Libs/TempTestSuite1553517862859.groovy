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


suiteProperties.put('id', 'Test Suites/capture')

suiteProperties.put('name', 'capture')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/Katalon/production/KiboPush/Reports/capture/20190325_174422/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/capture', suiteProperties, [new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0505', 'Test Cases/Comment Capture TestCases/TC0505',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0507', 'Test Cases/Comment Capture TestCases/TC0507',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0508', 'Test Cases/Comment Capture TestCases/TC0508',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0509', 'Test Cases/Comment Capture TestCases/TC0509',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0510', 'Test Cases/Comment Capture TestCases/TC0510',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0511', 'Test Cases/Comment Capture TestCases/TC0511',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0512', 'Test Cases/Comment Capture TestCases/TC0512',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0513', 'Test Cases/Comment Capture TestCases/TC0513',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0514', 'Test Cases/Comment Capture TestCases/TC0514',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0515', 'Test Cases/Comment Capture TestCases/TC0515',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0522', 'Test Cases/Comment Capture TestCases/TC0522',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0523', 'Test Cases/Comment Capture TestCases/TC0523',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0524', 'Test Cases/Comment Capture TestCases/TC0524',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0526', 'Test Cases/Comment Capture TestCases/TC0526',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0527', 'Test Cases/Comment Capture TestCases/TC0527',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0528', 'Test Cases/Comment Capture TestCases/TC0528',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0529', 'Test Cases/Comment Capture TestCases/TC0529',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0530', 'Test Cases/Comment Capture TestCases/TC0530',  null), new TestCaseBinding('Test Cases/Comment Capture TestCases/TC0531', 'Test Cases/Comment Capture TestCases/TC0531',  null)])
