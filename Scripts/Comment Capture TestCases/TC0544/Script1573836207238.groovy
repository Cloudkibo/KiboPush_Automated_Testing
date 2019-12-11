import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Comment Capture TestCases/TC0514'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Title_title'), 'test')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Link Existing Post_new'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/i_Create a Facebook Post that will be published on your page_fa fa-smile-o'))
