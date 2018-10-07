package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SearchResults {

    static WebDriver driver;
    static String test1= "http://mvctest1.eshet.com/" ;
    static String test2= "https://mvctest2.eshet.com/" ;
    static String test3= "https://www.eshet-tours.com/" ;
    static String test4= "https://www.eshet.com/";
    static String test5= "https://test2.eshet-tours.com/" ;
    final static Logger logger = LoggerFactory.getLogger("Test:");
    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1);
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
        Thread.sleep(2000L);






        /*
        Thread.sleep(2000L);
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
        Thread.sleep(2000L);
        List<WebElement> vacation1 = driver.findElements(By.xpath("//*[@class='col-sm-4 col-result-img']"));
        Integer vacation2 =  vacation1.size();
        System.out.println(vacation2);
        if (vacation2>4)
        {
            System.out.println("Great Search Results- Barca Vacations!!!!!");
        }
        else
        {
            System.out.print("Bug, There is no any Results- Barca Vacations!!!!!");
        }
        Thread.sleep(2000L);
        logger.info("Great, Found Barca Vacations");
*/

        //driver.close();

    }}
