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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/KiboAPI')

suiteProperties.put('name', 'KiboAPI')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\KiboAPI\\20190508_113653\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/KiboAPI', suiteProperties, [new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11128', 'Test Cases/KiboAPI Testcases/TC11128',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11130', 'Test Cases/KiboAPI Testcases/TC11130',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11131', 'Test Cases/KiboAPI Testcases/TC11131',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11132', 'Test Cases/KiboAPI Testcases/TC11132',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11135', 'Test Cases/KiboAPI Testcases/TC11135',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11136', 'Test Cases/KiboAPI Testcases/TC11136',  null), new TestCaseBinding('Test Cases/KiboAPI Testcases/TC11137', 'Test Cases/KiboAPI Testcases/TC11137',  null)])
