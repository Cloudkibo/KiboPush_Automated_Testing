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


suiteProperties.put('id', 'Test Suites/Arveen suits/operationalDashboard')

suiteProperties.put('name', 'operationalDashboard')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\cloudkibo\\Documents\\production\\KiboPush_Automated_Testing\\Reports\\Arveen suits\\operationalDashboard\\20190503_144757\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/operationalDashboard', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Operational_Dashboard/127', 'Test Cases/Operational_Dashboard/127',  null), new TestCaseBinding('Test Cases/Operational_Dashboard/130', 'Test Cases/Operational_Dashboard/130',  null), new TestCaseBinding('Test Cases/Operational_Dashboard/139', 'Test Cases/Operational_Dashboard/139',  null), new TestCaseBinding('Test Cases/Operational_Dashboard/184', 'Test Cases/Operational_Dashboard/184',  null)])
