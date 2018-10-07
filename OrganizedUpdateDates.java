package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class OrganizedUpdateDates extends Testsh {
    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
    }

    @Test
    public void UpdateDates() throws InterruptedException {
      Thread.sleep(2000L);
      driver.get(test1+"organized/trip/madrid-the-heart-of-spain-704/?itineraryid=704&departureid=25234&Startdate=06.01.2019&capacity.adults=2&capacity.children=0&capacity.infants=0");
      Thread.sleep(2000L);
       driver.manage().window().maximize();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("(//*[@data-scroll-to='#product_order_details'])[1]")).click();
        Thread.sleep(3000L);
        WebElement otherDate = driver.findElement(By.xpath("(//*[@class='value'])[1]"));
        String otherDate1 ="$"+otherDate.getText();
        Thread.sleep(2000L);//Check if User can change Dates
        WebElement otherDateAfter = driver.findElement(By.xpath("(//*[@class='col-xs-2 padd-large-right payment-title bold'])[1]"));
        String otherDateAfter1 = otherDateAfter.getText();
        Assert.assertEquals(otherDate1, otherDateAfter1);
        Thread.sleep(2000L);
        System.out.println(otherDate1+ " "+ otherDateAfter1);
        driver.findElement(By.xpath("(//*[@class='col-xs-11 padd-large-right'])[3]")).click();
        Thread.sleep(2000L);
        WebElement otherDateAfter2 = driver.findElement(By.xpath("(//*[@class='col-xs-2 padd-large-right payment-title bold'])[3]"));
        String otherDateAfter3 = otherDateAfter2.getText();
        Thread.sleep(2000L);
        WebElement otherDate2 = driver.findElement(By.xpath("(//*[@class='value'])[1]"));
        String otherDate3 ="$"+otherDate2.getText();
        System.out.println(otherDateAfter3+ " "+otherDate3 );
        Assert.assertEquals(otherDate3, otherDateAfter3) ;
        logger.info("Great, Update Dates Pass");
    }



}
