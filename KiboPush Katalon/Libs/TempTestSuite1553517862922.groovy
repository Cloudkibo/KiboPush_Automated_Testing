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


suiteProperties.put('id', 'Test Suites/InviteSubscribers')

suiteProperties.put('name', 'InviteSubscribers')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/Katalon/production/KiboPush/Reports/InviteSubscribers/20190325_174422/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/InviteSubscribers', suiteProperties, [new TestCaseBinding('Test Cases/Invite subscribers/TC0678', 'Test Cases/Invite subscribers/TC0678',  null), new TestCaseBinding('Test Cases/Invite subscribers/TC0679', 'Test Cases/Invite subscribers/TC0679',  null), new TestCaseBinding('Test Cases/Invite subscribers/TC0680', 'Test Cases/Invite subscribers/TC0680',  null), new TestCaseBinding('Test Cases/Invite subscribers/TC0681', 'Test Cases/Invite subscribers/TC0681',  null), new TestCaseBinding('Test Cases/Invite subscribers/TC0682', 'Test Cases/Invite subscribers/TC0682',  null)])
