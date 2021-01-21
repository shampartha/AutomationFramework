package com.demo.test;

import org.databene.benerator.anno.Source;
import org.testng.annotations.Test;

import com.demo.base.Base;
import com.demo.util.Configuration;

public class TestClass extends Base{

	@Test(dataProvider = "feeder")
	@Source("input\\testInput.csv")
	public void testFunc1(String testCaseID, String testCaseName) {
		
		System.out.println(Configuration.getInstance());
	}
}
