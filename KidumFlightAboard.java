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


public class KidumFlightAboard extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"/flights/?_ga=2.35271592.803330349.1516519376-468701589.1514120404&_gac=1.79653606.1514285875.Cj0KCQiAg4jSBRCsARIsAB9ooavhTC6qA5JjfNj0DwjAequE3OYWaNfiGILYib1XmHiHZlJvzVu7F74aAqSiEALw_wcB&originsource=go");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id='ZA_CAMP_A_3']")).click();
        Thread.sleep(4000L);

        List<WebElement> LowPrice = driver.findElements(By.xpath("//*[@class='post']"));

        Integer sh =  LowPrice.size();
        System.out.println(sh);
        if (sh>3)
        {
            System.out.println("Great Kidum!!!!!");
        }
        else
        {
            System.out.print("Bug, not enough Kidum!!!!!");
        }

      driver.close();

    }
}