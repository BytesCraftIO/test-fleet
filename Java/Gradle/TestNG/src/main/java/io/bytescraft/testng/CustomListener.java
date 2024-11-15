package io.bytescraft.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class CustomListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("CustomListeners: onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("CustomListeners: onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("CustomListeners: onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("CustomListeners: onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("CustomListeners: onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("CustomListeners: onTestFailedWithTimeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("CustomListeners: onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("CustomListeners: onFinish");
    }
}

