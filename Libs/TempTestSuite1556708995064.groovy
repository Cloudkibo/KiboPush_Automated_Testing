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


suiteProperties.put('id', 'Test Suites/Header')

suiteProperties.put('name', 'Header')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Muzamil\\Desktop\\New folder\\git\\KiboPush_Automated_Testing\\Reports\\Header\\20190501_160955\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Header', suiteProperties, [new TestCaseBinding('Test Cases/Header TestCases/TC0088', 'Test Cases/Header TestCases/TC0088',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0090', 'Test Cases/Header TestCases/TC0090',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0091', 'Test Cases/Header TestCases/TC0091',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0092', 'Test Cases/Header TestCases/TC0092',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0093', 'Test Cases/Header TestCases/TC0093',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0094', 'Test Cases/Header TestCases/TC0094',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0095', 'Test Cases/Header TestCases/TC0095',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0096', 'Test Cases/Header TestCases/TC0096',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0097', 'Test Cases/Header TestCases/TC0097',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0098', 'Test Cases/Header TestCases/TC0098',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0099', 'Test Cases/Header TestCases/TC0099',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0100', 'Test Cases/Header TestCases/TC0100',  null), new TestCaseBinding('Test Cases/Header TestCases/TC0101', 'Test Cases/Header TestCases/TC0101',  null), new TestCaseBinding('Test Cases/Header TestCases/TC11051', 'Test Cases/Header TestCases/TC11051',  null), new TestCaseBinding('Test Cases/Header TestCases/TC11053', 'Test Cases/Header TestCases/TC11053',  null), new TestCaseBinding('Test Cases/Header TestCases/TC11052', 'Test Cases/Header TestCases/TC11052',  null)])
