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


suiteProperties.put('id', 'Test Suites/Template')

suiteProperties.put('name', 'Template')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/home/cloudkibo-faizan/Drive/Katalon/production/KiboPush/Reports/Template/20190325_174422/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Template', suiteProperties, [new TestCaseBinding('Test Cases/Template testcases/TC0760', 'Test Cases/Template testcases/TC0760',  null), new TestCaseBinding('Test Cases/Template testcases/TC0761', 'Test Cases/Template testcases/TC0761',  null), new TestCaseBinding('Test Cases/Template testcases/TC0762', 'Test Cases/Template testcases/TC0762',  null), new TestCaseBinding('Test Cases/Template testcases/TC0763', 'Test Cases/Template testcases/TC0763',  null), new TestCaseBinding('Test Cases/Template testcases/TC0764', 'Test Cases/Template testcases/TC0764',  null), new TestCaseBinding('Test Cases/Template testcases/TC0765', 'Test Cases/Template testcases/TC0765',  null), new TestCaseBinding('Test Cases/Template testcases/TC0766', 'Test Cases/Template testcases/TC0766',  null), new TestCaseBinding('Test Cases/Template testcases/TC0767', 'Test Cases/Template testcases/TC0767',  null), new TestCaseBinding('Test Cases/Template testcases/TC0768', 'Test Cases/Template testcases/TC0768',  null), new TestCaseBinding('Test Cases/Template testcases/TC0769', 'Test Cases/Template testcases/TC0769',  null), new TestCaseBinding('Test Cases/Template testcases/TC0770', 'Test Cases/Template testcases/TC0770',  null), new TestCaseBinding('Test Cases/Template testcases/TC0771', 'Test Cases/Template testcases/TC0771',  null), new TestCaseBinding('Test Cases/Template testcases/TC0772', 'Test Cases/Template testcases/TC0772',  null), new TestCaseBinding('Test Cases/Template testcases/TC0773', 'Test Cases/Template testcases/TC0773',  null), new TestCaseBinding('Test Cases/Template testcases/TC0774', 'Test Cases/Template testcases/TC0774',  null), new TestCaseBinding('Test Cases/Template testcases/TC0775', 'Test Cases/Template testcases/TC0775',  null), new TestCaseBinding('Test Cases/Template testcases/TC0776', 'Test Cases/Template testcases/TC0776',  null), new TestCaseBinding('Test Cases/Template testcases/TC0777', 'Test Cases/Template testcases/TC0777',  null), new TestCaseBinding('Test Cases/Template testcases/TC0778', 'Test Cases/Template testcases/TC0778',  null), new TestCaseBinding('Test Cases/Template testcases/TC0779', 'Test Cases/Template testcases/TC0779',  null), new TestCaseBinding('Test Cases/Template testcases/TC0780', 'Test Cases/Template testcases/TC0780',  null), new TestCaseBinding('Test Cases/Template testcases/TC0781', 'Test Cases/Template testcases/TC0781',  null), new TestCaseBinding('Test Cases/Template testcases/TC0782', 'Test Cases/Template testcases/TC0782',  null), new TestCaseBinding('Test Cases/Template testcases/TC0783', 'Test Cases/Template testcases/TC0783',  null), new TestCaseBinding('Test Cases/Template testcases/TC0784', 'Test Cases/Template testcases/TC0784',  null), new TestCaseBinding('Test Cases/Template testcases/TC0785', 'Test Cases/Template testcases/TC0785',  null), new TestCaseBinding('Test Cases/Template testcases/TC0786', 'Test Cases/Template testcases/TC0786',  null), new TestCaseBinding('Test Cases/Template testcases/TC0787', 'Test Cases/Template testcases/TC0787',  null), new TestCaseBinding('Test Cases/Template testcases/TC0788', 'Test Cases/Template testcases/TC0788',  null), new TestCaseBinding('Test Cases/Template testcases/TC0789', 'Test Cases/Template testcases/TC0789',  null), new TestCaseBinding('Test Cases/Template testcases/TC0790', 'Test Cases/Template testcases/TC0790',  null), new TestCaseBinding('Test Cases/Template testcases/TC0791', 'Test Cases/Template testcases/TC0791',  null), new TestCaseBinding('Test Cases/Template testcases/TC0792', 'Test Cases/Template testcases/TC0792',  null), new TestCaseBinding('Test Cases/Template testcases/TC0793', 'Test Cases/Template testcases/TC0793',  null), new TestCaseBinding('Test Cases/Template testcases/TC0794', 'Test Cases/Template testcases/TC0794',  null), new TestCaseBinding('Test Cases/Template testcases/TC0795', 'Test Cases/Template testcases/TC0795',  null), new TestCaseBinding('Test Cases/Template testcases/TC0796', 'Test Cases/Template testcases/TC0796',  null), new TestCaseBinding('Test Cases/Template testcases/TC0797', 'Test Cases/Template testcases/TC0797',  null), new TestCaseBinding('Test Cases/Template testcases/TC0798', 'Test Cases/Template testcases/TC0798',  null), new TestCaseBinding('Test Cases/Template testcases/TC0799', 'Test Cases/Template testcases/TC0799',  null), new TestCaseBinding('Test Cases/Template testcases/TC0801', 'Test Cases/Template testcases/TC0801',  null), new TestCaseBinding('Test Cases/Template testcases/TC0802', 'Test Cases/Template testcases/TC0802',  null), new TestCaseBinding('Test Cases/Template testcases/TC0803', 'Test Cases/Template testcases/TC0803',  null), new TestCaseBinding('Test Cases/Template testcases/TC0804', 'Test Cases/Template testcases/TC0804',  null), new TestCaseBinding('Test Cases/Template testcases/TC0805', 'Test Cases/Template testcases/TC0805',  null), new TestCaseBinding('Test Cases/Template testcases/TC0806', 'Test Cases/Template testcases/TC0806',  null), new TestCaseBinding('Test Cases/Template testcases/TC0807', 'Test Cases/Template testcases/TC0807',  null), new TestCaseBinding('Test Cases/Template testcases/TC0808', 'Test Cases/Template testcases/TC0808',  null), new TestCaseBinding('Test Cases/Template testcases/TC0809', 'Test Cases/Template testcases/TC0809',  null), new TestCaseBinding('Test Cases/Template testcases/TC0810', 'Test Cases/Template testcases/TC0810',  null), new TestCaseBinding('Test Cases/Template testcases/TC0811', 'Test Cases/Template testcases/TC0811',  null), new TestCaseBinding('Test Cases/Template testcases/TC0812', 'Test Cases/Template testcases/TC0812',  null), new TestCaseBinding('Test Cases/Template testcases/TC0813', 'Test Cases/Template testcases/TC0813',  null), new TestCaseBinding('Test Cases/Template testcases/TC0814', 'Test Cases/Template testcases/TC0814',  null), new TestCaseBinding('Test Cases/Template testcases/TC0815', 'Test Cases/Template testcases/TC0815',  null), new TestCaseBinding('Test Cases/Template testcases/TC0816', 'Test Cases/Template testcases/TC0816',  null), new TestCaseBinding('Test Cases/Template testcases/TC0817', 'Test Cases/Template testcases/TC0817',  null), new TestCaseBinding('Test Cases/Template testcases/TC0818', 'Test Cases/Template testcases/TC0818',  null), new TestCaseBinding('Test Cases/Template testcases/TC0819', 'Test Cases/Template testcases/TC0819',  null), new TestCaseBinding('Test Cases/Template testcases/TC0820', 'Test Cases/Template testcases/TC0820',  null), new TestCaseBinding('Test Cases/Template testcases/TC0821', 'Test Cases/Template testcases/TC0821',  null), new TestCaseBinding('Test Cases/Template testcases/TC0822', 'Test Cases/Template testcases/TC0822',  null), new TestCaseBinding('Test Cases/Template testcases/TC0823', 'Test Cases/Template testcases/TC0823',  null), new TestCaseBinding('Test Cases/Template testcases/TC0824', 'Test Cases/Template testcases/TC0824',  null), new TestCaseBinding('Test Cases/Template testcases/TC0825', 'Test Cases/Template testcases/TC0825',  null), new TestCaseBinding('Test Cases/Template testcases/TC0826', 'Test Cases/Template testcases/TC0826',  null), new TestCaseBinding('Test Cases/Template testcases/TC0827', 'Test Cases/Template testcases/TC0827',  null), new TestCaseBinding('Test Cases/Template testcases/TC0828', 'Test Cases/Template testcases/TC0828',  null), new TestCaseBinding('Test Cases/Template testcases/TC0829', 'Test Cases/Template testcases/TC0829',  null), new TestCaseBinding('Test Cases/Template testcases/TC0830', 'Test Cases/Template testcases/TC0830',  null), new TestCaseBinding('Test Cases/Template testcases/TC0831', 'Test Cases/Template testcases/TC0831',  null), new TestCaseBinding('Test Cases/Template testcases/TC0832', 'Test Cases/Template testcases/TC0832',  null), new TestCaseBinding('Test Cases/Template testcases/TC0833', 'Test Cases/Template testcases/TC0833',  null), new TestCaseBinding('Test Cases/Template testcases/TC0834', 'Test Cases/Template testcases/TC0834',  null), new TestCaseBinding('Test Cases/Template testcases/TC0835', 'Test Cases/Template testcases/TC0835',  null), new TestCaseBinding('Test Cases/Template testcases/TC0836', 'Test Cases/Template testcases/TC0836',  null), new TestCaseBinding('Test Cases/Template testcases/TC0837', 'Test Cases/Template testcases/TC0837',  null), new TestCaseBinding('Test Cases/Template testcases/TC0838', 'Test Cases/Template testcases/TC0838',  null), new TestCaseBinding('Test Cases/Template testcases/TC0839', 'Test Cases/Template testcases/TC0839',  null), new TestCaseBinding('Test Cases/Template testcases/TC0840', 'Test Cases/Template testcases/TC0840',  null), new TestCaseBinding('Test Cases/Template testcases/TC0841', 'Test Cases/Template testcases/TC0841',  null), new TestCaseBinding('Test Cases/Template testcases/TC0842', 'Test Cases/Template testcases/TC0842',  null), new TestCaseBinding('Test Cases/Template testcases/TC0843', 'Test Cases/Template testcases/TC0843',  null), new TestCaseBinding('Test Cases/Template testcases/TC0844', 'Test Cases/Template testcases/TC0844',  null), new TestCaseBinding('Test Cases/Template testcases/TC0845', 'Test Cases/Template testcases/TC0845',  null), new TestCaseBinding('Test Cases/Template testcases/TC0846', 'Test Cases/Template testcases/TC0846',  null), new TestCaseBinding('Test Cases/Template testcases/TC0847', 'Test Cases/Template testcases/TC0847',  null), new TestCaseBinding('Test Cases/Template testcases/TC0848', 'Test Cases/Template testcases/TC0848',  null), new TestCaseBinding('Test Cases/Template testcases/TC0849', 'Test Cases/Template testcases/TC0849',  null), new TestCaseBinding('Test Cases/Template testcases/TC0850', 'Test Cases/Template testcases/TC0850',  null), new TestCaseBinding('Test Cases/Template testcases/TC0851', 'Test Cases/Template testcases/TC0851',  null), new TestCaseBinding('Test Cases/Template testcases/TC0852', 'Test Cases/Template testcases/TC0852',  null), new TestCaseBinding('Test Cases/Template testcases/TC0853', 'Test Cases/Template testcases/TC0853',  null), new TestCaseBinding('Test Cases/Template testcases/TC0856', 'Test Cases/Template testcases/TC0856',  null), new TestCaseBinding('Test Cases/Template testcases/TC0857', 'Test Cases/Template testcases/TC0857',  null), new TestCaseBinding('Test Cases/Template testcases/TC0858', 'Test Cases/Template testcases/TC0858',  null), new TestCaseBinding('Test Cases/Template testcases/TC0859', 'Test Cases/Template testcases/TC0859',  null), new TestCaseBinding('Test Cases/Template testcases/TC0860', 'Test Cases/Template testcases/TC0860',  null), new TestCaseBinding('Test Cases/Template testcases/TC0861', 'Test Cases/Template testcases/TC0861',  null), new TestCaseBinding('Test Cases/Template testcases/TC0862', 'Test Cases/Template testcases/TC0862',  null), new TestCaseBinding('Test Cases/Template testcases/TC0863', 'Test Cases/Template testcases/TC0863',  null), new TestCaseBinding('Test Cases/Template testcases/TC0864', 'Test Cases/Template testcases/TC0864',  null), new TestCaseBinding('Test Cases/Template testcases/TC0865', 'Test Cases/Template testcases/TC0865',  null), new TestCaseBinding('Test Cases/Template testcases/TC0866', 'Test Cases/Template testcases/TC0866',  null), new TestCaseBinding('Test Cases/Template testcases/TC0867', 'Test Cases/Template testcases/TC0867',  null), new TestCaseBinding('Test Cases/Template testcases/TC0868', 'Test Cases/Template testcases/TC0868',  null), new TestCaseBinding('Test Cases/Template testcases/TC0869', 'Test Cases/Template testcases/TC0869',  null), new TestCaseBinding('Test Cases/Template testcases/TC0870', 'Test Cases/Template testcases/TC0870',  null), new TestCaseBinding('Test Cases/Template testcases/TC0871', 'Test Cases/Template testcases/TC0871',  null), new TestCaseBinding('Test Cases/Template testcases/TC0872', 'Test Cases/Template testcases/TC0872',  null), new TestCaseBinding('Test Cases/Template testcases/TC0873', 'Test Cases/Template testcases/TC0873',  null), new TestCaseBinding('Test Cases/Template testcases/TC0874', 'Test Cases/Template testcases/TC0874',  null), new TestCaseBinding('Test Cases/Template testcases/TC0875', 'Test Cases/Template testcases/TC0875',  null), new TestCaseBinding('Test Cases/Template testcases/TC0876', 'Test Cases/Template testcases/TC0876',  null), new TestCaseBinding('Test Cases/Template testcases/TC0877', 'Test Cases/Template testcases/TC0877',  null), new TestCaseBinding('Test Cases/Template testcases/TC0878', 'Test Cases/Template testcases/TC0878',  null), new TestCaseBinding('Test Cases/Template testcases/TC0879', 'Test Cases/Template testcases/TC0879',  null), new TestCaseBinding('Test Cases/Template testcases/TC0880', 'Test Cases/Template testcases/TC0880',  null), new TestCaseBinding('Test Cases/Template testcases/TC0881', 'Test Cases/Template testcases/TC0881',  null), new TestCaseBinding('Test Cases/Template testcases/TC0882', 'Test Cases/Template testcases/TC0882',  null), new TestCaseBinding('Test Cases/Template testcases/TC0883', 'Test Cases/Template testcases/TC0883',  null), new TestCaseBinding('Test Cases/Template testcases/TC0884', 'Test Cases/Template testcases/TC0884',  null), new TestCaseBinding('Test Cases/Template testcases/TC0885', 'Test Cases/Template testcases/TC0885',  null), new TestCaseBinding('Test Cases/Template testcases/TC0886', 'Test Cases/Template testcases/TC0886',  null), new TestCaseBinding('Test Cases/Template testcases/TC0887', 'Test Cases/Template testcases/TC0887',  null), new TestCaseBinding('Test Cases/Template testcases/TC0888', 'Test Cases/Template testcases/TC0888',  null), new TestCaseBinding('Test Cases/Template testcases/TC0889', 'Test Cases/Template testcases/TC0889',  null), new TestCaseBinding('Test Cases/Template testcases/TC0890', 'Test Cases/Template testcases/TC0890',  null), new TestCaseBinding('Test Cases/Template testcases/TC0891', 'Test Cases/Template testcases/TC0891',  null), new TestCaseBinding('Test Cases/Template testcases/TC0892', 'Test Cases/Template testcases/TC0892',  null), new TestCaseBinding('Test Cases/Template testcases/TC0893', 'Test Cases/Template testcases/TC0893',  null), new TestCaseBinding('Test Cases/Template testcases/TC0894', 'Test Cases/Template testcases/TC0894',  null), new TestCaseBinding('Test Cases/Template testcases/TC0895', 'Test Cases/Template testcases/TC0895',  null), new TestCaseBinding('Test Cases/Template testcases/TC0896', 'Test Cases/Template testcases/TC0896',  null), new TestCaseBinding('Test Cases/Template testcases/TC0897', 'Test Cases/Template testcases/TC0897',  null), new TestCaseBinding('Test Cases/Template testcases/TC0898', 'Test Cases/Template testcases/TC0898',  null), new TestCaseBinding('Test Cases/Template testcases/TC0899', 'Test Cases/Template testcases/TC0899',  null), new TestCaseBinding('Test Cases/Template testcases/TC0900', 'Test Cases/Template testcases/TC0900',  null), new TestCaseBinding('Test Cases/Template testcases/TC0901', 'Test Cases/Template testcases/TC0901',  null), new TestCaseBinding('Test Cases/Template testcases/TC0902', 'Test Cases/Template testcases/TC0902',  null), new TestCaseBinding('Test Cases/Template testcases/TC0903', 'Test Cases/Template testcases/TC0903',  null), new TestCaseBinding('Test Cases/Template testcases/TC0904', 'Test Cases/Template testcases/TC0904',  null), new TestCaseBinding('Test Cases/Template testcases/TC0905', 'Test Cases/Template testcases/TC0905',  null), new TestCaseBinding('Test Cases/Template testcases/TC0906', 'Test Cases/Template testcases/TC0906',  null), new TestCaseBinding('Test Cases/Template testcases/TC0907', 'Test Cases/Template testcases/TC0907',  null), new TestCaseBinding('Test Cases/Template testcases/TC0908', 'Test Cases/Template testcases/TC0908',  null), new TestCaseBinding('Test Cases/Template testcases/TC0909', 'Test Cases/Template testcases/TC0909',  null), new TestCaseBinding('Test Cases/Template testcases/TC0910', 'Test Cases/Template testcases/TC0910',  null), new TestCaseBinding('Test Cases/Template testcases/TC0911', 'Test Cases/Template testcases/TC0911',  null), new TestCaseBinding('Test Cases/Template testcases/TC0912', 'Test Cases/Template testcases/TC0912',  null), new TestCaseBinding('Test Cases/Template testcases/TC0913', 'Test Cases/Template testcases/TC0913',  null), new TestCaseBinding('Test Cases/Template testcases/TC0914', 'Test Cases/Template testcases/TC0914',  null), new TestCaseBinding('Test Cases/Template testcases/TC0915', 'Test Cases/Template testcases/TC0915',  null), new TestCaseBinding('Test Cases/Template testcases/TC0916', 'Test Cases/Template testcases/TC0916',  null), new TestCaseBinding('Test Cases/Template testcases/TC0917', 'Test Cases/Template testcases/TC0917',  null), new TestCaseBinding('Test Cases/Template testcases/TC0918', 'Test Cases/Template testcases/TC0918',  null)])
