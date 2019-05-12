package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MegaMenuEshetTest extends Testsh{
    @Before
   // public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1);
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();

        Thread.sleep(2000L);
		Thread.sleep(2000L);

        // Click on Mega Menu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[2]")).click();
        Thread.sleep(4000L);
        driver.get(test2);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[3]")).click();
        Thread.sleep(4000L);

        //Check Affordable vacation#####
        //   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/div[2]/div/div[2]/ul/li[1]/a/span")).click();
        driver.get(test2);//**************************************
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[4]")).click();
        Thread.sleep(2000L);
        //   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/div[2]/div/div[2]/ul/li[4]/a/span")).click();
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[5]")).click();
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(2000L);
        //MegaMenu######
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[6]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[7]")).click();
        Thread.sleep(2000L);
        driver.get(test2);//************************************
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[8]")).click();
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[9]")).click();
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[10]")).click();
        Thread.sleep(2000L);
        driver.get(test2);//***************************************
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[1]/a")).click();
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(2000L);
        try {

            Thread.sleep(3000L);
            Runtime.getRuntime().exec("C:/Engine.exe");
            Thread.sleep(4000L);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.get(test2);//***************************************************
        Thread.sleep(25000L);
        driver.close();
    }}
