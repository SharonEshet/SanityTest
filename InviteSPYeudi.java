package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class InviteSPYeudi extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test6+"searchresults?DestinationCode=63634&EventId=&EventType=0&Performer=&DealType=Event&FromDate=01.05.2018&ToDate=31.05.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        Thread.sleep(3000L);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sportSearchInfo\"]/div[6]/div[1]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"results\"]/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(3000L);
       driver.get(test1+"dealdetails/spain/barcelona/city-park-st-just/clasico-fc-barcelona-vs-real-madrid/?startdate=03.05.2018&starttime=09%3A05%3A00&outboundflightid=58208&enddate=07.05.2018&endtime=14%3A20%3A00&inboundflightid=58209&destinationcode=63634&dealtype=4&sabresupplier=GOGO&hotelid=52368&packageid=22181&vendor=1&searchkey=2_0_0-STD_BB_1%7C&eventid=58256#=&C-3=2");
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"hotel-summery-box-section\"]/div[7]/div[5]/div/div/input")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"deal_page_nav\"]/div/ul/li[5]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"totals_col\"]/div[3]/input")).click();
        Thread.sleep(2000L);
        logger.info("Great Complete Search Results for Sport**");
        Thread.sleep(2000L);
        logger.info("Start Payment#1 for Sport Yeudi**");
        driver.findElement(By.xpath("//*[@id=\"orderer_first_name\"]")).sendKeys("sha");
        Thread.sleep(2000L);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"orderer_last_name\"]")).sendKeys("may");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='Customer_PhoneMobile']")).sendKeys("2749829");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='Customer_MobilePrefix']")).sendKeys("050");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='Customer_Email']")).sendKeys("sha@gmail.com");
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
        BDM1.selectByIndex(8);//*[@id="passanger_first_name_1"]
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
        logger.info("Great Complete PayMent#1 Sport Yeudi***");


     //   driver.close();
        }
    }
