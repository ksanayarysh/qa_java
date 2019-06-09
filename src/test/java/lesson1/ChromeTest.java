package lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson1.grafana.ExecutionListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


@Listeners({ExecutionListener.class})
public class ChromeTest {

    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(ChromeTest.class);

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(description = "chrome test", groups = {"web tests"})
    public void test() {
        logger.info("very very beginning");
        logger.info("start");
        driver.get("http://otus.ru");
        logger.info("stop");
        logger.info("very stop");
    }

}