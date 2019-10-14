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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/poll')

suiteProperties.put('name', 'poll')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\poll\\20190507_165023\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/poll', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0258', 'Test Cases/Poll Test Cases/TC0258',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0259', 'Test Cases/Poll Test Cases/TC0259',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0260', 'Test Cases/Poll Test Cases/TC0260',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0261', 'Test Cases/Poll Test Cases/TC0261',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0265', 'Test Cases/Poll Test Cases/TC0265',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0266', 'Test Cases/Poll Test Cases/TC0266',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0269', 'Test Cases/Poll Test Cases/TC0269',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0270', 'Test Cases/Poll Test Cases/TC0270',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0272', 'Test Cases/Poll Test Cases/TC0272',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0273', 'Test Cases/Poll Test Cases/TC0273',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0274', 'Test Cases/Poll Test Cases/TC0274',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0275', 'Test Cases/Poll Test Cases/TC0275',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0276', 'Test Cases/Poll Test Cases/TC0276',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0283', 'Test Cases/Poll Test Cases/TC0283',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0285', 'Test Cases/Poll Test Cases/TC0285',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0286', 'Test Cases/Poll Test Cases/TC0286',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0288', 'Test Cases/Poll Test Cases/TC0288',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0289', 'Test Cases/Poll Test Cases/TC0289',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC0290', 'Test Cases/Poll Test Cases/TC0290',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC11047', 'Test Cases/Poll Test Cases/TC11047',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC11287', 'Test Cases/Poll Test Cases/TC11287',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC11288', 'Test Cases/Poll Test Cases/TC11288',  null), new TestCaseBinding('Test Cases/Poll Test Cases/TC11289', 'Test Cases/Poll Test Cases/TC11289',  null)])
