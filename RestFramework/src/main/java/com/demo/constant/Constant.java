package com.demo.constant;

import java.io.File;

public class Constant {

	public static final String configFilePath = System.getProperty("user.dir")+File.separator+"config";
	
	public static final String listUser = "/api/users";
	public static final String createUser = "/api/users";
	public static final String updateUser = "/api/users";
	public static final String deleteUser = "/api/users";
	public static final String getUserDetails = "/api/users";
}
