package SanityTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class PaySki {
    final static Logger logger = LoggerFactory.getLogger("Test:");
    static WebDriver driver;
    static String test1= "http://mvctest1.eshet.com/" ;
    static String test2= "http://www.eshet.com" ;
    static String test3= "https://www.eshet-tours.com/" ;
    static String test4= "https://www.eshet.com/";
    static String test5= "https://test2.eshet-tours.com/" ;
    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test2);//**************************************************************************************
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    }


    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        //Pacakge Invite#########
         Thread.sleep(4000L);
         driver.findElement(By.xpath("//*[@data-tab-type='ski']")).click();
         Thread.sleep(2000L);
        driver.findElement(By.xpath("(//*[@class='form-control clickable selected-text input-with-label fixed-padding'])[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@data-iata-code='43278']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"skiSearchForm\"]/div/div/div[2]/div[1]/div/div/div[1]/button/i")).click();//Date**********
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[1]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[1]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ski_capacity\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ski_passengers\"]/div[3]/div/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"skiSearchForm\"]/div/div/div[3]/div/div/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("(//*[@class='button btn-sm btn-block btn-order'])[1]")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button full-width']")).click();
        logger.error("Ski Payment!!!!!");
        //Client Info##########
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

        //ID####
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
        // driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div")).click();
        Thread.sleep(2000L);
        driver.close();


    }}