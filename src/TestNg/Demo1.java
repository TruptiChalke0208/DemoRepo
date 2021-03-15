package TestNg;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Demo1 {

	@Test(groups= {"smoke"})
	public void firstTestCase()
	{
		System.out.println("Hi.. do it");
	}
	
	@AfterSuite
	public void secondTestCase()
	{
		System.out.println("For each test case need to create different function");
	}
}
