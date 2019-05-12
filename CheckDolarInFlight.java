package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class CheckDolarInFlight extends Testsh {
    @Before
    public void openwindow() throws InterruptedException, FindFailed {
        openChrome();
        }

    @Test
    public void test4() throws InterruptedException, FindFailed {
        driver.get(test1+"internationalflights/searchresults/?page=1&fClass=Y&maxWaitingTime=0&stopsNumber&ways=2&origin=TLV&destination=TSR&from1=&to1=&from2=&to2=&from3=&from=18/10/2018&fromHours=כל+השעות&to=25/10/2018&toHours=כל+השעות&firstDate=18/10/2018&firstDateTime=כל+השעות&secondDate=&thirdDate=25/10/2018&thirdDateTime=כל+השעות&adult=2&child=0&baby=0&young=0&old=0&amount=393&airline=W6&directFlights=True&calendarOnly=false&isPromotion=5");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"results\"]/div/div/div[2]/div[2]/span"));
        String actualValue = element1.getText();
        Assert.assertEquals("$", actualValue);
        System.out.print("Great!!"+ " " + actualValue);
         Thread.sleep(2000L);
     //   driver.close();

    }}


