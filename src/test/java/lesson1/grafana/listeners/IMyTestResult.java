package lesson1.grafana.listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;

public interface IMyTestResult  {
    void sendTestMethodStatus(ITestResult iTestResult, String status);
    void sendTestClassStatus(ITestContext iTestContext);

}
