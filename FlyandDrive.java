package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FlyandDrive extends Testsh {

    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
        driver.get(test2+"deals");//******************************************************
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        //Pacakge Vacation
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id='deals_product_type']/li[2]/label")).click();
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//*[@id=\"search_flyDrive_dest_input\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flyDrive_destinations\"]/ul/li[1]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flyDrive_fromDate\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[3]/a")).click();
        Thread.sleep(4000L);
        //Serach
        driver.findElement(By.xpath("//*[@id=\"flyDriveSearchForm\"]/div/div/div/div[3]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        //Invite
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button btn-sm btn-block btn-order']")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"hotel-summery-box-section\"]/div[7]/div[5]/div/div/input")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"totals_col\"]/div[3]/input")).click();
        Thread.sleep(1000L);
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
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance.selectByIndex(2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_0\"]")).sendKeys("025410770");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance1 = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance1.selectByIndex(1);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_1\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
        logger.info("Complete Payment 1!!+Insurance");
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
