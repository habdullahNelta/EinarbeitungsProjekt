package HelfMethoden;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
     //   ITestListener.super.onTestStart(result);
        System.out.println("on Test Start: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ITestListener.super.onTestSuccess(result);
        System.out.println("on Test Success: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
       // ITestListener.super.onTestFailure(result);
        System.out.println("on Test Failure: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println("on Test Failed But Within Success Percentage: "+result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
       // ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("on Test Failed With Timeout: "+result.getName());
    }

   @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("on Start: "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("on Finish: "+context.getName());
    }



}
