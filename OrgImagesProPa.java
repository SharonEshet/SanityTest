package SanityTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class OrgImagesProPa extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.get(test1+"organized/trip/taiwan/?itineraryid=445&departureid=23786&Startdate=04.12.2018&capacity.adults=2&capacity.children=0&capacity.infants=0");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        //Product Images in Vacation Page########################
        List<WebElement> images = driver.findElements(By.xpath("//*[@class='gallery-item-img ']"));

        Integer images1 =  images.size();
        System.out.println(images1);
        if (images1>=2)
        {
            System.out.println("Great There is Images in Product Org Page!!!!!");
        }
        else
        {
            System.out.print("Bug There is not Images in Product org Page?????");
        }



    }}







