package com.demo.util;

import com.demo.pojo.ConfigPojo;
import com.demo.pojo.HttpParameter;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtil {
	
	public Response apiCall(String endPoint, String apiType, String paramType, HttpParameter httpParameter) {
		
		Response response = null;
		RestAssured.baseURI = ConfigPojo.baseURI;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		
		if(paramType.equalsIgnoreCase("query")) {
			request.queryParams(httpParameter.getQueryParam());
		}else if(paramType.equalsIgnoreCase("body")) {
			request.body(httpParameter.getBodyParam());
		}else if(paramType.equalsIgnoreCase("path")) {
			request.pathParams(httpParameter.getPathParam());
		}
		
		switch(apiType.toUpperCase()) {
			case "GET":
				response = request.request(Method.GET, endPoint);
				break;
			case "POST":
				response = request.request(Method.POST, endPoint);
				break;
			case "PUT":
				response = request.request(Method.PUT, endPoint);
				break;
			case "DELETE":
				response = request.request(Method.DELETE, endPoint);
				break;
		}
		response.then().log().all();
		return response;		
	}
}
