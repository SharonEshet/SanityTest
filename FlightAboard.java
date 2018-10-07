package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FlightAboard extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
      openChrome();
 /*    Long loadtime_ms = (Long)((JavascriptExecutor)driver).executeScript(
             "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
     Long loadtime_sec= loadtime_ms/1000;

           System.out.print("sh"+ " " +loadtime_sec);*/
     }

  @Test
  public void Test2() throws InterruptedException, FindFailed {
    Thread.sleep(3000L);
    driver.manage().window().maximize();
    //Dates
    driver.findElement(By.xpath("//*[@data-tab-type='flights']")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[2]/label")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[3]/label")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[4]/label")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[1]/label")).click();
    Thread.sleep(2000L);
    logger.info("Great, complete all radio bottom");
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).clear();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).sendKeys("תל אביב");
    Thread.sleep(2000L);
    Screen h=new Screen();
    h.find("C:\\Images\\Flights\\TLV.png"); //identify pause button
    Thread.sleep(2000L);
    try {
      int click = h.click("C:\\Images\\Flights\\TLV.png");
    } catch (FindFailed findFailed) {
      findFailed.printStackTrace();
    }
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).sendKeys("לונדון");
    Thread.sleep(2000L);
    Screen l=new Screen();
    l.find("C:\\Images\\Flights\\LON.png"); //identify pause button
    Thread.sleep(2000L);
    try {
      int click = l.click("C:\\Images\\Flights\\LON.png");
    } catch (FindFailed findFailed) {
      findFailed.printStackTrace();
    }
    logger.info("Great, Select London");

    driver.findElement(By.xpath("//*[@id=\"round_way_form_section\"]/div/div[2]/div/div/div/div[1]/button")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[5]/td[3]/a")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[2]/td[1]/a")).click();
    Thread.sleep(2000L);
    logger.info("Great, Dates");
    driver.findElement(By.xpath("//*[@id=\"round_way_form_section\"]/div/div[3]/div[2]/div/a")).click();
    logger.info("Great, Complete Search");
    Thread.sleep(2000L);
    driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[1]/div/div/div[2]/div[1]")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@class='button btn-sm btn-block btn-order']")).click();
    Thread.sleep(2000L);
    driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    logger.info("Great, Complete Search");
    //Client Info
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"orderer_first_name\"]")).sendKeys("Test");
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"orderer_last_name\"]")).sendKeys("Test");
    Thread.sleep(2000L);
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Customer_MobilePrefix\"]")));
    dropdown.selectByIndex(2);
    driver.findElement(By.xpath("//*[@id=\"Customer_PhoneMobile\"]")).sendKeys("0522749810");
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"Customer_Email\"]")).sendKeys("Sha@gmail.com");
    Thread.sleep(2000L);
    Select BDY = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Year\"]")));
    BDY.selectByIndex(14);
    Select BDM = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Month\"]")));
    BDM.selectByIndex(4);
    Select BDD = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Day\"]")));
    BDD.selectByIndex(6);
    Thread.sleep(2000L);
   /* driver.findElement(By.xpath("//*[@id=\"passanger_PassportNumber_0\"]")).sendKeys("654889");//Pasport#####
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"passanger_Nationality_0\"]")).sendKeys("UNITED STATES");
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@class='rtl ui-menu-item']")).click();
    Thread.sleep(2000L);*/
    driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
    Thread.sleep(2000L);
   /* driver.findElement(By.xpath("//*[@id=\"passanger_PassportValidDate_0\"]")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@value='2024']")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();*/
    Thread.sleep(1000L);//Insurance####
    driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[3]/div[2]/div[1]/div[1]/div/select")).click();
    Thread.sleep(1000L);
    Select insurance1 = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[3]/div[2]/div[1]/div[1]/div/select")));
    insurance1.selectByIndex(2);//*[@id="booking_form"]/div/div[4]/div/div[1]/div[1]/label
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_0\"]")).sendKeys("058633025");
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
    Thread.sleep(1000L);
    logger.info("Great, Complete Payment#1");
    driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).click();
    Thread.sleep(1000L);
    driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
    logger.info("Great, Complete Payment#2");
    /* driver.close();*/
  }







}
