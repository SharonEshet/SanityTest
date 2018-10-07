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


public class KidumVacationPackage extends Testsh {


    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"deals");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        List<WebElement> LowPrice = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

             Integer sh =  LowPrice.size();
        System.out.println(sh);
             if (sh>35)
             {
                 System.out.println("Great Kidum!!!!!");
             }
            else
                {
                 System.out.print("Bug!!!!!");
             }
             Thread.sleep(5000L);




    }
}