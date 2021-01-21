package com.demo.test;

import java.util.HashMap;

import org.databene.benerator.anno.Source;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.base.Base;
import com.demo.constant.Constant;
import com.demo.pojo.HttpParameter;
import com.demo.util.RestUtil;

import io.restassured.response.Response;

public class TestClass extends Base{

	@BeforeTest
	public void beforeTest() {
		Base base = new Base();
		base.setUp();
	}
	
	@Test(dataProvider = "feeder")
	@Source("input\\testInput.csv")
	public void testFunc1(String testCaseID, String testCaseName, String apiMethod, String paramType, String expectedStatusCode) {
		
		HttpParameter httpParameter = new HttpParameter();
		HashMap<String, Object> hashMap =  new HashMap<String, Object>();
		hashMap.put("page", 2);
		httpParameter.setQueryParam(hashMap);
		
		RestUtil restUtil = new RestUtil();
		Response response = restUtil.apiCall(Constant.listUser, apiMethod, paramType, httpParameter);
		
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(expectedStatusCode));
	}
}
