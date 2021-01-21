package com.demo.util;

import java.io.File;

import com.demo.constant.Constant;
import com.demo.pojo.ConfigPojo;
import com.jayway.jsonpath.JsonPath;

public class Configuration {

	private static Configuration configuration = null;
		
	private Configuration() {
	
		try {
			File jsonFile = new File(Constant.configFilePath+File.separator+ConfigPojo.configFile);
			ConfigPojo.baseURI = JsonPath.read(jsonFile,"baseURL");
			ConfigPojo.webURL = JsonPath.read(jsonFile, "webURL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Configuration getInstance() {
		
		if (configuration == null) {
			configuration = new Configuration();
		}
		
		return configuration;
	}
}
