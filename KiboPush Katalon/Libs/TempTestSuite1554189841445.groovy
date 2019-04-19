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


suiteProperties.put('id', 'Test Suites/survey')

suiteProperties.put('name', 'survey')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-muzamil/Downloads/Test cases/production/KiboPush/Reports/survey/20190402_122401/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/survey', suiteProperties, [new TestCaseBinding('Test Cases/Survey Test Cases/TC0205', 'Test Cases/Survey Test Cases/TC0205',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0206', 'Test Cases/Survey Test Cases/TC0206',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0207', 'Test Cases/Survey Test Cases/TC0207',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0208', 'Test Cases/Survey Test Cases/TC0208',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0209', 'Test Cases/Survey Test Cases/TC0209',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0210', 'Test Cases/Survey Test Cases/TC0210',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0211', 'Test Cases/Survey Test Cases/TC0211',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0212', 'Test Cases/Survey Test Cases/TC0212',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0213', 'Test Cases/Survey Test Cases/TC0213',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0214', 'Test Cases/Survey Test Cases/TC0214',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0216', 'Test Cases/Survey Test Cases/TC0216',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0217', 'Test Cases/Survey Test Cases/TC0217',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0219', 'Test Cases/Survey Test Cases/TC0219',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0220', 'Test Cases/Survey Test Cases/TC0220',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0221', 'Test Cases/Survey Test Cases/TC0221',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0222', 'Test Cases/Survey Test Cases/TC0222',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0223', 'Test Cases/Survey Test Cases/TC0223',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0224', 'Test Cases/Survey Test Cases/TC0224',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0225', 'Test Cases/Survey Test Cases/TC0225',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0226', 'Test Cases/Survey Test Cases/TC0226',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0227', 'Test Cases/Survey Test Cases/TC0227',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0228', 'Test Cases/Survey Test Cases/TC0228',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0229', 'Test Cases/Survey Test Cases/TC0229',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0230', 'Test Cases/Survey Test Cases/TC0230',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0231', 'Test Cases/Survey Test Cases/TC0231',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0232', 'Test Cases/Survey Test Cases/TC0232',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0239', 'Test Cases/Survey Test Cases/TC0239',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0240', 'Test Cases/Survey Test Cases/TC0240',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0241', 'Test Cases/Survey Test Cases/TC0241',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0242', 'Test Cases/Survey Test Cases/TC0242',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0244', 'Test Cases/Survey Test Cases/TC0244',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0255', 'Test Cases/Survey Test Cases/TC0255',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0256', 'Test Cases/Survey Test Cases/TC0256',  null)])
