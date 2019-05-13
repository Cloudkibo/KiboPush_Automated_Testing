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


suiteProperties.put('id', 'Test Suites/Faizan Suits/inviteUsingPhoneNumber')

suiteProperties.put('name', 'inviteUsingPhoneNumber')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\inviteUsingPhoneNumber\\20190508_113352\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/inviteUsingPhoneNumber', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kiboengage',  null), new TestCaseBinding('Test Cases/Invite subscribers/open growth tools', 'Test Cases/Invite subscribers/open growth tools',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0919', 'Test Cases/Invite Using Phone Number/TC0919',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0920', 'Test Cases/Invite Using Phone Number/TC0920',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0921', 'Test Cases/Invite Using Phone Number/TC0921',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0926', 'Test Cases/Invite Using Phone Number/TC0926',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0927', 'Test Cases/Invite Using Phone Number/TC0927',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0928', 'Test Cases/Invite Using Phone Number/TC0928',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0928-viewCustomers', 'Test Cases/Invite Using Phone Number/TC0928-viewCustomers',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0929', 'Test Cases/Invite Using Phone Number/TC0929',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0930', 'Test Cases/Invite Using Phone Number/TC0930',  null), new TestCaseBinding('Test Cases/Invite Using Phone Number/TC0938', 'Test Cases/Invite Using Phone Number/TC0938',  null)])
