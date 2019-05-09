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


suiteProperties.put('id', 'Test Suites/Arveen suits/smart replies')

suiteProperties.put('name', 'smart replies')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Arveen suits\\smart replies\\20190508_113631\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/smart replies', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kibochat', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kibochat',  null), new TestCaseBinding('Test Cases/Smart Replies/open_automation', 'Test Cases/Smart Replies/open_automation',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0618', 'Test Cases/Smart Replies/TC0618',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0619', 'Test Cases/Smart Replies/TC0619',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0621', 'Test Cases/Smart Replies/TC0621',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0622', 'Test Cases/Smart Replies/TC0622',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0622_n', 'Test Cases/Smart Replies/TC0622_n',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0623', 'Test Cases/Smart Replies/TC0623',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0624', 'Test Cases/Smart Replies/TC0624',  null), new TestCaseBinding('Test Cases/Smart Replies/Test-Actions-Button', 'Test Cases/Smart Replies/Test-Actions-Button',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0624 - delete', 'Test Cases/Smart Replies/TC0624 - delete',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0625', 'Test Cases/Smart Replies/TC0625',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0626', 'Test Cases/Smart Replies/TC0626',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0627', 'Test Cases/Smart Replies/TC0627',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0629', 'Test Cases/Smart Replies/TC0629',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0632', 'Test Cases/Smart Replies/TC0632',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0633', 'Test Cases/Smart Replies/TC0633',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0634', 'Test Cases/Smart Replies/TC0634',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0635', 'Test Cases/Smart Replies/TC0635',  null), new TestCaseBinding('Test Cases/Smart Replies/TC0636', 'Test Cases/Smart Replies/TC0636',  null)])
