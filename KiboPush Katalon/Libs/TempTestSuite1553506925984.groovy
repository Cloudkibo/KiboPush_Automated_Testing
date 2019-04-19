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


suiteProperties.put('id', 'Test Suites/inviteMember')

suiteProperties.put('name', 'inviteMember')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-muzamil/Downloads/Test cases/production/KiboPush/Reports/inviteMember/20190325_144205/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/inviteMember', suiteProperties, [new TestCaseBinding('Test Cases/Invite Members TestCases/TC0939', 'Test Cases/Invite Members TestCases/TC0939',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0940', 'Test Cases/Invite Members TestCases/TC0940',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0941', 'Test Cases/Invite Members TestCases/TC0941',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0942', 'Test Cases/Invite Members TestCases/TC0942',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0943', 'Test Cases/Invite Members TestCases/TC0943',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0944', 'Test Cases/Invite Members TestCases/TC0944',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0945', 'Test Cases/Invite Members TestCases/TC0945',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0946', 'Test Cases/Invite Members TestCases/TC0946',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0947', 'Test Cases/Invite Members TestCases/TC0947',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0948', 'Test Cases/Invite Members TestCases/TC0948',  null), new TestCaseBinding('Test Cases/Invite Members TestCases/TC0949', 'Test Cases/Invite Members TestCases/TC0949',  null)])
