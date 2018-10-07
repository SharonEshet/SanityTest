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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EngineTestYeudi extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test6);
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {

        driver.manage().window().maximize();
      //  Thread.sleep(4000L);
       // driver.findElement(By.xpath("//*[@id='ZA_CAMP_A_3']")).click();
        Thread.sleep(4000L);

        //Vacation Package##################################
        driver.findElement(By.xpath("//*[@id=\"sportSearchForm\"]/div/div/div[1]/div/div/label/i")).click();
         Thread.sleep(3000L);
        String vp;
        for (int i = 1; i <= 3; i++) {

            Thread.sleep(3000L);
            driver.findElement(By.xpath("//*[@id='search_event_input']")).clear();
            Thread.sleep(3000L);

            if (i == 1) {
                vp= "ברצ";
            } else if (i == 2) {
                vp = "מדריד";

            } else {
                vp = "סלטה";
            }


            driver.findElement(By.xpath("//*[@id='search_event_input']")).sendKeys("" + vp + "");
            Thread.sleep(6000L);
            List<WebElement> vPengine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            System.out.println("Vacation Package Total:" + vPengine1.size());
            Thread.sleep(3000L);
            logger.info("Great, Found Vacation Pacakge");
        }
        //Sport Package##########################################
        logger.info("Great, Complete the Job");

        driver.close();
    }
}
