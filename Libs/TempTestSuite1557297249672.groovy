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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/Login')

suiteProperties.put('name', 'Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\Login\\20190508_113409\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/Login', suiteProperties, [new TestCaseBinding('Test Cases/Login Test Cases/TC0001', 'Test Cases/Login Test Cases/TC0001',  null), new TestCaseBinding('Test Cases/Login Test Cases/TC0002', 'Test Cases/Login Test Cases/TC0002',  null), new TestCaseBinding('Test Cases/Login Test Cases/TC0003', 'Test Cases/Login Test Cases/TC0003',  null), new TestCaseBinding('Test Cases/Login Test Cases/TC0004', 'Test Cases/Login Test Cases/TC0004',  null), new TestCaseBinding('Test Cases/Login Test Cases/TC0005', 'Test Cases/Login Test Cases/TC0005',  null), new TestCaseBinding('Test Cases/Login Test Cases/TC0012', 'Test Cases/Login Test Cases/TC0012',  null)])
