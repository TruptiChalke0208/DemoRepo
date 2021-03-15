package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dataDrivenProps {
	
	WebDriver driver;
	@Test
	public void login() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\trupt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\trupt\\eclipse-workspace\\TestNGDemo\\src\\TestNg\\dataDriven.properties");
		
		prop.load(fis);
	//	System.out.println("username"+prop.getProperty("username"));
	//	System.out.println("Password"+prop.getProperty("password"));
		
		if(prop.getProperty("browser").contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
}
	
	
	@BeforeTest
	public void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trupt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
}