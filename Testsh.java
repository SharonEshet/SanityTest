package SanityTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Testsh {
    static WebDriver driver;
    static String test1= "http://www.eshet.com/" ;
    static String test2= "http://www.eshet.com/" ;
    static String test3= "https://mvctest1.eshet.com/" ;
    static String test4 = "https://mvcsportest.eshet.com/sport/";
    static String test5 = "https://mvcsportest2.eshet.com/sport/";
    static String test6 = "https://sport.eshet.com/sport/";
    final static Logger logger = LoggerFactory.getLogger("Test:");
    private static final String FILE_NAME = "C:/shaf.xlsx";
    //  public static final String SAMPLE_XLSX_FILE_PATH = "C:/QA/Links.xlsx";
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    public void openChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1);
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }
 /*   public void Pay() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@class='button btn-sm btn-block btn-order'])[1]")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button product-total-order-btn hide-when-changed']")).click();
        Thread.sleep(6000L);
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
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
        Thread.sleep(4000L);//insurance Test######
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
        logger.info("Complete payment1!!+ Insurance");
        //ID####
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
        logger.info("Great!!Complete payment2!!");
        driver.close();


    }*/


    }



