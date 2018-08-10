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



RunConfiguration.setExecutionSettingFile("/Users/baqarjafri/Katalon Studio/KiboPush/Reports/KiboPush Broadcasts/20180808_171035/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/KiboPush Broadcasts', suiteProperties, [new TestCaseBinding('Test Cases/TC0106', 'Test Cases/TC0106',  null), new TestCaseBinding('Test Cases/TC0107', 'Test Cases/TC0107',  null), new TestCaseBinding('Test Cases/TC0108', 'Test Cases/TC0108',  null), new TestCaseBinding('Test Cases/TC0109', 'Test Cases/TC0109',  null), new TestCaseBinding('Test Cases/TC0110', 'Test Cases/TC0110',  null), new TestCaseBinding('Test Cases/TC0111', 'Test Cases/TC0111',  null), new TestCaseBinding('Test Cases/TC0112', 'Test Cases/TC0112',  null), new TestCaseBinding('Test Cases/TC0113', 'Test Cases/TC0113',  null), new TestCaseBinding('Test Cases/TC0114', 'Test Cases/TC0114',  null), new TestCaseBinding('Test Cases/TC0115', 'Test Cases/TC0115',  null), new TestCaseBinding('Test Cases/TC0119', 'Test Cases/TC0119',  null), new TestCaseBinding('Test Cases/TC0120', 'Test Cases/TC0120',  null), new TestCaseBinding('Test Cases/TC0121', 'Test Cases/TC0121',  null), new TestCaseBinding('Test Cases/TC0122', 'Test Cases/TC0122',  null), new TestCaseBinding('Test Cases/TC0123', 'Test Cases/TC0123',  null), new TestCaseBinding('Test Cases/TC0124', 'Test Cases/TC0124',  null), new TestCaseBinding('Test Cases/TC0125', 'Test Cases/TC0125',  null), new TestCaseBinding('Test Cases/TC0126', 'Test Cases/TC0126',  null), new TestCaseBinding('Test Cases/TC0127', 'Test Cases/TC0127',  null), new TestCaseBinding('Test Cases/TC0129', 'Test Cases/TC0129',  null), new TestCaseBinding('Test Cases/TC0130', 'Test Cases/TC0130',  null), new TestCaseBinding('Test Cases/TC0131', 'Test Cases/TC0131',  null), new TestCaseBinding('Test Cases/TC0132', 'Test Cases/TC0132',  null), new TestCaseBinding('Test Cases/TC0133', 'Test Cases/TC0133',  null), new TestCaseBinding('Test Cases/TC0137', 'Test Cases/TC0137',  null), new TestCaseBinding('Test Cases/TC0138', 'Test Cases/TC0138',  null), new TestCaseBinding('Test Cases/TC0139', 'Test Cases/TC0139',  null), new TestCaseBinding('Test Cases/TC0141', 'Test Cases/TC0141',  null), new TestCaseBinding('Test Cases/TC0142', 'Test Cases/TC0142',  null), new TestCaseBinding('Test Cases/TC0143', 'Test Cases/TC0143',  null), new TestCaseBinding('Test Cases/TC0144', 'Test Cases/TC0144',  null), new TestCaseBinding('Test Cases/TC0145', 'Test Cases/TC0145',  null), new TestCaseBinding('Test Cases/TC0146', 'Test Cases/TC0146',  null), new TestCaseBinding('Test Cases/TC0147', 'Test Cases/TC0147',  null), new TestCaseBinding('Test Cases/TC0150', 'Test Cases/TC0150',  null), new TestCaseBinding('Test Cases/TC0151', 'Test Cases/TC0151',  null), new TestCaseBinding('Test Cases/TC0152', 'Test Cases/TC0152',  null), new TestCaseBinding('Test Cases/TC0153', 'Test Cases/TC0153',  null)])
