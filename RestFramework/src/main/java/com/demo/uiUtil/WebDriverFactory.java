package com.demo.uiUtil;

import com.demo.driverManager.ChromeManager;
import com.demo.driverManager.FireFoxManager;

public class WebDriverFactory {

	public static DriverManager getManager(String type) {

        DriverManager driverManager = null;

        switch (type.toUpperCase()) {
            case "CHROME":
                driverManager = new ChromeManager();
                break;
            case "FIREFOX":
                driverManager = new FireFoxManager();
                break;
            default:
                System.out.println("Please select FireFox or Chrome browser.");
                break;
        }
        return driverManager;
    }
}
