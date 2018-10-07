package SanityTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class IsrVacationImagesProPa extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"domestichotels/hoteldetails/yam-suf-eilat/?hotelareascode=ETH&hotelcode=3884&startdate=27.12.2018&enddate=29.12.2018&totalprice=1174.200&roomskeys=2_0_0-C68_BB_6_|");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);


        //Product Images in Vacation Page########################
        List<WebElement> images = driver.findElements(By.xpath("//*[@class='product-img-item']"));

        Integer images1 =  images.size();
        System.out.println(images1);
        if (images1>2)
        {
            System.out.println("Great There is Images in Product Page!!!!!");
        }
        else
        {
            System.out.print("Bug There is not Images in Product Pag?????");
        }



    }}







