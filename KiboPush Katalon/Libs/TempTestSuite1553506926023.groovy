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


suiteProperties.put('id', 'Test Suites/Webview')

suiteProperties.put('name', 'Webview')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-muzamil/Downloads/Test cases/production/KiboPush/Reports/Webview/20190325_144206/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Webview', suiteProperties, [new TestCaseBinding('Test Cases/Webview/TC1085', 'Test Cases/Webview/TC1085',  null), new TestCaseBinding('Test Cases/Webview/TC1086', 'Test Cases/Webview/TC1086',  null), new TestCaseBinding('Test Cases/Webview/TC1087', 'Test Cases/Webview/TC1087',  null), new TestCaseBinding('Test Cases/Webview/TC1088', 'Test Cases/Webview/TC1088',  null), new TestCaseBinding('Test Cases/Webview/TC1089', 'Test Cases/Webview/TC1089',  null), new TestCaseBinding('Test Cases/Webview/TC1090', 'Test Cases/Webview/TC1090',  null), new TestCaseBinding('Test Cases/Webview/TC1091', 'Test Cases/Webview/TC1091',  null), new TestCaseBinding('Test Cases/Webview/TC1092', 'Test Cases/Webview/TC1092',  null), new TestCaseBinding('Test Cases/Webview/TC1093', 'Test Cases/Webview/TC1093',  null), new TestCaseBinding('Test Cases/Webview/TC1094', 'Test Cases/Webview/TC1094',  null), new TestCaseBinding('Test Cases/Webview/TC1095', 'Test Cases/Webview/TC1095',  null), new TestCaseBinding('Test Cases/Webview/TC1096', 'Test Cases/Webview/TC1096',  null), new TestCaseBinding('Test Cases/Webview/TC1097', 'Test Cases/Webview/TC1097',  null), new TestCaseBinding('Test Cases/Webview/TC1098', 'Test Cases/Webview/TC1098',  null), new TestCaseBinding('Test Cases/Webview/TC1099', 'Test Cases/Webview/TC1099',  null), new TestCaseBinding('Test Cases/Webview/TC1100', 'Test Cases/Webview/TC1100',  null), new TestCaseBinding('Test Cases/Webview/TC11110', 'Test Cases/Webview/TC11110',  null), new TestCaseBinding('Test Cases/Webview/TC11111', 'Test Cases/Webview/TC11111',  null), new TestCaseBinding('Test Cases/Webview/TC11112', 'Test Cases/Webview/TC11112',  null), new TestCaseBinding('Test Cases/Webview/TC11113', 'Test Cases/Webview/TC11113',  null), new TestCaseBinding('Test Cases/Webview/TC11114', 'Test Cases/Webview/TC11114',  null), new TestCaseBinding('Test Cases/Webview/TC11115', 'Test Cases/Webview/TC11115',  null), new TestCaseBinding('Test Cases/Webview/TC11116', 'Test Cases/Webview/TC11116',  null), new TestCaseBinding('Test Cases/Webview/TC11117', 'Test Cases/Webview/TC11117',  null), new TestCaseBinding('Test Cases/Webview/TC11118', 'Test Cases/Webview/TC11118',  null), new TestCaseBinding('Test Cases/Webview/TC11119', 'Test Cases/Webview/TC11119',  null), new TestCaseBinding('Test Cases/Webview/TC11120', 'Test Cases/Webview/TC11120',  null), new TestCaseBinding('Test Cases/Webview/TC11121', 'Test Cases/Webview/TC11121',  null), new TestCaseBinding('Test Cases/Webview/TC11122', 'Test Cases/Webview/TC11122',  null), new TestCaseBinding('Test Cases/Webview/TC11123', 'Test Cases/Webview/TC11123',  null), new TestCaseBinding('Test Cases/Webview/TC11124', 'Test Cases/Webview/TC11124',  null), new TestCaseBinding('Test Cases/Webview/TC11125', 'Test Cases/Webview/TC11125',  null), new TestCaseBinding('Test Cases/Webview/TC11126', 'Test Cases/Webview/TC11126',  null), new TestCaseBinding('Test Cases/Webview/TC11127', 'Test Cases/Webview/TC11127',  null), new TestCaseBinding('Test Cases/Webview/TC11128', 'Test Cases/Webview/TC11128',  null), new TestCaseBinding('Test Cases/Webview/TC11129', 'Test Cases/Webview/TC11129',  null), new TestCaseBinding('Test Cases/Webview/TC11130', 'Test Cases/Webview/TC11130',  null), new TestCaseBinding('Test Cases/Webview/TC11131', 'Test Cases/Webview/TC11131',  null), new TestCaseBinding('Test Cases/Webview/TC11132', 'Test Cases/Webview/TC11132',  null), new TestCaseBinding('Test Cases/Webview/TC11133', 'Test Cases/Webview/TC11133',  null), new TestCaseBinding('Test Cases/Webview/TC11134', 'Test Cases/Webview/TC11134',  null), new TestCaseBinding('Test Cases/Webview/TC11135', 'Test Cases/Webview/TC11135',  null), new TestCaseBinding('Test Cases/Webview/TC11136', 'Test Cases/Webview/TC11136',  null)])
