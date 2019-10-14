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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/setting')

suiteProperties.put('name', 'setting')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\setting\\20190508_113414\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/setting', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1015', 'Test Cases/Setting testcases/TC1015',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1016', 'Test Cases/Setting testcases/TC1016',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1017', 'Test Cases/Setting testcases/TC1017',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1018', 'Test Cases/Setting testcases/TC1018',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1019', 'Test Cases/Setting testcases/TC1019',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1020', 'Test Cases/Setting testcases/TC1020',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1021', 'Test Cases/Setting testcases/TC1021',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1022', 'Test Cases/Setting testcases/TC1022',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1023', 'Test Cases/Setting testcases/TC1023',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1024', 'Test Cases/Setting testcases/TC1024',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1025', 'Test Cases/Setting testcases/TC1025',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1026', 'Test Cases/Setting testcases/TC1026',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1027', 'Test Cases/Setting testcases/TC1027',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1028', 'Test Cases/Setting testcases/TC1028',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1029', 'Test Cases/Setting testcases/TC1029',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1030', 'Test Cases/Setting testcases/TC1030',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1032', 'Test Cases/Setting testcases/TC1032',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1033', 'Test Cases/Setting testcases/TC1033',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1034', 'Test Cases/Setting testcases/TC1034',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1035', 'Test Cases/Setting testcases/TC1035',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1036', 'Test Cases/Setting testcases/TC1036',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1037', 'Test Cases/Setting testcases/TC1037',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1038', 'Test Cases/Setting testcases/TC1038',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1039', 'Test Cases/Setting testcases/TC1039',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1040', 'Test Cases/Setting testcases/TC1040',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1041', 'Test Cases/Setting testcases/TC1041',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1042', 'Test Cases/Setting testcases/TC1042',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1043', 'Test Cases/Setting testcases/TC1043',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1044', 'Test Cases/Setting testcases/TC1044',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1045', 'Test Cases/Setting testcases/TC1045',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1046', 'Test Cases/Setting testcases/TC1046',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1047', 'Test Cases/Setting testcases/TC1047',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1049', 'Test Cases/Setting testcases/TC1049',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1050', 'Test Cases/Setting testcases/TC1050',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1051', 'Test Cases/Setting testcases/TC1051',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1052', 'Test Cases/Setting testcases/TC1052',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1053', 'Test Cases/Setting testcases/TC1053',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1055', 'Test Cases/Setting testcases/TC1055',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1056', 'Test Cases/Setting testcases/TC1056',  null), new TestCaseBinding('Test Cases/Setting testcases/TC1057', 'Test Cases/Setting testcases/TC1057',  null)])
