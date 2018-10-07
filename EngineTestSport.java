package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EngineTestSport extends Testsh  {

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed, AWTException {
        driver.get(test2+"sport");
        Thread.sleep(3000L);
        driver.manage().window().maximize();
        Thread.sleep(3000L);

        //Vacation Package##################################
        driver.findElement(By.xpath("//*[@id=\"deals_product_type\"]/li[1]/label")).click();
        Thread.sleep(3000L);
        String vp;
        for (int i = 1; i <= 3; i++) {
            driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
            Thread.sleep(3000L);
            driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).clear();
            Thread.sleep(3000L);


            if (i == 1) {
                vp= "גרמנ";
            } else if (i == 2) {
                vp = "לונ";

            } else {
                vp = "צרפ";
            }


            driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("" + vp + "");
            Thread.sleep(6000L);
            List<WebElement> vPengine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            System.out.println("Vacation Package Total:" + vPengine1.size());
            Thread.sleep(3000L);
            logger.info("Great, Found Vacation Pacakge");
        }
        //Sport Package##########################################



        String sp;
        driver.findElement(By.xpath("//*[@id=\"deals_product_type\"]/li[4]/label")).click();
        Thread.sleep(3000L);
        for (int i = 1; i <= 3; i++) {

            driver.findElement(By.xpath("//*[@id=\"search_event_input\"]")).click();
            Thread.sleep(3000L);
            driver.findElement(By.xpath("//*[@id=\"search_event_input\"]")).clear();
            Thread.sleep(3000L);
            if (i == 1) {
                sp = "מו";
            } else if (i == 2) {
                sp = "כד";

            } else {
                sp = "כדור";
            }

            Thread.sleep(3000L);
            driver.findElement(By.xpath("//*[@id=\"search_event_input\"]")).sendKeys("" + sp + "");
            Thread.sleep(6000L);
            List<WebElement> sPengine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            System.out.println("Sport Package Total:" + sPengine1.size());
            logger.info("Great, Found Sport Pacakge");
            Thread.sleep(3000L);
        }
        logger.info("Great, Complete the Job");
      /*  Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease(KeyEvent.VK_F12);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_M);
        //--------------------------------------
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_F5);*/
        // driver.close();
    }
}