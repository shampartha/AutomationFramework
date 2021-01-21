package com.demo.util;

public class Configuration {

	private static Configuration configuration = null;
	
	private Configuration() {
		
	}
	
	public static Configuration getInstance() {
		
		if (configuration == null) {
			configuration = new Configuration();
		}
		
		return configuration;
	}
}
