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
        driver.manage().window().maximize();
        Thread.sleep(2000L)
        CheckAsseration();
    }

    public void CheckAsseration() throws InterruptedException, FindFailed {
        // Check Headlines
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[1]/div/div/ul/li[4]/div[1]"));
        String actualValue = element1.getText();
        Assert.assertEquals("חופשה בארץ", actualValue);
        //Details to back- sh
        WebElement element3 = driver.findElement(By.xpath("//*[@class='contact-us-greet']"));
        String actualValue2 = element3.getText();
        Assert.assertEquals("הנכם מוזמנים לפנות לנציגי המכירות והשירות בכל נושא ואנו נחזור אלכם בהקדם", actualValue2);
        WebElement element4 = driver.findElement(By.xpath("//*[@class='abroad-phone-text two-phones-number']"));
        String actualValue3 = element4.getText();
        //Check Phone Number
        Assert.assertEquals("03-7771111", actualValue3);
        WebElement element5=driver.findElement(By.xpath("//*[@class='domestic-phone-text two-phones-number']"));
        String actualValue4 = element5.getText();
        Assert.assertEquals("03-7771177", actualValue4);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/article/div[1]/img")).click();
        Thread.sleep(2000L);
        driver.close();
    }}



