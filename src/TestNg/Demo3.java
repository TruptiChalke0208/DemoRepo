package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo3 {

	@Parameters({"URL","Key"})
	
	@Test
	public void mobileTestCase(String url,String key)
	{
		System.out.println("Mobile test cases");
		System.out.println(url);
		System.out.println(key);
	}

	@Test(groups= {"smoke"})
	public void MMMTestCase()
	{
		System.out.println("Mobile test cases");
	}
	
	@Test(groups= {"smoke"})
	public void huhuTestCase()
	{
		System.out.println("Mobile test cases");
	}
	
	@BeforeTest
	public void webTestCase()
	{
		System.out.println("Web Test case");
	}
	
	@AfterTest
	public void desktoptestCase()
	{
		System.out.println("desktop Test case");
	}
	
	@BeforeMethod
	public void desktopBefore()
	{
		System.out.println("Before");
	}
	
	@AfterMethod
	public void desktopAfter()
	{
		System.out.println("After");
	}

}
