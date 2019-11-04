<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendMessage_With_sticker</name>
   <tag></tag>
   <elementGuidId>0d42ebc1-a01d-4294-9477-d7fef1bc8541</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;company_id\&quot;: \&quot;5c09019d1276ef481a71590a\&quot;,\n   \&quot;datetime\&quot;: \&quot;Fri Oct 11 2019 15:18:41 GMT+0500 (Pakistan Standard Time)\&quot;,\n    \&quot;payload\&quot;: \n  {\n    \&quot;componentType\&quot;: \&quot;sticker\&quot;,\n    \&quot;fileurl\&quot;: \&quot;https://static.stickerpipe.com/sticker/gorilla27/angry_hdpi.png?scl\u003d1248\u0026sh\u003dIdLCWGvEZTW_pOs_D53thQ\&quot;\n  },\n    \&quot;recipient_fb_id\&quot;: \&quot;1992141750906546\&quot;,\n    \&quot;recipient_id\&quot;: \&quot;5cc841e26ccd3b362a560578\&quot;,\n    \&quot;replied_by\&quot;: {\&quot;type\&quot;: \&quot;agent\&quot;, \&quot;id\&quot;: \&quot;5c09019d1276ef481a715909\&quot;, \&quot;name\&quot;: \&quot;cloudkibo1\&quot;},\n  \&quot;sender_fb_id\&quot;: \&quot;498476287304089\&quot;,\n  \&quot;sender_id\&quot;: \&quot;5c0902321276ef481a715918\&quot;,\n  \&quot;status\&quot;: \&quot;unseen\&quot;,\n  \&quot;subscriber_id\&quot;: \&quot;5cc841e26ccd3b362a560578\&quot;,\n  \&quot;url_meta\&quot;: {}\n  \n}&quot;,
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
   <restUrl>https://kibochat.cloudkibo.com/api/livechat/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.Token</defaultValue>
      <description></description>
      <id>87bcedf6-18e6-42c7-b2aa-11ab365edf59</id>
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

assertThat(response.getStatusCode()).isEqualTo(200)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
