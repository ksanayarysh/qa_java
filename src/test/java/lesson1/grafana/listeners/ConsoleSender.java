package lesson1.grafana.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import yandex.market.YandexTest;

public class ConsoleSender implements IMyTestResult {
    private static final Logger logger = LoggerFactory.getLogger(YandexTest.class);

    public void sendTestMethodStatus(ITestResult iTestResult, String status) {
        logger.info(iTestResult.getName() + " "  + status);
    }

    public void sendTestClassStatus(ITestContext iTestContext) {
        logger.info(iTestContext.getFailedTests().toString());
    }
}
