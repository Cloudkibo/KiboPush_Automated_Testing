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


suiteProperties.put('id', 'Test Suites/Faizan Suits/KiboLite')

suiteProperties.put('name', 'KiboLite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/KiboPush_Automated_Testing/Reports/Faizan Suits/KiboLite/20190430_102018/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/KiboLite', suiteProperties, [new TestCaseBinding('Test Cases/KiboLite/login', 'Test Cases/KiboLite/login',  null), new TestCaseBinding('Test Cases/KiboLite/TC11077', 'Test Cases/KiboLite/TC11077',  null), new TestCaseBinding('Test Cases/KiboLite/TC11078', 'Test Cases/KiboLite/TC11078',  null), new TestCaseBinding('Test Cases/KiboLite/TC11079', 'Test Cases/KiboLite/TC11079',  null), new TestCaseBinding('Test Cases/KiboLite/TC11081', 'Test Cases/KiboLite/TC11081',  null), new TestCaseBinding('Test Cases/KiboLite/TC11085', 'Test Cases/KiboLite/TC11085',  null), new TestCaseBinding('Test Cases/KiboLite/TC11086', 'Test Cases/KiboLite/TC11086',  null), new TestCaseBinding('Test Cases/KiboLite/TC11087', 'Test Cases/KiboLite/TC11087',  null), new TestCaseBinding('Test Cases/KiboLite/TC11090', 'Test Cases/KiboLite/TC11090',  null), new TestCaseBinding('Test Cases/KiboLite/TC11091', 'Test Cases/KiboLite/TC11091',  null), new TestCaseBinding('Test Cases/KiboLite/TC11077', 'Test Cases/KiboLite/TC11077',  null), new TestCaseBinding('Test Cases/KiboLite/TC11079', 'Test Cases/KiboLite/TC11079',  null), new TestCaseBinding('Test Cases/KiboLite/TC11086', 'Test Cases/KiboLite/TC11086',  null), new TestCaseBinding('Test Cases/KiboLite/TC11078', 'Test Cases/KiboLite/TC11078',  null), new TestCaseBinding('Test Cases/KiboLite/TC11090', 'Test Cases/KiboLite/TC11090',  null), new TestCaseBinding('Test Cases/KiboLite/TC11091', 'Test Cases/KiboLite/TC11091',  null), new TestCaseBinding('Test Cases/KiboLite/TC11081', 'Test Cases/KiboLite/TC11081',  null), new TestCaseBinding('Test Cases/KiboLite/TC11087', 'Test Cases/KiboLite/TC11087',  null), new TestCaseBinding('Test Cases/KiboLite/TC11085', 'Test Cases/KiboLite/TC11085',  null)])
