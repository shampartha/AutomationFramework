package com.demo.driverManager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.uiUtil.DriverManager;

public class ChromeManager extends DriverManager{

	@Override
	public WebDriver createDriver() {
		
		String chromeDriverPath = System.getProperty("user.dir")+File.separator+"driver"+File.separator+"chromedriver.exe";			
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		return driver;
	}	
}
