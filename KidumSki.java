package SanityTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class KidumSki {

    static WebDriver driver;
    static String test1= "http://mvctest1.eshet.com/" ;
    static String test2= "http://mvctest2.eshet.com" ;
    static String test3= "https://www.eshet.com/" ;
    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test3+"ski/");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        List<WebElement> LowPrice = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh =  LowPrice.size();
        System.out.println(sh);
        if (sh>18)
        {
            System.out.println("Great Kidum!!!!!");
        }
        else
        {
            System.out.print("Bug!!!!!");
        }

        driver.close();

    }
}