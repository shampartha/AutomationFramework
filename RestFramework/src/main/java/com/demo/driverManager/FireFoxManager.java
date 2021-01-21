package com.demo.driverManager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.demo.uiUtil.DriverManager;

public class FireFoxManager extends DriverManager{

	@Override
	public WebDriver createDriver() {
		
		String geckoDriverPath = System.getProperty("user.dir")+File.separator+"driver"+File.separator+"geckodriver.exe";			
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		return driver;
	}
}
