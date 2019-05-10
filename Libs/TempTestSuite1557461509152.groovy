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


suiteProperties.put('id', 'Test Suites/Arveen suits/broadcast')

suiteProperties.put('name', 'broadcast')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/KiboPush_Automated_Testing/Reports/Arveen suits/broadcast/20190510_091149/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/broadcast', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage',  null), new TestCaseBinding('Test Cases/Broadcasts/open_broadcast', 'Test Cases/Broadcasts/open_broadcast',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0137', 'Test Cases/Broadcasts/TC0137',  null)])
