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


suiteProperties.put('id', 'Test Suites/Faizan Suits/SMS')

suiteProperties.put('name', 'SMS')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/faizan/Drive/KiboPush_Automated_Testing/KiboPush Katalon/Reports/Faizan Suits/SMS/20190421_054241/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/SMS', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/SMS/SMSPlatform', 'Test Cases/SMS/SMSPlatform',  null), new TestCaseBinding('Test Cases/SMS/contacts/TC11149', 'Test Cases/SMS/contacts/TC11149',  null), new TestCaseBinding('Test Cases/SMS/contacts/TC11150', 'Test Cases/SMS/contacts/TC11150',  null), new TestCaseBinding('Test Cases/SMS/contacts/TC11151', 'Test Cases/SMS/contacts/TC11151',  null), new TestCaseBinding('Test Cases/SMS/contacts/TC11152', 'Test Cases/SMS/contacts/TC11152',  null), new TestCaseBinding('Test Cases/SMS/contacts/TC11153', 'Test Cases/SMS/contacts/TC11153',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11154', 'Test Cases/SMS/upload contacts/TC11154',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11155', 'Test Cases/SMS/upload contacts/TC11155',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11156', 'Test Cases/SMS/upload contacts/TC11156',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11157', 'Test Cases/SMS/upload contacts/TC11157',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11158', 'Test Cases/SMS/upload contacts/TC11158',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11159', 'Test Cases/SMS/upload contacts/TC11159',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11160', 'Test Cases/SMS/upload contacts/TC11160',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11161', 'Test Cases/SMS/upload contacts/TC11161',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11162', 'Test Cases/SMS/upload contacts/TC11162',  null), new TestCaseBinding('Test Cases/SMS/upload contacts/TC11163', 'Test Cases/SMS/upload contacts/TC11163',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11171', 'Test Cases/SMS/sms broadcast/TC11171',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11172', 'Test Cases/SMS/sms broadcast/TC11172',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11173', 'Test Cases/SMS/sms broadcast/TC11173',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11174', 'Test Cases/SMS/sms broadcast/TC11174',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11175', 'Test Cases/SMS/sms broadcast/TC11175',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11176', 'Test Cases/SMS/sms broadcast/TC11176',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11177', 'Test Cases/SMS/sms broadcast/TC11177',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11178', 'Test Cases/SMS/sms broadcast/TC11178',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11179', 'Test Cases/SMS/sms broadcast/TC11179',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11181', 'Test Cases/SMS/sms broadcast/TC11181',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11182', 'Test Cases/SMS/sms broadcast/TC11182',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11183', 'Test Cases/SMS/sms broadcast/TC11183',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11184', 'Test Cases/SMS/sms broadcast/TC11184',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11185', 'Test Cases/SMS/sms broadcast/TC11185',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11186', 'Test Cases/SMS/sms broadcast/TC11186',  null), new TestCaseBinding('Test Cases/SMS/sms broadcast/TC11187', 'Test Cases/SMS/sms broadcast/TC11187',  null)])
