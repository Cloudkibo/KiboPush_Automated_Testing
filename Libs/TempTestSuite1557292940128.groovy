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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/Sidebar_muzamil')

suiteProperties.put('name', 'Sidebar_muzamil')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\Sidebar_muzamil\\20190508_102220\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/Sidebar_muzamil', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0054', 'Test Cases/SideBar TestCases/TC0054',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0055', 'Test Cases/SideBar TestCases/TC0055',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0056', 'Test Cases/SideBar TestCases/TC0056',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0057', 'Test Cases/SideBar TestCases/TC0057',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0058', 'Test Cases/SideBar TestCases/TC0058',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0059', 'Test Cases/SideBar TestCases/TC0059',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0062', 'Test Cases/SideBar TestCases/TC0062',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0063', 'Test Cases/SideBar TestCases/TC0063',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0064', 'Test Cases/SideBar TestCases/TC0064',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0065', 'Test Cases/SideBar TestCases/TC0065',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0066', 'Test Cases/SideBar TestCases/TC0066',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0067', 'Test Cases/SideBar TestCases/TC0067',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0075', 'Test Cases/SideBar TestCases/TC0075',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0073', 'Test Cases/SideBar TestCases/TC0073',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0071', 'Test Cases/SideBar TestCases/TC0071',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0077', 'Test Cases/SideBar TestCases/TC0077',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11054', 'Test Cases/SideBar TestCases/TC11054',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11055', 'Test Cases/SideBar TestCases/TC11055',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11056', 'Test Cases/SideBar TestCases/TC11056',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11057', 'Test Cases/SideBar TestCases/TC11057',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11058', 'Test Cases/SideBar TestCases/TC11058',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11059', 'Test Cases/SideBar TestCases/TC11059',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11060', 'Test Cases/SideBar TestCases/TC11060',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11061', 'Test Cases/SideBar TestCases/TC11061',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11062', 'Test Cases/SideBar TestCases/TC11062',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC11108', 'Test Cases/SideBar TestCases/TC11108',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0060', 'Test Cases/SideBar TestCases/TC0060',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0061', 'Test Cases/SideBar TestCases/TC0061',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0069', 'Test Cases/SideBar TestCases/TC0069',  null), new TestCaseBinding('Test Cases/SideBar TestCases/TC0074', 'Test Cases/SideBar TestCases/TC0074',  null)])
