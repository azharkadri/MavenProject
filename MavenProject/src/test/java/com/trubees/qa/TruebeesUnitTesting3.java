package com.trubees.qa;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TruebeesUnitTesting3 {
	
	@Test
	public void add() {
		int a=10, b=20;
		Assert.assertEquals(30, a+b);
		Reporter.log("add test script passed", true);
	}
	
	@Test
	public void sub() {
		int a=10, b=20;
		Assert.assertEquals(10, b-a);
		Reporter.log("sub test script passed", true);
	}
	
	@Test
	public void mul() {
		int a=10, b=20;
		Assert.assertEquals(200, a*b);
		Reporter.log("mul test script passed", true);
	}
	
	@Test
	public void div() {
		int a=10, b=20;
		Assert.assertEquals(2, b/a);
		Reporter.log("div test script passed", true);
	}

}
