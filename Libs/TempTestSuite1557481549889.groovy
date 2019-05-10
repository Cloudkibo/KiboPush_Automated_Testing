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


suiteProperties.put('id', 'Test Suites/Arveen suits/broadcast')

suiteProperties.put('name', 'broadcast')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/broadcast_folder/KiboPush_Automated_Testing/Reports/Arveen suits/broadcast/20190510_144549/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Arveen suits/broadcast', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/arveen_staging_login_kiboengage',  null), new TestCaseBinding('Test Cases/Broadcasts/open_broadcast', 'Test Cases/Broadcasts/open_broadcast',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0106', 'Test Cases/Broadcasts/TC0106',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0107', 'Test Cases/Broadcasts/TC0107',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0108', 'Test Cases/Broadcasts/TC0108',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0109', 'Test Cases/Broadcasts/TC0109',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0110', 'Test Cases/Broadcasts/TC0110',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0111', 'Test Cases/Broadcasts/TC0111',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0112', 'Test Cases/Broadcasts/TC0112',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0113', 'Test Cases/Broadcasts/TC0113',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0114', 'Test Cases/Broadcasts/TC0114',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0115', 'Test Cases/Broadcasts/TC0115',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0116', 'Test Cases/Broadcasts/TC0116',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0117', 'Test Cases/Broadcasts/TC0117',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0119', 'Test Cases/Broadcasts/TC0119',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0120', 'Test Cases/Broadcasts/TC0120',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0121', 'Test Cases/Broadcasts/TC0121',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0122', 'Test Cases/Broadcasts/TC0122',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0123', 'Test Cases/Broadcasts/TC0123',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0124', 'Test Cases/Broadcasts/TC0124',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0125', 'Test Cases/Broadcasts/TC0125',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0126', 'Test Cases/Broadcasts/TC0126',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0127', 'Test Cases/Broadcasts/TC0127',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0128', 'Test Cases/Broadcasts/TC0128',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0129', 'Test Cases/Broadcasts/TC0129',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0130', 'Test Cases/Broadcasts/TC0130',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0131', 'Test Cases/Broadcasts/TC0131',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0132', 'Test Cases/Broadcasts/TC0132',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0133', 'Test Cases/Broadcasts/TC0133',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0137', 'Test Cases/Broadcasts/TC0137',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0138', 'Test Cases/Broadcasts/TC0138',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0139', 'Test Cases/Broadcasts/TC0139',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0141', 'Test Cases/Broadcasts/TC0141',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0142', 'Test Cases/Broadcasts/TC0142',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0143', 'Test Cases/Broadcasts/TC0143',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0144', 'Test Cases/Broadcasts/TC0144',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0145', 'Test Cases/Broadcasts/TC0145',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0146', 'Test Cases/Broadcasts/TC0146',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0147', 'Test Cases/Broadcasts/TC0147',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0163', 'Test Cases/Broadcasts/TC0163',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0164', 'Test Cases/Broadcasts/TC0164',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0165', 'Test Cases/Broadcasts/TC0165',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0171', 'Test Cases/Broadcasts/TC0171',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0172', 'Test Cases/Broadcasts/TC0172',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0173', 'Test Cases/Broadcasts/TC0173',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0175', 'Test Cases/Broadcasts/TC0175',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0176', 'Test Cases/Broadcasts/TC0176',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0177', 'Test Cases/Broadcasts/TC0177',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0178', 'Test Cases/Broadcasts/TC0178',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0182', 'Test Cases/Broadcasts/TC0182',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0183', 'Test Cases/Broadcasts/TC0183',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0184', 'Test Cases/Broadcasts/TC0184',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0186', 'Test Cases/Broadcasts/TC0186',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0188', 'Test Cases/Broadcasts/TC0188',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0189', 'Test Cases/Broadcasts/TC0189',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0190', 'Test Cases/Broadcasts/TC0190',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0192', 'Test Cases/Broadcasts/TC0192',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0193', 'Test Cases/Broadcasts/TC0193',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0195', 'Test Cases/Broadcasts/TC0195',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0196', 'Test Cases/Broadcasts/TC0196',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0204', 'Test Cases/Broadcasts/TC0204',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0684', 'Test Cases/Broadcasts/TC0684',  null), new TestCaseBinding('Test Cases/Broadcasts/TC0685', 'Test Cases/Broadcasts/TC0685',  null)])
