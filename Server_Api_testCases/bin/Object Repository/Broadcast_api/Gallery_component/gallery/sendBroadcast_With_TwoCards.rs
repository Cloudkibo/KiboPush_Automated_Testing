<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_With_TwoCards</name>
   <tag></tag>
   <elementGuidId>18661e75-689b-447d-82cf-ec47cd238965</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n   \&quot;componentType\&quot;: \&quot;gallery\&quot;,\n   \&quot;id\&quot;: 1564992357450,\n   \&quot;cards\&quot;: [\n     {\n       \t\&quot;buttons\&quot;: [{ \n     \t\&quot;title\&quot;: \&quot;google\&quot;,\n   \t\t\&quot;type\&quot;: \&quot;web_url\&quot;,\n \&quot;url\&quot;:\&quot;https://kiboengage.cloudkibo.com/api/URL/broadcast/5d47e3679386c778c27ae939\&quot;\n  }],\n   \&quot;fileName\&quot;: \&quot;download.jpg\&quot;,   \n   \&quot;fileurl\&quot;: {\n     \&quot;id\&quot;: \&quot;fe34b0959f32019858520.jpg\&quot;,\n     \&quot;name\&quot;: \&quot;download.jpg\&quot;,\n     \&quot;url\&quot;: \&quot;https://accounts.cloudkibo.com/api/v1/files/download/fe34b0959f32019858520.jpg\&quot;\n   },       \&quot;image_url\&quot;:\&quot;https://accounts.cloudkibo.com/api/v1/files/download/fe34b0959f32019858520.jpg\&quot;,\n    \&quot;title\&quot;:\&quot;title1\&quot;,\n    \&quot;subtitle\&quot;: \&quot;subtitle1\&quot;,\n\t\&quot;size\&quot;: 15712,\n\t\&quot;type\&quot;: \&quot;image/jpeg\&quot;\n       \n     },\n     {\n       \t\&quot;buttons\&quot;: [{ \n     \t\&quot;title\&quot;: \&quot;facebook\&quot;,\n   \t\t\&quot;type\&quot;: \&quot;web_url\&quot;,\n \&quot;url\&quot;:\&quot;https://kiboengage.cloudkibo.com/api/URL/broadcast/5d47e3679386c778c27ae93a\&quot;\n  }],\n   \&quot;fileName\&quot;: \&quot;images.jpg\&quot;, \n      \&quot;fileurl\&quot;: {\n     \&quot;id\&quot;: \&quot;fd0009abdb42019858541.jpg\&quot;,\n     \&quot;name\&quot;: \&quot;images.jpg\&quot;,\n     \&quot;url\&quot;: \&quot;https://accounts.cloudkibo.com/api/v1/files/download/fd0009abdb42019858541.jpg\&quot;\n   },        \&quot;image_url\&quot;:\&quot;https://accounts.cloudkibo.com/api/v1/files/download/fd0009abdb42019858541.jpg\&quot;,\n    \&quot;title\&quot;:\&quot;title2\&quot;,\n     \&quot;subtitle\&quot;: \&quot;subtitle2\&quot;,\n\t\&quot;size\&quot;: 4818,\n\t\&quot;type\&quot;: \&quot;image/jpeg\&quot;\n       \n     }\n   \n   \n   ]\n }\n\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
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
      <id>fcd71c24-7cae-4327-88e9-deeee4d7258b</id>
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
