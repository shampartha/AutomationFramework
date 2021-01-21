package com.demo.constant;

import java.io.File;

public class Constant {

	public final String configFilePath = System.getProperty("user.dir")+File.separator+"config";
	
	public final String listUser = "/api/users";
	public final String createUser = "/api/users";
	public final String updateUser = "/api/users";
	public final String deleteUser = "/api/users";
	public final String getUserDetails = "/api/users";
}
