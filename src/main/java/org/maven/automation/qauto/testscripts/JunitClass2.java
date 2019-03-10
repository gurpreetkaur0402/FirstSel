package org.maven.automation.qauto.testscripts;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class JunitClass2 {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This is JunitClass2, Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This is JunitClass2,AfterClass");
		
	}
	
	@Before
	public void before()
	{ 
	
				System.out.println("This is before method");		
	
		
	}
	@After
	public void after()
	{
	System.out.println("After method is executed");	
	}
	
	@Test //@Test is annotation which is mandatory to execute test method
	public void t1()
	{
		System.out.println("Hello t1");
	}
	
	@Test
	
	public void t2()
	{
		System.out.println("hello t2");
	
	}
	
	@Test
	public void t3()
	{
	 System.out.println("Hello t3");
	}
	
	@Test
	public void t4()
	{
	System.out.println("Hello t4");	
	}	
	
	@Test
	public void t5()
	{
		System.out.println("Hello t5");
	}
	
}

