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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/survey')

suiteProperties.put('name', 'survey')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\survey\\20190508_102112\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/survey', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0205', 'Test Cases/Survey Test Cases/TC0205',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0206', 'Test Cases/Survey Test Cases/TC0206',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0212', 'Test Cases/Survey Test Cases/TC0212',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0213', 'Test Cases/Survey Test Cases/TC0213',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0217', 'Test Cases/Survey Test Cases/TC0217',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0225', 'Test Cases/Survey Test Cases/TC0225',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0226', 'Test Cases/Survey Test Cases/TC0226',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0227', 'Test Cases/Survey Test Cases/TC0227',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0228', 'Test Cases/Survey Test Cases/TC0228',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0229', 'Test Cases/Survey Test Cases/TC0229',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0230', 'Test Cases/Survey Test Cases/TC0230',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0231', 'Test Cases/Survey Test Cases/TC0231',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0232', 'Test Cases/Survey Test Cases/TC0232',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0239', 'Test Cases/Survey Test Cases/TC0239',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0241', 'Test Cases/Survey Test Cases/TC0241',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0242', 'Test Cases/Survey Test Cases/TC0242',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0244', 'Test Cases/Survey Test Cases/TC0244',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0255', 'Test Cases/Survey Test Cases/TC0255',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC0256', 'Test Cases/Survey Test Cases/TC0256',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC11284', 'Test Cases/Survey Test Cases/TC11284',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC11285', 'Test Cases/Survey Test Cases/TC11285',  null), new TestCaseBinding('Test Cases/Survey Test Cases/TC11286', 'Test Cases/Survey Test Cases/TC11286',  null)])
