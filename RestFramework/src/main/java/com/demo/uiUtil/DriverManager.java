package com.demo.uiUtil;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	WebDriver driver = null;
	public abstract WebDriver createDriver();
	
	public void quitDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
        	driver = createDriver();
        }
        return driver;
    }
}
