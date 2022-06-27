package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends BaseTest implements ITestListener  {
	public void onTestStart(ITestResult result) {
	System.out.println(result.getName() +"test has started");
	}
    public void onTestFailure(ITestResult result) {
    	System.out.println(result.getName() +" test has fail");
	   }
   public void onTestSuccess(ITestResult result) {
	   System.out.println(result.getName()+ "test success");
      }
   public void onTestSkipped(ITestResult result) {
	   System.out.println(result.getName()+ "test skipped");
      }
   
}
