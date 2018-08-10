import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/KiboPush Broadcasts')

suiteProperties.put('name', 'KiboPush Broadcasts')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/baqarjafri/Katalon Studio/KiboPush/Reports/KiboPush Broadcasts/20180809_144845/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/KiboPush Broadcasts', suiteProperties, [new TestCaseBinding('Test Cases/TC0124', 'Test Cases/TC0124',  null), new TestCaseBinding('Test Cases/TC0125', 'Test Cases/TC0125',  null), new TestCaseBinding('Test Cases/TC0132', 'Test Cases/TC0132',  null), new TestCaseBinding('Test Cases/TC0133', 'Test Cases/TC0133',  null), new TestCaseBinding('Test Cases/TC0137', 'Test Cases/TC0137',  null), new TestCaseBinding('Test Cases/TC0141', 'Test Cases/TC0141',  null), new TestCaseBinding('Test Cases/TC0143', 'Test Cases/TC0143',  null), new TestCaseBinding('Test Cases/TC0144', 'Test Cases/TC0144',  null), new TestCaseBinding('Test Cases/TC0145', 'Test Cases/TC0145',  null), new TestCaseBinding('Test Cases/TC0146', 'Test Cases/TC0146',  null), new TestCaseBinding('Test Cases/TC0153', 'Test Cases/TC0153',  null), new TestCaseBinding('Test Cases/TC0154', 'Test Cases/TC0154',  null), new TestCaseBinding('Test Cases/TC0155', 'Test Cases/TC0155',  null), new TestCaseBinding('Test Cases/TC0157', 'Test Cases/TC0157',  null)])
