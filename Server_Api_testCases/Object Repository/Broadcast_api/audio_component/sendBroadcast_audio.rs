<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_audio</name>
   <tag></tag>
   <elementGuidId>c96007f4-f445-411e-a4fe-ad0e57e16287</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n\t\&quot;fileName\&quot;: \&quot;SampleAudio_0.4mb.mp3\&quot;,\n   \t\&quot;id\&quot;: 1564993889548,           \n\t\&quot;componentType\&quot;: \&quot;audio\&quot;,\n\t\&quot;size\&quot;: 443926,\n\t\&quot;type\&quot;: \&quot;audio/mp3\&quot;,\n\t\&quot;fileurl\&quot;: {\n  \t\t\&quot;attachment_id\&quot;: \&quot;702832206848818\&quot;,\n\t\t\&quot;id\&quot;: \&quot;f9766d1508620198583126.mp3\&quot;,\n\t\t\&quot;name\&quot;: \&quot;SampleAudio_0.4mb.mp3\&quot;,\n\t\t\&quot;url\&quot;:\t\&quot;https://accounts.cloudkibo.com/api/v1/files/download/f9766d1508620198583126.mp3\&quot;\n}\n }\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
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
      <id>69d13010-1012-4e3a-9167-78b1438eb9eb</id>
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
