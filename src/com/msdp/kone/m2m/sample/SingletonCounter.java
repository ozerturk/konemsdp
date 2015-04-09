package com.msdp.kone.m2m.sample;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.msdp.kone.m2m.client.Output;
import com.msdp.kone.m2m.service.rest.HttpClientGet;

public class SingletonCounter {
	
	public static int counter = 0;
	
	public static List<Output> m2mData = new ArrayList<Output>();
	
	public static Gson gson = new Gson();
	
	public static final SingletonCounter INSTANCE = new SingletonCounter();
	
	public static String increaseCounter(){
		return String.valueOf(counter++); 
	}
	
	public static SingletonCounter getInstance(){
		return INSTANCE;
	}
	
	public static String getResponseFromRESTInterface(){
		return HttpClientGet.getResponseFromRESTInterface();
	}
	
	public static String getResponseFromRESTPOSTInterface(String command){
		return HttpClientGet.getResponseFromRESTPOSTInterface(command);
	}
	
	public static String getResponseFromRESTGETInterface(){
		return HttpClientGet.getResponseFromRESTGETInterface();
	}

	public static void subscribeToM2mDM() {
		HttpClientGet.subscribeToM2mDM();
	}
	
	public static List<Output> getStatus(){
		return m2mData;
	}

	public static List<Output> getM2mData() {
		return m2mData;
	}

	public static void addM2mData(Output m2mData) {
		SingletonCounter.m2mData.add(m2mData);
	}

	public static Gson getGson() {
		return gson;
	}

	public static void setGson(Gson gson) {
		SingletonCounter.gson = gson;
	}
	
}
