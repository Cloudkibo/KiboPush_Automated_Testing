<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_image</name>
   <tag></tag>
   <elementGuidId>42127518-27a6-4fbc-890c-71d00cfe1335</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n\t\&quot;buttons\&quot;: [],\n\t\&quot;componentType\&quot;: \&quot;media\&quot;,\n\t\&quot;fileName\&quot;: \&quot;download.jpg\&quot;,\n   \t\&quot;id\&quot;: 1564982391436,           \&quot;image_url\&quot;:\&quot;https://accounts.cloudkibo.com/api/v1/files/download/f64ea959a1b20198551930.jpg\&quot;,\n\t\&quot;mediaType\&quot;: \&quot;image\&quot;,\n\t\&quot;size\&quot;: 15712,\n\t\&quot;type\&quot;: \&quot;image/jpeg\&quot;,\n\t\&quot;fileurl\&quot;: {\n  \t\t\&quot;attachment_id\&quot;: \&quot;2359730187448428\&quot;,\n\t\t\&quot;id\&quot;: \&quot;f64ea959a1b20198551930.jpg\&quot;,\n\t\t\&quot;name\&quot;: \&quot;download.jpg\&quot;,\n\t\t\&quot;url\&quot;:\t\&quot;https://accounts.cloudkibo.com/api/v1/files/download/f64ea959a1b20198551930.jpg\&quot;\n}\n }\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
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
      <id>8f9802b4-7f19-497c-8391-a0732ae3bac3</id>
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
