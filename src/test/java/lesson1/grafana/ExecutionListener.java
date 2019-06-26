package lesson1.grafana;

import lesson1.grafana.listeners.ConsoleSender;
import lesson1.grafana.listeners.IMyTestResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionListener implements ITestListener {

    public static IMyTestResult iMyTestResult;

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        this.sendTestMethodStatus(iTestResult, "PASS");
    }

    public void onTestFailure(ITestResult iTestResult) {
        this.sendTestMethodStatus(iTestResult, "FAIL");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        this.sendTestMethodStatus(iTestResult, "SKIPPED");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {
        this.sendTestClassStatus(iTestContext);
    }

    private void sendTestMethodStatus(ITestResult iTestResult, String status) {
        iMyTestResult.sendTestMethodStatus(iTestResult, status);
    }

    private void sendTestClassStatus(ITestContext iTestContext) {
        iMyTestResult.sendTestClassStatus(iTestContext);
    }

}