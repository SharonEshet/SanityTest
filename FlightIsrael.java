package SanityTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FlightIsrael extends Testsh {

   @Before
    public void openwindow() throws InterruptedException {
      openChrome();
    }

    @Test
    public void TestOneDate() throws InterruptedException {
     Thread.sleep(3000L);
        driver.manage().window().maximize();
        //Dates
        driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[1]/label")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[2]/label")).click();
        Thread.sleep(2000L);
        logger.info("Found flights Israel");
        driver.findElement(By.xpath("//*[@id=\"domesticFlightFrom\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"from_destinations\"]/ul/li[5]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"domesticFlightTo\"]")).click();
        Thread.sleep(2000L);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"to_destinations\"]/ul/li[1]")).click();
        Thread.sleep(2000L);
        logger.info("complete destinations");
        driver.findElement(By.xpath("//*[@id=\"flightSearch\"]/div[1]/div[2]/div[1]/div/div/div[1]/button/i")).click();
        Thread.sleep(2000L);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a")).click();
        logger.info("complete Dates");
        driver.findElement(By.xpath("//*[@id=\"domestic-flight-search-btn\"]")).click();
        Thread.sleep(2000L);
        logger.info("complete Search");
        List<WebElement> flights = driver.findElements(By.xpath("//*[@class='row margin-0-all']"));
        Integer sh =  flights.size();
        System.out.println(sh);

        if (sh>=10)
        {
        System.out.print("Graet there is flights in this Site!!!!!");
        }
        else
        {
        System.out.println("Bug No flights!!!!!");

        }
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='results']/div[1]/div[1]/div/div/div[2]/div/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div[1]/div/div/div[2]/div/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='page-content-container']/div[2]/div[5]/div/div/div/div/div/div/div[2]/div")).click();
        Thread.sleep(2000L);
        logger.info("Complets,Invites");
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
        BDD.selectByIndex(4);
        Thread.sleep(2000L);
        Select BDY1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Year\"]")));
        BDY1.selectByIndex(19);
        Select BDM1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Month\"]")));
        BDM1.selectByIndex(8);
        Select BDD1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Day\"]")));
        BDD1.selectByIndex(24);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_first_name_1\"]")).sendKeys("David");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_last_name_1\"]")).sendKeys("Elia");
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
        logger.info("Complete payment1!!");
        //ID####
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
        logger.info("Great!!Complete payment2!!");
        Reporter.log("Great");
      //  driver.close();
    }
   @Test
   public void TestOtherDate() throws InterruptedException {
      driver.get(test1);
      Thread.sleep(3000L);
      driver.manage().window().maximize();
      //Dates
      driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[1]/label")).click();
      Thread.sleep(4000L);
      driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[2]/label")).click();
      Thread.sleep(2000L);
      logger.info("Found flights Israel");
      driver.findElement(By.xpath("//*[@id=\"domesticFlightFrom\"]")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"from_destinations\"]/ul/li[5]")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"domesticFlightTo\"]")).click();
      Thread.sleep(2000L);
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"to_destinations\"]/ul/li[1]")).click();
      Thread.sleep(2000L);
      logger.info("complete destinations");
      driver.findElement(By.xpath("//*[@id=\"flightSearch\"]/div[1]/div[2]/div[1]/div/div/div[1]/button/i")).click();
      Thread.sleep(2000L);
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a")).click();
      logger.info("complete Dates");
      driver.findElement(By.xpath("//*[@id=\"domestic-flight-search-btn\"]")).click();
      Thread.sleep(2000L);
      logger.info("complete Search");
      List<WebElement> flights = driver.findElements(By.xpath("//*[@class='row margin-0-all']"));
      Integer sh =  flights.size();
      System.out.println(sh);

      if (sh>=10)
      {
         System.out.print("Great there is flights in this Site!!!!!");
      }
      else
      {
         System.out.println("Bug No flights!!!!!");

      }
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id='results']/div[1]/div[1]/div/div/div[2]/div/div[2]")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div[1]/div/div/div[2]/div/div[2]")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id='page-content-container']/div[2]/div[5]/div/div/div/div/div/div/div[2]/div")).click();
      Thread.sleep(2000L);
      logger.info("Complets,Invites");
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
      BDD.selectByIndex(4);
      Thread.sleep(2000L);
      Select BDY1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Year\"]")));
      BDY1.selectByIndex(19);
      Select BDM1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Month\"]")));
      BDM1.selectByIndex(8);
      Select BDD1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Day\"]")));
      BDD1.selectByIndex(24);
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"passanger_first_name_1\"]")).sendKeys("David");
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"passanger_last_name_1\"]")).sendKeys("Elia");
      Thread.sleep(4000L);
      driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
      logger.info("Complete payment1!!");
      //ID####
      Thread.sleep(10000L);
      driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
      Thread.sleep(2000L);
      logger.info("Great!!Complete payment2!!");
      Reporter.log("Great");
      //  driver.close();
   }







}
