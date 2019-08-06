<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_With_list_only Title and subtitle and Large_Image</name>
   <tag></tag>
   <elementGuidId>f1e3263e-3378-433e-9445-49ae2609594c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n   \&quot;buttons\&quot;: [],\n   \&quot;componentType\&quot;: \&quot;list\&quot;,\n   \&quot;id\&quot;: 1564998346677,\n   \&quot;topElementStyle\&quot;: \&quot;Large\&quot;,\n   \&quot;listItems\&quot; : [\n     {\n       \&quot;buttons\&quot;: [],\n\t   \&quot;image_url\&quot;: \&quot;https://accounts.cloudkibo.com/api/v1/files/download/f8864cf79f520198595341.jpg\&quot;,\n       \&quot;subtitle\&quot;: \&quot;subtitle1\&quot;,\n       \&quot;title\&quot;: \&quot;title1\&quot;\n     },\n          {\n       \&quot;buttons\&quot;: [],\n\t   \&quot;image_url\&quot;: \&quot;https://accounts.cloudkibo.com/api/v1/files/download/f4296b8021c20198595352.jpg\&quot;,\n       \&quot;subtitle\&quot;: \&quot;subtitle2\&quot;,\n       \&quot;title\&quot;: \&quot;title2\&quot;\n     }\n   \n   ]\n     \n\n\t\n\n }\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
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
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1YzA5MDE5ZDEyNzZlZjQ4MWE3MTU5MDkiLCJpYXQiOjE1NjQ5ODA0OTEsImV4cCI6MTU2NTMyNjA5MX0.4m0km4qma7If6YJVvxiBJVj2U77-fIQkoFm-Sv79Wc0</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://kiboengage.cloudkibo.com/api/broadcasts/sendConversation</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
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
