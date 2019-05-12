package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Sanity_Vacation extends Testsh{

    public Sanity_Vacation() {
    }

  @Before
    public  void openwindow() throws InterruptedException {
       openChrome();
      }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000L);
		Thread.sleep(2000L);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"wizardWrapper\"]/div[2]/div/div[1]/div/ul/li[1]/a/span")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).sendKeys("טבריה");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']")).click();
        Thread.sleep(2000L);
        logger.info("Found טבריה!!");
        //Dates for Vacation
        driver.findElement(By.xpath("//*[@id=\"domestic_hotel_starDate\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[5]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"domestic_hotel_capacity\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"domestic-hotel-search-btn\"]/i")).click();
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//*[@id=\"results\"]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div/a")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button full-width']")).click();
        Thread.sleep(2000L);
        logger.info("Complete select date and start Payment1!!");
        //Client Info-- Payment#1
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

        //Search Date

        Select BDY = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Year\"]")));
        BDY.selectByIndex(14);
        Select BDM = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Month\"]")));
        BDM.selectByIndex(4);
        Select BDD = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Day\"]")));
        BDD.selectByIndex(4);
        logger.info("Complete Client1!!");

        // 1 Room###########

        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//*[@id='customer_id_num']")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
        logger.info("Complete payment2 and Pass!!");
        // driver.close();


    }


}