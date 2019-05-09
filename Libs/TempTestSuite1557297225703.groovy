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


suiteProperties.put('id', 'Test Suites/Arveen suits/seq_message')

suiteProperties.put('name', 'seq_message')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Arveen suits\\seq_message\\20190508_113345\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/seq_message', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Sequence Messaging/open_automation', 'Test Cases/Sequence Messaging/open_automation',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1001', 'Test Cases/Sequence Messaging/TC1001',  null), new TestCaseBinding('Test Cases/Sequence Messaging/TC1011', 'Test Cases/Sequence Messaging/TC1011',  null)])
