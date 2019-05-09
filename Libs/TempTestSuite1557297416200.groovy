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


suiteProperties.put('id', 'Test Suites/Test Cases Muzamil/menu')

suiteProperties.put('name', 'menu')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\KiboPush_Automated_Testing\\Reports\\Test Cases Muzamil\\menu\\20190508_113656\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Cases Muzamil/menu', suiteProperties, [new TestCaseBinding('Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil', 'Test Cases/s-sidebar_navigation/individualAccount/Login_Muzamil',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0533', 'Test Cases/Persistent Menu/TC0533',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0534', 'Test Cases/Persistent Menu/TC0534',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0535', 'Test Cases/Persistent Menu/TC0535',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0536', 'Test Cases/Persistent Menu/TC0536',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0537', 'Test Cases/Persistent Menu/TC0537',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0538', 'Test Cases/Persistent Menu/TC0538',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0539', 'Test Cases/Persistent Menu/TC0539',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0540', 'Test Cases/Persistent Menu/TC0540',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0541', 'Test Cases/Persistent Menu/TC0541',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0542', 'Test Cases/Persistent Menu/TC0542',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0543', 'Test Cases/Persistent Menu/TC0543',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0544', 'Test Cases/Persistent Menu/TC0544',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0545', 'Test Cases/Persistent Menu/TC0545',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0546', 'Test Cases/Persistent Menu/TC0546',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0547', 'Test Cases/Persistent Menu/TC0547',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0548', 'Test Cases/Persistent Menu/TC0548',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0549', 'Test Cases/Persistent Menu/TC0549',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0550', 'Test Cases/Persistent Menu/TC0550',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0551', 'Test Cases/Persistent Menu/TC0551',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0552', 'Test Cases/Persistent Menu/TC0552',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0553', 'Test Cases/Persistent Menu/TC0553',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0554', 'Test Cases/Persistent Menu/TC0554',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0555', 'Test Cases/Persistent Menu/TC0555',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0556', 'Test Cases/Persistent Menu/TC0556',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0557', 'Test Cases/Persistent Menu/TC0557',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0570', 'Test Cases/Persistent Menu/TC0570',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0571', 'Test Cases/Persistent Menu/TC0571',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0572', 'Test Cases/Persistent Menu/TC0572',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0573', 'Test Cases/Persistent Menu/TC0573',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0574', 'Test Cases/Persistent Menu/TC0574',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0575', 'Test Cases/Persistent Menu/TC0575',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0576', 'Test Cases/Persistent Menu/TC0576',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0577', 'Test Cases/Persistent Menu/TC0577',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0578', 'Test Cases/Persistent Menu/TC0578',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0579', 'Test Cases/Persistent Menu/TC0579',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0580', 'Test Cases/Persistent Menu/TC0580',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0581', 'Test Cases/Persistent Menu/TC0581',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0582', 'Test Cases/Persistent Menu/TC0582',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0583', 'Test Cases/Persistent Menu/TC0583',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0584', 'Test Cases/Persistent Menu/TC0584',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0585', 'Test Cases/Persistent Menu/TC0585',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0586', 'Test Cases/Persistent Menu/TC0586',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0587', 'Test Cases/Persistent Menu/TC0587',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0588', 'Test Cases/Persistent Menu/TC0588',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0589', 'Test Cases/Persistent Menu/TC0589',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0590', 'Test Cases/Persistent Menu/TC0590',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0591', 'Test Cases/Persistent Menu/TC0591',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0592', 'Test Cases/Persistent Menu/TC0592',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0593', 'Test Cases/Persistent Menu/TC0593',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0594', 'Test Cases/Persistent Menu/TC0594',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0595', 'Test Cases/Persistent Menu/TC0595',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0596', 'Test Cases/Persistent Menu/TC0596',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0597', 'Test Cases/Persistent Menu/TC0597',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0598', 'Test Cases/Persistent Menu/TC0598',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0599', 'Test Cases/Persistent Menu/TC0599',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0600', 'Test Cases/Persistent Menu/TC0600',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0601', 'Test Cases/Persistent Menu/TC0601',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0602', 'Test Cases/Persistent Menu/TC0602',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0603', 'Test Cases/Persistent Menu/TC0603',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0604', 'Test Cases/Persistent Menu/TC0604',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0605', 'Test Cases/Persistent Menu/TC0605',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0606', 'Test Cases/Persistent Menu/TC0606',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0607', 'Test Cases/Persistent Menu/TC0607',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0608', 'Test Cases/Persistent Menu/TC0608',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0609', 'Test Cases/Persistent Menu/TC0609',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0610', 'Test Cases/Persistent Menu/TC0610',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0611', 'Test Cases/Persistent Menu/TC0611',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0612', 'Test Cases/Persistent Menu/TC0612',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0613', 'Test Cases/Persistent Menu/TC0613',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0614', 'Test Cases/Persistent Menu/TC0614',  null), new TestCaseBinding('Test Cases/Persistent Menu/TC0615', 'Test Cases/Persistent Menu/TC0615',  null)])
