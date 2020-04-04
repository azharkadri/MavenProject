package com.trubees.qa;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TruebeesUnitTesting2 {
	
	@Test
	@Description("addition")
	@Severity(SeverityLevel.NORMAL)
	@Story("addition of two numbers")
	public void add() {
		int a=10, b=20;
		Assert.assertEquals(30, a+b);
		Reporter.log("add test script passed", true);
	}
	
	
	@Test
	@Description("subtraction")
	@Severity(SeverityLevel.NORMAL)
	@Story("subtraction of two number")
	public void sub() {
		int a=10, b=20;
		Assert.assertEquals(10, b-a);
		Reporter.log("sub test script passed", true);
	}
	
	@Test
	@Description("multiplication")
	@Severity(SeverityLevel.NORMAL)
	@Story("multiplication of two numbers")
	public void mul() {
		int a=10, b=20;
		Assert.assertEquals(200, a*b);
		Reporter.log("mul test script passed", true);
	}
	
	@Test
	@Description("division")
	@Severity(SeverityLevel.NORMAL)
	@Story("division of two number")
	public void div() {
		int a=10, b=20;
		Assert.assertEquals(2, b/a);
		Reporter.log("div test script passed", true);
	}

}
