package org.maven.automation.qauto.testscripts;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class JunitAnnotationPrac {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This is First BeforeClass\n");
	}
	/*@BeforeClass
	public static void secondbeforeClass()
	{
		System.out.println("Secondbeforeclass\n");
	}
	@BeforeClass
	public static void secondafterClass()
	{
		System.out.println("Secondafterclass\n");
	}*/
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This is AfterClass");
		
	}
	int count=0;
	@Before
	public void before()
	{ 
		int i=1;
		
		for (;i<5;i++)
		{
			
				count++;
				if(i==4) {
				System.out.println("Before Method is executed"+count+"times");	
	    }
				System.out.println("This is before method");		
		}
		
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
 