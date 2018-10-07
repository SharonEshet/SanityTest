package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class PageHomeEngineTab extends Testsh {

    public PageHomeEngineTab() {
    }

    @BeforeTest
    public static void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1);//****************************************************************
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }
    @Test
    public void Test1() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"domestic-hotel-search-btn\"]\n")).click();
        Thread.sleep(2000L);
        logger.info("Great, Domestic-search");
        driver.findElement(By.xpath("//*[@id=\"title_Flight\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"btn_search\"]")).click();
        Thread.sleep(2000L);
        logger.info("Great, Flight-search");
        driver.findElement(By.xpath("//*[@id=\"title_Deals\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();
        Thread.sleep(2000L);
        logger.info("Great, Deals-search");
        driver.findElement(By.xpath("//*[@id=\"title_OrganizedTour\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organized-search-btn\"]")).click();
        Thread.sleep(2000L);
        logger.info("Great, Organized-search");
        driver.findElement(By.xpath("//*[@id=\"title_Ski\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"skiSearchForm\"]/div/div/div[3]/div/div/a")).click();
        Thread.sleep(2000L);
        logger.info("Great, Ski-search");
        driver.findElement(By.xpath("//*[@id=\"title_Sports\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"sportSearchForm\"]/div[2]/div/div[3]/div/div/a")).click();
        Thread.sleep(2000L);
        logger.info("Great, Sports-search");
        driver.findElement(By.xpath("//*[@id=\"title_Hotel\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"btn_sumbit\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"title_Cruise\"]/div/a/div[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='title_DomesticHotels']/div/a/div[2]")).click();
       /* driver.findElement(By.xpath("//*[@class='btn-search showResultsCruise']")).click();
        Thread.sleep(2000L);
        logger.info("Great, Cruise-search");
        driver.get(test2)*/;//**************************************************************
        Thread.sleep(2000L);

        //Autoit--> Autocomplite
        try {

            Thread.sleep(5000L);
            Runtime.getRuntime().exec("C:/Engine.exe");
            Thread.sleep(4000L);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("Great, Auto Complete and Complete Job!!!!!");

        Thread.sleep(25000L);
    //    driver.close();


    }
}
