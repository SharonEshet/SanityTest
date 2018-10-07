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


public class PayPV extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();

    }

    @Test
    public void Test2() throws InterruptedException {
        driver.get(test1 +"deals/dealdetails/malta/malta/?startdate=29.01.2019&starttime=06:30:00&outboundflightid=829&enddate=03.02.2019&endtime=00:45:00&inboundflightid=828&destinationcode=55428&dealtype=1&sabresupplier=AV&hotelid=185276636&packageid=-780716461&vendor=3&searchkey=2_0_0-STANDARD%20ROOM_BB_3|");
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Pacakge Invite#########
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button full-width']")).click();
        Thread.sleep(3000L);
        logger.info("Invite Pacakge!!");
        //Client Info##########
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
        Thread.sleep(2000L);//insurance Test######
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance.selectByIndex(2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_0\"]")).sendKeys("025410770");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance1 = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance1.selectByIndex(1);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_1\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
        logger.info("Complete Payment 1!!+Imsurance");
        //ID####
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
        logger.info("Complete ID and Cadit Card!!");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div")).click();
        Thread.sleep(2000L);

        logger.info("Complete Payment 2!!");
        driver.close();

    }
}






