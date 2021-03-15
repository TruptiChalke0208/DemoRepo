package TestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class dlistener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("success");
	}	
}
