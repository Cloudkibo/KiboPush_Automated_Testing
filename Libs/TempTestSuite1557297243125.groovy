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


suiteProperties.put('id', 'Test Suites/Faizan Suits/Whatsapp Kiboengage')

suiteProperties.put('name', 'Whatsapp Kiboengage')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\Whatsapp Kiboengage\\20190508_113403\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/Whatsapp Kiboengage', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Whatsapp/Whatsapp Platform', 'Test Cases/Whatsapp/Whatsapp Platform',  null), new TestCaseBinding('Test Cases/Whatsapp/subscribers/TC11219', 'Test Cases/Whatsapp/subscribers/TC11219',  null), new TestCaseBinding('Test Cases/Whatsapp/subscribers/TC11220', 'Test Cases/Whatsapp/subscribers/TC11220',  null), new TestCaseBinding('Test Cases/Whatsapp/subscribers/TC11221', 'Test Cases/Whatsapp/subscribers/TC11221',  null), new TestCaseBinding('Test Cases/Whatsapp/subscribers/TC11222', 'Test Cases/Whatsapp/subscribers/TC11222',  null), new TestCaseBinding('Test Cases/Whatsapp/subscribers/TC11223', 'Test Cases/Whatsapp/subscribers/TC11223',  null), new TestCaseBinding('Test Cases/Whatsapp/Upload Contacts/TC11224', 'Test Cases/Whatsapp/Upload Contacts/TC11224',  null), new TestCaseBinding('Test Cases/Whatsapp/Upload Contacts/TC11225', 'Test Cases/Whatsapp/Upload Contacts/TC11225',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/go to broadcasting', 'Test Cases/Whatsapp/broadcast/go to broadcasting',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11226', 'Test Cases/Whatsapp/broadcast/TC11226',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11227', 'Test Cases/Whatsapp/broadcast/TC11227',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11228', 'Test Cases/Whatsapp/broadcast/TC11228',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11229', 'Test Cases/Whatsapp/broadcast/TC11229',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11230', 'Test Cases/Whatsapp/broadcast/TC11230',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11231', 'Test Cases/Whatsapp/broadcast/TC11231',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11232', 'Test Cases/Whatsapp/broadcast/TC11232',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11233', 'Test Cases/Whatsapp/broadcast/TC11233',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11234', 'Test Cases/Whatsapp/broadcast/TC11234',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11235', 'Test Cases/Whatsapp/broadcast/TC11235',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11236', 'Test Cases/Whatsapp/broadcast/TC11236',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11237', 'Test Cases/Whatsapp/broadcast/TC11237',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11238', 'Test Cases/Whatsapp/broadcast/TC11238',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11239', 'Test Cases/Whatsapp/broadcast/TC11239',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11240', 'Test Cases/Whatsapp/broadcast/TC11240',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11241', 'Test Cases/Whatsapp/broadcast/TC11241',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11242', 'Test Cases/Whatsapp/broadcast/TC11242',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11243', 'Test Cases/Whatsapp/broadcast/TC11243',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11244', 'Test Cases/Whatsapp/broadcast/TC11244',  null), new TestCaseBinding('Test Cases/Whatsapp/broadcast/TC11245', 'Test Cases/Whatsapp/broadcast/TC11245',  null), new TestCaseBinding('Test Cases/Whatsapp/Configuration in Settings/TC11271', 'Test Cases/Whatsapp/Configuration in Settings/TC11271',  null)])
