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
import org.openqa.selenium.Keys as Keys

def Excelsheet = findTestData('Data Files/Data')

def data = Excelsheet.allData

WebUI.callTestCase(findTestCase('NavigateToAutomationUI'), [:], FailureHandling.STOP_ON_FAILURE)

for (j = 0; j <data.size(); j++) {
	
  def firstRow = data[j]
	
if(j==0) {	
def trigger = firstRow[j].toString().split("-")
for (i = 0; i <trigger.size(); i++) {
	
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/div_Type something and press enter'))
	
	WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Type something and press enter_react-_ac0af8'),
		trigger[i])
	
	WebUI.sendKeys(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Type something and press enter_react-_ac0af8'),
		Keys.chord(Keys.ENTER))
	
	WebUI.delay(3)
		
	}
}


WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/textarea_Text_form-control'), firstRow[1])

for (i = 3; i <firstRow.size() && firstRow.size()>3; i++) {
	
	if(firstRow[i]!= '') {
	
	def exitingblock = firstRow[i].toString().split("-")
	if(exitingblock.size() < 2) {
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_ Add'))
	
	WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Title_form-control m-input'),firstRow[i] )
	
	}
	else {
		WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_ Add'))
		
		WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Title_form-control m-input'),exitingblock[0])
		WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/span'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Select_react-select-3-input'), Keys.chord(exitingblock[1],Keys.ENTER))

		WebUI.delay(2)
		
	}
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_Save'))
	WebUI.delay(3)
 }
}
if(firstRow[2] != '') {
	WebUI.setText(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/input_Attachment__attachment_in_chatbot'),
		firstRow[2])
	WebUI.delay(30)
}
if(j==data.size()-1) {
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/span_Save'))
	WebUI.delay(10)
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_Publish'))
	
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/div_Bot published successfully'))
	WebUI.closeBrowser()
} else {
	WebUI.click(findTestObject('Object Repository/Page_KiboChat  Configure ChatBot/button_Next'))
}
  WebUI.delay(3)
}
	
WebUI.closeBrowser()
