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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/Settings Muzamil')

suiteProperties.put('name', 'Settings Muzamil')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\Settings Muzamil\\20190508_101354\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/Settings Muzamil', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1022', 'Test Cases/Setting testcases/TC1022',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1023', 'Test Cases/Setting testcases/TC1023',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1050', 'Test Cases/Setting testcases/TC1050',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1051', 'Test Cases/Setting testcases/TC1051',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1055', 'Test Cases/Setting testcases/TC1055',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1056', 'Test Cases/Setting testcases/TC1056',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1057', 'Test Cases/Setting testcases/TC1057',  null)])
