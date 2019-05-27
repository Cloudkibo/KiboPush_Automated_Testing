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


suiteProperties.put('id', 'Test Suites/Faizan Suits/chatbox plugin')

suiteProperties.put('name', 'chatbox plugin')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/faizan/Drive/KiboPush_Automated_Testing/Reports/Faizan Suits/chatbox plugin/20190528_012125/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/chatbox plugin', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Invite subscribers/open growth tools', 'Test Cases/Invite subscribers/open growth tools',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11287', 'Test Cases/Checkbox Plugin/TC11287',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11288', 'Test Cases/Checkbox Plugin/TC11288',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11289', 'Test Cases/Checkbox Plugin/TC11289',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11290', 'Test Cases/Checkbox Plugin/TC11290',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11291', 'Test Cases/Checkbox Plugin/TC11291',  null), new TestCaseBinding('Test Cases/Checkbox Plugin/TC11292', 'Test Cases/Checkbox Plugin/TC11292',  null)])
