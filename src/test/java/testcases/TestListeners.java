package testcases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+"Test has started");
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.getscreenshot(driver,result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult rseult) {
		
		System.out.println(rseult.getName()+"Test is passed");
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getName()+" Test is skipped");
	}

}
