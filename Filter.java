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


public class Filter extends Testsh {

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"/DomesticHotels/SearchResults?DomesticType=DomesticHotels&HotelCode=4039&HotelAreasCode=ETH&StartDate=28.02.2018&EndDate=03.03.2018&HotelRooms%5B0%5D.Adults=2&HotelRooms%5B0%5D.Children=0&HotelRooms%5B0%5D.Infants=0");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed{
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/ul/li[2]/ul/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement BaseHosp= driver.findElement(By.xpath("//*[@class='content-size' and contains(text(),'לינה בלבד')]"));
        String actualValue = BaseHosp.getText();
        Assert.assertEquals("לינה בלבד", actualValue);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/ul/li[2]/ul/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/ul/li[2]/ul/li[4]/div[1]/label/span")).click();
        WebElement Pencion= driver.findElement(By.xpath("//*[@id=\"results\"]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/a/div[1]/div[1]/span[1]"));// Pencion****
        String actualValue1 = Pencion.getText();
        Assert.assertEquals("לינה וא.בוקר", actualValue1);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/ul/li[2]/ul/li[4]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement element1= driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/ul/li[6]/ul/li[1]/div[1]/div"));
        String actualValue2 = element1.getText();
         Assert.assertEquals("רשת בית מלון:", actualValue2);

        Thread.sleep(2000L);//Rank
        driver.findElement(By.xpath("//*[@class='Form-label-text ' and contains(text(),'ישרוטל')]")).click();
        Thread.sleep(2000L);
        WebElement HotelsL= driver.findElement(By.xpath("//*[@id=\"results\"]/div[1]/div/div[2]/div/div[2]/div[1]/div/h3/a"));
        String actualValue3 = HotelsL.getText();
        Assert.assertEquals("ישרוטל המלך שלמה אילת", actualValue3);
        Thread.sleep(2000L);
        driver.close();

    }
}