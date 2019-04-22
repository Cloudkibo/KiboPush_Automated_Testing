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


suiteProperties.put('id', 'Test Suites/Faizan Suits/SMS Livechat')

suiteProperties.put('name', 'SMS Livechat')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/faizan/Drive/KiboPush_Automated_Testing/KiboPush Katalon/Reports/Faizan Suits/SMS Livechat/20190421_063342/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/SMS Livechat', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kibochat', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kibochat',  null), new TestCaseBinding('Test Cases/SMS/SMSPlatform', 'Test Cases/SMS/SMSPlatform',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11188', 'Test Cases/SMS/Sms Livechat/TC11188',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11189', 'Test Cases/SMS/Sms Livechat/TC11189',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11190', 'Test Cases/SMS/Sms Livechat/TC11190',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11191', 'Test Cases/SMS/Sms Livechat/TC11191',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11192', 'Test Cases/SMS/Sms Livechat/TC11192',  null), new TestCaseBinding('Test Cases/SMS/Sms Livechat/TC11193', 'Test Cases/SMS/Sms Livechat/TC11193',  null)])
