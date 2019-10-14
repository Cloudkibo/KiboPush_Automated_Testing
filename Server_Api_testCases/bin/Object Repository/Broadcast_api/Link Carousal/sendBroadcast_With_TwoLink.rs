<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendBroadcast_With_TwoLink</name>
   <tag></tag>
   <elementGuidId>e706a017-315c-4354-bf6f-3fe273b044f4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;fbMessageTag\&quot;: \&quot;NON_PROMOTIONAL_SUBSCRIPTION\&quot;,\n\&quot;isList\&quot;: false,\n\&quot;isSegmented\&quot;: true,\n\&quot;payload\&quot;: [\n {\n   \&quot;componentType\&quot;: \&quot;gallery\&quot;,\n   \&quot;id\&quot;: 1564997488581,\n     \&quot;links\&quot;:[{\n     \&quot;loading\&quot;: false,\n\t \&quot;url\&quot;: \&quot;https://images.dawn.com/news/1183430\&quot;,\n\t \&quot;valid\&quot;: true\n \n }, {\n     \&quot;loading\&quot;: false,\n\t \&quot;url\&quot;: \&quot;https://www.dawn.com/news/1498180\&quot;,\n\t \&quot;valid\&quot;: true\n \n }],\n   \&quot;cards\&quot;:[{\n     \n     \&quot;buttons\&quot;: [{ \n     \t\&quot;title\&quot;: \&quot;Go to Article\&quot;,\n   \t\t\&quot;type\&quot;: \&quot;web_url\&quot;,\n         \&quot;url\&quot;: \&quot;https://images.dawn.com/news/1183430\&quot;\n \t}],\n    \&quot;image_url\&quot;: \&quot;https://i.dawn.com/large/2019/08/5d47e761c19fe.jpg\&quot;,\n\&quot;subtitle\&quot;: \&quot;\u0027Have we conveniently blocked what we don’t want to address? This is beyond line...\&quot;,\n\&quot;title\&quot;: \&quot;Pakistani celebrities speak up against human rights violations in Kashmir \&quot;\n},\n      {\n    \&quot;buttons\&quot;: [{ \n     \t\&quot;title\&quot;: \&quot;Go to Article\&quot;,\n   \t\t\&quot;type\&quot;: \&quot;web_url\&quot;,\n         \&quot;url\&quot;: \&quot;https://www.dawn.com/news/1498180\&quot;\n \t}],\n    \&quot;image_url\&quot;: \&quot;https://i.dawn.com/large/2019/08/5d478da7f41ce.jpg\&quot;,\n\&quot;subtitle\&quot;: \&quot;Our state has never conceived the police force to be one which serves its people...\&quot;,\n\&quot;title\&quot;: \&quot;A compromised force\&quot;          \n   \n}]\n\t\n\n }\n],\n\&quot;platform\&quot;: \&quot;facebook\&quot;,\n\&quot;segmentationGender\&quot;: [],\n\&quot;segmentationList\&quot;: [],\n\&quot;segmentationLocale\&quot;: [],\n\&quot;segmentationPageIds\&quot;: [\&quot;5c0902321276ef481a715918\&quot;],\n\&quot;segmentationTags\&quot;: [],\n\&quot;segmentationTimeZone\&quot;: \&quot;\&quot;,\n\&quot;subscribersCount\&quot;: 6,\n\&quot;title\&quot;: \&quot;Broadcast Title\&quot;\n}\n\n&quot;,
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
      <id>0da6b7ff-434f-4e47-b0dc-621ff6fd9e44</id>
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
