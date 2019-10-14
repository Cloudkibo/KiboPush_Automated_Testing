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


suiteProperties.put('id', 'Test Suites/Faizan Suits/Whatsapp Livechat')

suiteProperties.put('name', 'Whatsapp Livechat')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Faizan Suits\\Whatsapp Livechat\\20190508_113649\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Faizan Suits/Whatsapp Livechat', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kibochat', 'Test Cases/s-sidebar_navigation/individualAccount/Faizan_production_login_kibochat',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsappPlatformChat', 'Test Cases/Whatsapp/WhatsappPlatformChat',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11246', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11246',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11247', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11247',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11248', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11248',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11249', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11249',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11250', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11250',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11251', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11251',  null), new TestCaseBinding('Test Cases/Whatsapp/WhatsApp Livechat/TC11252', 'Test Cases/Whatsapp/WhatsApp Livechat/TC11252',  null)])
