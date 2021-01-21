package com.demo.base;

import org.databene.feed4testng.FeedTest;

import com.demo.pojo.ConfigPojo;
import com.demo.util.Configuration;

public class Base extends FeedTest {

	public void setUp() {
		ConfigPojo.configFile = "configJSON.json";
		Configuration.getInstance();
	}
}
