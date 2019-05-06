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


suiteProperties.put('id', 'Test Suites/Arveen suits/seq_message')

suiteProperties.put('name', 'seq_message')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\cloudkibo\\Documents\\production\\KiboPush_Automated_Testing\\Reports\\Arveen suits\\seq_message\\20190506_161548\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/seq_message', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Sequence Messaging/open_automation', 'Test Cases/Sequence Messaging/open_automation',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0980', 'Test Cases/Sequence Messaging/TC0980',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0981', 'Test Cases/Sequence Messaging/TC0981',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0982', 'Test Cases/Sequence Messaging/TC0982',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0983', 'Test Cases/Sequence Messaging/TC0983',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0984', 'Test Cases/Sequence Messaging/TC0984',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0985', 'Test Cases/Sequence Messaging/TC0985',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0986', 'Test Cases/Sequence Messaging/TC0986',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0987', 'Test Cases/Sequence Messaging/TC0987',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC0990', 'Test Cases/Sequence Messaging/TC0990',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1001', 'Test Cases/Sequence Messaging/TC1001',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1002', 'Test Cases/Sequence Messaging/TC1002',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1003', 'Test Cases/Sequence Messaging/TC1003',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1004', 'Test Cases/Sequence Messaging/TC1004',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1005', 'Test Cases/Sequence Messaging/TC1005',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1006', 'Test Cases/Sequence Messaging/TC1006',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1007', 'Test Cases/Sequence Messaging/TC1007',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1008', 'Test Cases/Sequence Messaging/TC1008',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1009', 'Test Cases/Sequence Messaging/TC1009',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1011', 'Test Cases/Sequence Messaging/TC1011',  null)])
