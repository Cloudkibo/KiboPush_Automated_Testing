import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Comment Capture TestCases/TC0514'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Title_title'), 'test')

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/input_Link Existing Post_new'))

WebUI.setText(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/textarea_facebook post'), 'facebook post')

String img = RunConfiguration.getProjectDir() + '/sample.jpg'

WebUI.uploadFile(findTestObject('Object Repository/Page_KiboPush  Comment Capture/img'), img)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/span_See How It Looks'))

WebUI.click(findTestObject('Object Repository/Page_KiboEngage  New Facebook Post/div_Preview Post'))

