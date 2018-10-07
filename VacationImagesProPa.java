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


public class VacationImagesProPa extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
      openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.get(test1+"deals/dealdetails/spain/barcelona/?startdate=22.11.2018&starttime=16:05:00&outboundflightid=271&enddate=29.11.2018&endtime=19:00:00&inboundflightid=272&destinationcode=63634&dealtype=1&sabresupplier=AK&hotelid=61948009&packageid=1497828200&vendor=3&searchkey=2_0_0-Regular_BB_3|");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
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







