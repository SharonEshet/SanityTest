package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class VacationISR extends Testsh{

  @Before
    public void openwindow() throws InterruptedException {
      openChrome();
    }
   @Test
    public void Test1() throws InterruptedException {
       driver.get(test1+"domestichotels/");//*********************************************************
       driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[2]/label")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[1]/label")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id='search_domestic_hotel_input']")).clear();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).sendKeys("דן פנורמה אילת");
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@class='ui-menu-item']")).click();
       Thread.sleep(2000L);
       //Dates for Vacation in ISR
       driver.findElement(By.xpath("//*[@id=\"domestic_hotel_starDate\"]")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[5]/a")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/a/span")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"domestic_hotel_capacity\"]")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"domestic-hotel-search-btn\"]")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id='results']/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div/a")).click();
       Thread.sleep(2000L);
       ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(windows.get(1));
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"hotel-summery-box-section\"]/div[5]/div[5]/div/div/input")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id=\"roomsTotals\"]/div[3]/input")).click();
       Thread.sleep(2000L);
       logger.info("Complete Israel Vacations!!");
       driver.close();
   }

}



