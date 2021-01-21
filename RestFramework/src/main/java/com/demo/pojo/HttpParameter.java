package com.demo.pojo;

import java.util.HashMap;

public class HttpParameter {

	private HashMap<String, Object> queryParam = null;
	private String bodyParam = null;
	private HashMap<String, Object> pathParam = null;	

	public HashMap<String, Object> getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(HashMap<String, Object> queryParam) {
		this.queryParam = queryParam;
	}

	public String getBodyParam() {
		return bodyParam;
	}

	public void setBodyParam(String bodyParam) {
		this.bodyParam = bodyParam;
	}

	public HashMap<String, Object> getPathParam() {
		return pathParam;
	}

	public void setPathParam(HashMap<String, Object> pathParam) {
		this.pathParam = pathParam;
	}
	
}
