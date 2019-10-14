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


suiteProperties.put('id', 'Test Suites/Faizan Suits/Messenger Ads')

suiteProperties.put('name', 'Messenger Ads')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\Messenger Ads\\20190508_113357\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/Messenger Ads', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Invite subscribers/open growth tools', 'Test Cases/Invite subscribers/open growth tools',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1072', 'Test Cases/Messenger Ads/TC1072',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1059', 'Test Cases/Messenger Ads/TC1059',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1069', 'Test Cases/Messenger Ads/TC1069',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1067', 'Test Cases/Messenger Ads/TC1067',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1063', 'Test Cases/Messenger Ads/TC1063',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1061', 'Test Cases/Messenger Ads/TC1061',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1065', 'Test Cases/Messenger Ads/TC1065',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1068', 'Test Cases/Messenger Ads/TC1068',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1060', 'Test Cases/Messenger Ads/TC1060',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1074', 'Test Cases/Messenger Ads/TC1074',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1070', 'Test Cases/Messenger Ads/TC1070',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1071', 'Test Cases/Messenger Ads/TC1071',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1064', 'Test Cases/Messenger Ads/TC1064',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1062', 'Test Cases/Messenger Ads/TC1062',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1058', 'Test Cases/Messenger Ads/TC1058',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1073', 'Test Cases/Messenger Ads/TC1073',  null), new TestCaseBinding('Test Cases/Messenger Ads/TC1066', 'Test Cases/Messenger Ads/TC1066',  null)])
