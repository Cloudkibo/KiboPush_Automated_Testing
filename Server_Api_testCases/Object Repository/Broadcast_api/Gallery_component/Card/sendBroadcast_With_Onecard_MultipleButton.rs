<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_With_Onecard_MultipleButton</name>
   <tag></tag>
   <elementGuidId>6d080e78-1a25-4af9-bbd8-87dafb26e287</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n\t\&quot;buttons\&quot;: [{ \n     \t\&quot;title\&quot;: \&quot;google\&quot;,\n   \t\t\&quot;type\&quot;: \&quot;web_url\&quot;,\n \&quot;url\&quot;:\&quot;https://kiboengage.cloudkibo.com/api/URL/broadcast/5d47b7709386c778c27ae4de\&quot;\n  },\n         {\&quot;title\&quot;: \&quot;facebook\&quot;,\n   \&quot;type\&quot;: \&quot;web_url\&quot;,\n \&quot;url\&quot;:\&quot;https://kiboengage.cloudkibo.com/api/URL/broadcast/5d47ba959386c778c27ae503\&quot;\n } ,\n   {\n      \&quot;type\&quot;: \&quot;element_share\&quot;          \n   \n   }\n],\n\t\&quot;componentType\&quot;: \&quot;card\&quot;,\n    \&quot;description\&quot;: \&quot;Subtitle\&quot;,\n\t\&quot;fileName\&quot;: \&quot;download.jpg\&quot;,\n   \t\&quot;id\&quot;: 1564984851664,           \&quot;image_url\&quot;:\&quot;https://accounts.cloudkibo.com/api/v1/files/download/f294d2ed4d72019856038.jpg\&quot;,\n\t\&quot;title\&quot;:\&quot;Title1\&quot;,\n\t\&quot;size\&quot;: 15712,\n\t\&quot;type\&quot;: \&quot;image/jpeg\&quot;,\n\t\&quot;fileurl\&quot;: {\n\t\t\&quot;id\&quot;: \&quot;f294d2ed4d72019856038.jpg\&quot;,\n\t\t\&quot;name\&quot;: \&quot;download.jpg\&quot;,\n\t\t\&quot;url\&quot;:\t\&quot;https://accounts.cloudkibo.com/api/v1/files/download/f294d2ed4d72019856038.jpg\&quot;\n}\n }\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${Token}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://kiboengage.cloudkibo.com/api/broadcasts/sendConversation</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.Token</defaultValue>
      <description></description>
      <id>a74e5308-e3ff-4525-909b-7d6deeba62aa</id>
      <masked>false</masked>
      <name>Token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
