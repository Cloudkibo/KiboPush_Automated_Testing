import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/subscriber')

suiteProperties.put('name', 'subscriber')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\cloudkibo\\Desktop\\KiboPush_Automated_Testing\\KiboPush Katalon\\Reports\\subscriber\\20190425_124331\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/subscriber', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Subscriber TestCases/TC0670', 'Test Cases/Subscriber TestCases/TC0670',  null), new TestCaseBinding('Test Cases/Subscriber TestCases/TC0672', 'Test Cases/Subscriber TestCases/TC0672',  null), new TestCaseBinding('Test Cases/Subscriber TestCases/TC0676', 'Test Cases/Subscriber TestCases/TC0676',  null), new TestCaseBinding('Test Cases/Subscriber TestCases/TC0678', 'Test Cases/Subscriber TestCases/TC0678',  null), new TestCaseBinding('Test Cases/Subscriber TestCases/TC0679', 'Test Cases/Subscriber TestCases/TC0679',  null)])
