package com.demo.test;

import java.util.HashMap;

import org.databene.benerator.anno.Source;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.base.Base;
import com.demo.constant.Constant;
import com.demo.pages.LoginPage;
import com.demo.pojo.ConfigPojo;
import com.demo.pojo.HttpParameter;
import com.demo.uiUtil.DriverManager;
import com.demo.uiUtil.WebDriverFactory;
import com.demo.util.RestUtil;

import io.restassured.response.Response;

public class TestClass extends Base{

	WebDriver driver = null;
	DriverManager driverManager = null;
	
	@BeforeTest
	public void beforeTest() {
		Base base = new Base();
		driverManager = WebDriverFactory.getManager("chrome");
		driver = driverManager.createDriver();
		base.setUp();
	}
	
	@Test(dataProvider = "feeder")
	@Source("input\\testInput.csv")
	public void testFunc1(String testCaseID, String testCaseName, String apiMethod, String paramType, String expectedStatusCode, 
			String userEmail, String password) {
		
		HttpParameter httpParameter = new HttpParameter();
		HashMap<String, Object> hashMap =  new HashMap<String, Object>();
		hashMap.put("page", 2);
		httpParameter.setQueryParam(hashMap);
		
		RestUtil restUtil = new RestUtil();
		Response response = restUtil.apiCall(Constant.listUser, apiMethod, paramType, httpParameter);
		
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(expectedStatusCode));
		
		driver.get(ConfigPojo.webURL);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logIn(userEmail, password);
	}
	
	@AfterTest
	public void afterTest() {
		driverManager.quitDriver(driver);
	}
}
