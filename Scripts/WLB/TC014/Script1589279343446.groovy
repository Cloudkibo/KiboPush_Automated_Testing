import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('WLB/TC007'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Base Group URL_baseUrl'), 'https://chat.whatsapp.com/invite/JhtR1G1NNwr02i5hsRaO21')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Base Group Name_baseUrl'), 'Group2')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Participant Count_count'), '10')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Add Group'))

WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Page_React App/input_Base Group URL_baseUrl1'), 'https://chat.whatsapp.com/invite/JhtR1G1NNwr02i5hsRaO22')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Base Group Name_baseUrl1'), 'Group3')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Participant Count_count1'), '10')

WebUI.click(findTestObject('Object Repository/Page_React App/addURl'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_URL Created Successfully'))

//WebUI.click(findTestObject('Object Repository/Page_React App/span_delete_outline'))
//
//WebUI.click(findTestObject('Object Repository/Page_React App/h5_Delete Confirmation'))
//
//WebUI.setText(findTestObject('Object Repository/Page_React App/input_Are you sure you want to delete this _c9a449'), 'arveen@cloudkibo.com')
//
//WebUI.click(findTestObject('Object Repository/Page_React App/button_Delete'))
//
//WebUI.click(findTestObject('Object Repository/Page_React App/div_Deleted URL Successfully'))
//
