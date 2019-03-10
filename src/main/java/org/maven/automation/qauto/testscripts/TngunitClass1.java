package org.maven.automation.qauto.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TngunitClass1 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is TestNGClass1, Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This is TestNGClass1 AfterClass");

	}

	@BeforeMethod
	public void before() {

		System.out.println("This is before method");

	}

	@AfterMethod
	public void after() {
		System.out.println("After method is executed");
	}

	@Test (groups = {"Smoke"})// @Test is annotation which is mandatory to execute test method
	public void t1() {
		System.out.println("Hello t1");
	}

	@Test(groups = {"sanity"})
	public void t2() {
		System.out.println("hello t2");
		Assert.assertEquals(true, false);
		
	}

	@Test(groups= {"Smoke"})
	public void t3() {
		System.out.println("Hello t3");
	}

	//@Test(groups= {"sanity"},retryAnalyzer=Retry.class)
	public void t4() {
		System.out.println("Hello t4");
		Assert.assertEquals(true, false);
	}

	@Test(groups={"Regression","sanity"})
	public void t5() {
		System.out.println("Hello t5");
	}

}
