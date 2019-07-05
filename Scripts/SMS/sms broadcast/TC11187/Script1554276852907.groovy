//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import internal.GlobalVariable as GlobalVariable
//import org.openqa.selenium.By as By
//import org.openqa.selenium.WebDriver as WebDriver
//import org.openqa.selenium.WebElement as WebElement
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Dashboard/span_Broadcasts'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/h3_Broadcasts (1) (1) (1) (1) (1) (1) (1) (1) (1) (2)'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/span_Create New (1) (1) (1) (1) (1) (1) (1) (1) (2)'))
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Create New Broadcast (1) (1) (1) (1) (1) (1) (1) (1) (2)'))
//
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Push Message_form-control m-input (1) (1) (1) (1) (1) (1) (2)'), 
//    'faizan')
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/textarea_Automated testing (1) (1) (2)'), 'Automated testing')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/select_Select Conditionnamenumber (2) (1) (1) (2)'), 
//    'number', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with (2) (1) (1) (2)'), 
//    'is', true)
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Value_text (2) (1) (1) (2)'), '+923333739566')
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_ Add Condition (2)'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/select_Select Conditionnamenumber (3) (2)'), 
//    'name', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/select_Select Criteriaiscontainsbegins with (3) (2)'), 
//    'contains', true)
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Remove_text (2)'), 'Fa')
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Remove_text_1 (1)'), 'Fa')
//
//WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/input_Remove_text_2'), 'Fa')
//
//WebUI.click(findTestObject('Object Repository/Page_KiboEngage  Broadcasts/button_Reset'))
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement Table = driver.findElement(By.xpath('//*[@id="m-datatable--27866229129"]/tbody'))
//
//List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
//
//WebUI.verifyEqual(rows_table.size(), 1)
//
