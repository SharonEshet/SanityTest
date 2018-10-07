package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


public class StaticPage extends Testsh{

@Before
    public  void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"deals/dealdetails/spain/barcelona/city-park-st-just/");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        Screen sta=new Screen();
        Thread.sleep(2000L);
        sta.find("C:\\Images\\Static\\StaticPage.png"); //Check Static Page is open#####
        Thread.sleep(2000L);
        try {
            int click = sta.click("C:\\Images\\Static\\StaticPage.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        Screen staAvailabilty=new Screen();
        logger.info("Great, Found Static Package");
        Thread.sleep(2000L);
        staAvailabilty.find("C:\\Images\\Static\\StaticAvailability.png"); //Check Availability#####
        Thread.sleep(2000L);
        try {
            int click = staAvailabilty.click("C:\\Images\\Static\\StaticAvailability.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        logger.info("Great,Static Availability work Great");
        Thread.sleep(2000L);

        Screen staUpdateSearch=new Screen();
        Thread.sleep(2000L);
        staUpdateSearch.find("C:\\Images\\Static\\UpdateSearch.png"); //Check Date Table and Search
        Thread.sleep(2000L);
        try {
            int click = staUpdateSearch.click("C:\\Images\\Static\\UpdateSearch.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        logger.info("Great,Static Update Search work Great!!!!");
        Thread.sleep(2000L);
        Screen staMapInfo=new Screen();
        Thread.sleep(2000L);
        staMapInfo.find("C:\\Images\\Static\\Map.png"); //Check Map##
        Thread.sleep(2000L);
        try {
            int click = staMapInfo.click("C:\\Images\\Static\\Map.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        logger.info("Great,Static Update Map work Great!!!!");
        Thread.sleep(2000L);
       Screen staMapBarca=new Screen();
        Thread.sleep(2000L);
        staMapBarca.find("C:\\Images\\Static\\MapBraca.png"); //Check Atraction work O.K##
        Thread.sleep(2000L);
        try {
            int click = staMapBarca.click("C:\\Images\\Static\\MapBraca.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        logger.info("Great,Static Update Map Baraca work Great!!!!");


      //  driver.close();

    }}


