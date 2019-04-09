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


suiteProperties.put('id', 'Test Suites/segmentSubscriber')

suiteProperties.put('name', 'segmentSubscriber')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-muzamil/Downloads/Test cases/production/KiboPush/Reports/segmentSubscriber/20190409_134047/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/segmentSubscriber', suiteProperties, [new TestCaseBinding('Test Cases/Segment subscribers/TC0706', 'Test Cases/Segment subscribers/TC0706',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0707', 'Test Cases/Segment subscribers/TC0707',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0708', 'Test Cases/Segment subscribers/TC0708',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0709', 'Test Cases/Segment subscribers/TC0709',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0710', 'Test Cases/Segment subscribers/TC0710',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0711', 'Test Cases/Segment subscribers/TC0711',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0712', 'Test Cases/Segment subscribers/TC0712',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0713', 'Test Cases/Segment subscribers/TC0713',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0714', 'Test Cases/Segment subscribers/TC0714',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0715', 'Test Cases/Segment subscribers/TC0715',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0716-begin', 'Test Cases/Segment subscribers/TC0716-begin',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0716', 'Test Cases/Segment subscribers/TC0716',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0717-lastName', 'Test Cases/Segment subscribers/TC0717-lastName',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0717', 'Test Cases/Segment subscribers/TC0717',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0718', 'Test Cases/Segment subscribers/TC0718',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0719', 'Test Cases/Segment subscribers/TC0719',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0720', 'Test Cases/Segment subscribers/TC0720',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0723', 'Test Cases/Segment subscribers/TC0723',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0726', 'Test Cases/Segment subscribers/TC0726',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0729', 'Test Cases/Segment subscribers/TC0729',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0732', 'Test Cases/Segment subscribers/TC0732',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0735', 'Test Cases/Segment subscribers/TC0735',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0738', 'Test Cases/Segment subscribers/TC0738',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0739', 'Test Cases/Segment subscribers/TC0739',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0740', 'Test Cases/Segment subscribers/TC0740',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0744', 'Test Cases/Segment subscribers/TC0744',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0745', 'Test Cases/Segment subscribers/TC0745',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0746', 'Test Cases/Segment subscribers/TC0746',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0747', 'Test Cases/Segment subscribers/TC0747',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0748', 'Test Cases/Segment subscribers/TC0748',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0749', 'Test Cases/Segment subscribers/TC0749',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0750', 'Test Cases/Segment subscribers/TC0750',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0751', 'Test Cases/Segment subscribers/TC0751',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0752', 'Test Cases/Segment subscribers/TC0752',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0753', 'Test Cases/Segment subscribers/TC0753',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0754', 'Test Cases/Segment subscribers/TC0754',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0755', 'Test Cases/Segment subscribers/TC0755',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0756', 'Test Cases/Segment subscribers/TC0756',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0757', 'Test Cases/Segment subscribers/TC0757',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0758', 'Test Cases/Segment subscribers/TC0758',  null), new TestCaseBinding('Test Cases/Segment subscribers/TC0759', 'Test Cases/Segment subscribers/TC0759',  null)])
