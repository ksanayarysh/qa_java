package lesson1.grafana;

import lesson1.grafana.listeners.ConsoleSender;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Listeners({ExecutionListener.class})
public class GrafanaTests {

    @BeforeSuite
    public void initLog(){
        ExecutionListener.iMyTestResult = new ConsoleSender();
    }

    public void doSleep() throws InterruptedException {
        sleep((int) (Math.random() * 20000));
    }

    @Test(description = "test1", groups = {"group 1"})
    public void test1() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test2", groups = {"group 1"})
    public void test2() throws InterruptedException {
        assert 1 == 5;
        doSleep();
    }

    @Test(description = "test3", groups = {"group 1"})
    public void test3() throws InterruptedException {
        assert 1 == 5;
        doSleep();
    }

    @Test(description = "test4", groups = {"group 2"})
    public void test4() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test5", groups = {"group 2"})
    public void test5() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test6", groups = {"group 2"})
    public void test6() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test7", groups = {"group 2"})
    public void test7() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test8", groups = {"group 2"})
    public void test8() throws InterruptedException {
        assert 1 == 1;
        doSleep();
    }

    @Test(description = "test9", groups = {"group 2"})
    public void test9() throws InterruptedException {
        assert 1 == 10;
        doSleep();
    }
}
