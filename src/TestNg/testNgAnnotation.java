package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgAnnotation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Parameters({"URL"})
	@Test
	public void tTest(String urlComes) {
		System.out.println("Test");
		System.out.println(urlComes);
	}
	
	@Test
	public void aTest2() {
		System.out.println("Test2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Methode");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Methode");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afteerClass() {
		System.out.println("after Class");
	}
}
