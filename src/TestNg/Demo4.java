package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo4 {

	
	@Test
	public void mobile1(String urlcomes)
	{
		System.out.println("Mobile1 test cases");
		
	}
	
	@Test
	public void mobileLogIn()
	{
		System.out.println("Mobile1 test cases");
	}
	
	@Test(dataProvider = "getData")
	public void LogOut(String umae,String jj)
	{
		System.out.println("Mobile1 test cases");
		System.out.println(umae);
		System.out.println(jj);
	}
	
	@Parameters({"URL"})
	@Test
	public void web1(String urlcomes)
	{
		System.out.println("Web1 Test case");
		System.out.println(urlcomes);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data =new Object[3][2];
		
		data[0][0] ="trupti";
		data[0][1] ="123";
		
		data[1][0]="snehal";
		data[1][1]="123";
		
		data[2][0]="uiu";
		data[2][1]="58";
		
		return data;
		
	}
	
}
