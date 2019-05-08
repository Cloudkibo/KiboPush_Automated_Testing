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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/Member')

suiteProperties.put('name', 'Member')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\Member\\20190507_165021\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/Member', suiteProperties, [new TestCaseBinding('Test Cases/Members TestCases/TC0974', 'Test Cases/Members TestCases/TC0974',  null), new TestCaseBinding('Test Cases/Members TestCases/TC0975', 'Test Cases/Members TestCases/TC0975',  null), new TestCaseBinding('Test Cases/Members TestCases/TC0976', 'Test Cases/Members TestCases/TC0976',  null), new TestCaseBinding('Test Cases/Members TestCases/TC0977', 'Test Cases/Members TestCases/TC0977',  null), new TestCaseBinding('Test Cases/Members TestCases/TC0978', 'Test Cases/Members TestCases/TC0978',  null), new TestCaseBinding('Test Cases/Members TestCases/TC0979', 'Test Cases/Members TestCases/TC0979',  null)])
