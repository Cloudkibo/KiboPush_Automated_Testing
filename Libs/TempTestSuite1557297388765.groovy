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


suiteProperties.put('id', 'Test Suites/Arveen suits/Autoposting')

suiteProperties.put('name', 'Autoposting')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Arveen suits\\Autoposting\\20190508_113628\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/Autoposting', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/open automation', 'Test Cases/Autoposting TestCases/open automation',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0369', 'Test Cases/Autoposting TestCases/TC0369',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0370', 'Test Cases/Autoposting TestCases/TC0370',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0371', 'Test Cases/Autoposting TestCases/TC0371',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0372', 'Test Cases/Autoposting TestCases/TC0372',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0373', 'Test Cases/Autoposting TestCases/TC0373',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0375', 'Test Cases/Autoposting TestCases/TC0375',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0378', 'Test Cases/Autoposting TestCases/TC0378',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0379', 'Test Cases/Autoposting TestCases/TC0379',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0380', 'Test Cases/Autoposting TestCases/TC0380',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0381', 'Test Cases/Autoposting TestCases/TC0381',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0382', 'Test Cases/Autoposting TestCases/TC0382',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0383', 'Test Cases/Autoposting TestCases/TC0383',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0384', 'Test Cases/Autoposting TestCases/TC0384',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0385', 'Test Cases/Autoposting TestCases/TC0385',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0390-BackButton', 'Test Cases/Autoposting TestCases/TC0390-BackButton',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0390', 'Test Cases/Autoposting TestCases/TC0390',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0391', 'Test Cases/Autoposting TestCases/TC0391',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0394', 'Test Cases/Autoposting TestCases/TC0394',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0395', 'Test Cases/Autoposting TestCases/TC0395',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0396', 'Test Cases/Autoposting TestCases/TC0396',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0397', 'Test Cases/Autoposting TestCases/TC0397',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0398', 'Test Cases/Autoposting TestCases/TC0398',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0399', 'Test Cases/Autoposting TestCases/TC0399',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0400', 'Test Cases/Autoposting TestCases/TC0400',  null), new TestCaseBinding('Test Cases/Autoposting TestCases/TC0401', 'Test Cases/Autoposting TestCases/TC0401',  null)])
