package com.msdp.kone.m2m.service.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class HttpClientGet {

	//localhost:32081    -->Normal
	//192.168.189.120:8181   -->Subscribe
	
	private static final String M2M_SUBSCRIPTION_URL = "http://192.168.189.120:8181/m2m/trusted/dataSubscription";
	private static final String M2M_TRUSTED_DATA_URL = "http://192.168.189.120:8181/m2m/trusted/data";

	

	public static String getResponseFromRESTInterface() {

		HttpResponse response = null;
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet("http://localhost:8888/RESTfulExample/json/product/get");
			getRequest.addHeader("accept", "application/json");

			response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return response != null ? response.toString() : "EmptyResponse";

	}

	public static String getResponseFromRESTPOSTInterface(String command) {

		HttpResponse response = null;
		try {

			byte[] bytesEncoded = Base64.encodeBase64(command.getBytes());
			String encodedCommand = new String(bytesEncoded);

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(M2M_TRUSTED_DATA_URL);
			// HttpPost postRequest = new
			// HttpPost("http://localhost:32081/m2m/trusted/data");
			postRequest.addHeader("Authorization", "PREAUTHENTICATED");
			postRequest.addHeader("X-Requester-Id", "Ericsson$elevatorMonitor");
			postRequest.addHeader("X-Requester-Type", "domainApplication");
			postRequest.addHeader("Content-Type", "application/vnd.ericsson.m2m.input+xml;version=1.2");

			postRequest.setEntity(new StringEntity("<?xml version=\"1.0\" encoding=\"UTF-8\"?><m2m:input xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  xmlns:m2m=\"urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.input\"><m2m:data><m2m:value type=\"base64\">" + encodedCommand + "</m2m:value><m2m:timestamp>2014-06-10T09:30:55.555Z</m2m:timestamp><m2m:metadata><m2m:type>command</m2m:type><m2m:eventId>event12345</m2m:eventId></m2m:metadata><m2m:sourceIdentifiers><m2m:operator>Ericsson</m2m:operator><m2m:domainApplication> Ericsson$elevatorMonitor</m2m:domainApplication></m2m:sourceIdentifiers><m2m:forward><m2m:to><m2m:destination type=\"gateway\">.#KONE2DeviceGroup1.#KONE2GatewaySpec1</m2m:destination></m2m:to></m2m:forward></m2m:data></m2m:input>"));

			response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return response != null ? response.toString() : "EmptyResponse";
	}

	public static String getResponseFromRESTGETInterface() {

		HttpResponse response = null;
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			// HttpGet getRequest = new
			// HttpGet("http://192.168.189.120:8181/m2m/trusted/data?ec=Ericsson$KONE2ExtId&usr=KONE2User&gatewaySpec=Ericsson$KONE2GatewaySpecExtId&sensorSpec=Ericsson$elevatorExtId&resourceSpec=Ericsson$valuesExtId");
			HttpGet getRequest = new HttpGet("http://localhost:32081/m2m/trusted/data?ec=Ericsson$KONE2ExtId&usr=KONE2User&gatewaySpec=Ericsson$KONE2GatewaySpecExtId&sensorSpec=Ericsson$elevatorExtId&resourceSpec=Ericsson$valuesExtId");

			getRequest.addHeader("Authorization", "PREAUTHENTICATED");
			getRequest.addHeader("X-Requester-Id", "Ericsson$elevatorMonitor");
			getRequest.addHeader("X-Requester-Type", "domainApplication");
			getRequest.addHeader("Content-Type", "application/vnd.ericsson.m2m.input+xml;version=1.2");

			response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return response != null ? response.toString() : "EmptyResponse";

	}

	public static void main(String[] args) {
		// getResponseFromRESTPOSTInterface("HelloOzer");
		//getResponseFromRESTGETInterface();
		subscribeToM2mDM();
	}

	public static String subscribeToM2mDM() {
		
		HttpResponse response = null;
		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(M2M_SUBSCRIPTION_URL);
			postRequest.addHeader("Authorization", "PREAUTHENTICATED");
			postRequest.addHeader("X-Requester-Id", "Ericsson$elevatorMonitor");
			postRequest.addHeader("X-Requester-Type", "domainApplication");
			postRequest.addHeader("Content-Type", "application/x-www-form-urlencoded;version=1.2");
			postRequest.addHeader("Accept", "application/vnd.ericsson.m2m.subscription+json;version=1.2");

			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

			nameValuePairs.add(new BasicNameValuePair("hub.mode", "subscribe"));
			nameValuePairs.add(new BasicNameValuePair("hub.topicGatewaySpec", "*"));
			nameValuePairs.add(new BasicNameValuePair("hub.callback", "http://192.168.189.140:8888/konemsdp/kone"));
			nameValuePairs.add(new BasicNameValuePair("daURN", "elevatorDispatcher"));
			nameValuePairs.add(new BasicNameValuePair("responseFormat", "vnd.ericsson.m2m.output+xml_1.2"));
			

			postRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			
			response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "test";

	}

}
