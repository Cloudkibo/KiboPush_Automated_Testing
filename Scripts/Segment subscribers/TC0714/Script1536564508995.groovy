import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/h3_Create SubList of Subscribe (1)'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/input_segmentationType'))

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/button_Save (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_KiboPush  Dashboard/span_Please enter name for the'))
