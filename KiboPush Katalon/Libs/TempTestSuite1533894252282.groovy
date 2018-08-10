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


suiteProperties.put('id', 'Test Suites/KiboPush Broadcasts')

suiteProperties.put('name', 'KiboPush Broadcasts')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/baqarjafri/Katalon Studio/KiboPush/Reports/KiboPush Broadcasts/20180810_144402/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/KiboPush Broadcasts', suiteProperties, [new TestCaseBinding('Test Cases/TC0106', 'Test Cases/TC0106',  null), new TestCaseBinding('Test Cases/TC0107', 'Test Cases/TC0107',  null), new TestCaseBinding('Test Cases/TC0108', 'Test Cases/TC0108',  null), new TestCaseBinding('Test Cases/TC0109', 'Test Cases/TC0109',  null), new TestCaseBinding('Test Cases/TC0110', 'Test Cases/TC0110',  null), new TestCaseBinding('Test Cases/TC0111', 'Test Cases/TC0111',  null), new TestCaseBinding('Test Cases/TC0112', 'Test Cases/TC0112',  null), new TestCaseBinding('Test Cases/TC0113', 'Test Cases/TC0113',  null), new TestCaseBinding('Test Cases/TC0114', 'Test Cases/TC0114',  null), new TestCaseBinding('Test Cases/TC0115', 'Test Cases/TC0115',  null), new TestCaseBinding('Test Cases/TC0119', 'Test Cases/TC0119',  null), new TestCaseBinding('Test Cases/TC0120', 'Test Cases/TC0120',  null), new TestCaseBinding('Test Cases/TC0121', 'Test Cases/TC0121',  null), new TestCaseBinding('Test Cases/TC0122', 'Test Cases/TC0122',  null), new TestCaseBinding('Test Cases/TC0123', 'Test Cases/TC0123',  null), new TestCaseBinding('Test Cases/TC0124', 'Test Cases/TC0124',  null), new TestCaseBinding('Test Cases/TC0125', 'Test Cases/TC0125',  null), new TestCaseBinding('Test Cases/TC0126', 'Test Cases/TC0126',  null), new TestCaseBinding('Test Cases/TC0127', 'Test Cases/TC0127',  null), new TestCaseBinding('Test Cases/TC0129', 'Test Cases/TC0129',  null), new TestCaseBinding('Test Cases/TC0130', 'Test Cases/TC0130',  null), new TestCaseBinding('Test Cases/TC0131', 'Test Cases/TC0131',  null), new TestCaseBinding('Test Cases/TC0132', 'Test Cases/TC0132',  null), new TestCaseBinding('Test Cases/TC0133', 'Test Cases/TC0133',  null), new TestCaseBinding('Test Cases/TC0137', 'Test Cases/TC0137',  null), new TestCaseBinding('Test Cases/TC0138', 'Test Cases/TC0138',  null), new TestCaseBinding('Test Cases/TC0139', 'Test Cases/TC0139',  null), new TestCaseBinding('Test Cases/TC0141', 'Test Cases/TC0141',  null), new TestCaseBinding('Test Cases/TC0142', 'Test Cases/TC0142',  null), new TestCaseBinding('Test Cases/TC0143', 'Test Cases/TC0143',  null), new TestCaseBinding('Test Cases/TC0144', 'Test Cases/TC0144',  null), new TestCaseBinding('Test Cases/TC0145', 'Test Cases/TC0145',  null), new TestCaseBinding('Test Cases/TC0146', 'Test Cases/TC0146',  null), new TestCaseBinding('Test Cases/TC0147', 'Test Cases/TC0147',  null), new TestCaseBinding('Test Cases/TC0150', 'Test Cases/TC0150',  null), new TestCaseBinding('Test Cases/TC0151', 'Test Cases/TC0151',  null), new TestCaseBinding('Test Cases/TC0152', 'Test Cases/TC0152',  null), new TestCaseBinding('Test Cases/TC0153', 'Test Cases/TC0153',  null), new TestCaseBinding('Test Cases/TC0154', 'Test Cases/TC0154',  null), new TestCaseBinding('Test Cases/TC0155', 'Test Cases/TC0155',  null), new TestCaseBinding('Test Cases/TC0156', 'Test Cases/TC0156',  null), new TestCaseBinding('Test Cases/TC0157', 'Test Cases/TC0157',  null), new TestCaseBinding('Test Cases/TC0160', 'Test Cases/TC0160',  null), new TestCaseBinding('Test Cases/TC0161', 'Test Cases/TC0161',  null), new TestCaseBinding('Test Cases/TC0163', 'Test Cases/TC0163',  null), new TestCaseBinding('Test Cases/TC0164', 'Test Cases/TC0164',  null), new TestCaseBinding('Test Cases/TC0165', 'Test Cases/TC0165',  null), new TestCaseBinding('Test Cases/TC0167', 'Test Cases/TC0167',  null), new TestCaseBinding('Test Cases/TC0168', 'Test Cases/TC0168',  null), new TestCaseBinding('Test Cases/TC0169', 'Test Cases/TC0169',  null), new TestCaseBinding('Test Cases/TC0171', 'Test Cases/TC0171',  null), new TestCaseBinding('Test Cases/TC0172', 'Test Cases/TC0172',  null), new TestCaseBinding('Test Cases/TC0173', 'Test Cases/TC0173',  null), new TestCaseBinding('Test Cases/TC0175', 'Test Cases/TC0175',  null), new TestCaseBinding('Test Cases/TC0176', 'Test Cases/TC0176',  null), new TestCaseBinding('Test Cases/TC0177', 'Test Cases/TC0177',  null), new TestCaseBinding('Test Cases/TC0178', 'Test Cases/TC0178',  null), new TestCaseBinding('Test Cases/TC0182', 'Test Cases/TC0182',  null), new TestCaseBinding('Test Cases/TC0183', 'Test Cases/TC0183',  null), new TestCaseBinding('Test Cases/TC0184', 'Test Cases/TC0184',  null), new TestCaseBinding('Test Cases/TC0185', 'Test Cases/TC0185',  null), new TestCaseBinding('Test Cases/TC0186', 'Test Cases/TC0186',  null), new TestCaseBinding('Test Cases/TC0187', 'Test Cases/TC0187',  null), new TestCaseBinding('Test Cases/TC0188', 'Test Cases/TC0188',  null), new TestCaseBinding('Test Cases/TC0189', 'Test Cases/TC0189',  null), new TestCaseBinding('Test Cases/TC0190', 'Test Cases/TC0190',  null), new TestCaseBinding('Test Cases/TC0192', 'Test Cases/TC0192',  null), new TestCaseBinding('Test Cases/TC0193', 'Test Cases/TC0193',  null), new TestCaseBinding('Test Cases/TC0194', 'Test Cases/TC0194',  null), new TestCaseBinding('Test Cases/TC0195', 'Test Cases/TC0195',  null), new TestCaseBinding('Test Cases/TC0196', 'Test Cases/TC0196',  null), new TestCaseBinding('Test Cases/TC0204', 'Test Cases/TC0204',  null)])
