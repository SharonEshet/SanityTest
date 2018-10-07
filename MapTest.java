package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class MapTest extends Testsh {
     @Before
     public  void openwindow() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
       driver = new ChromeDriver();

    }

    @Test
    public void checkMapZanzibar() throws InterruptedException, FindFailed {
        driver.get(test1+"deals/dealdetails/tanzania/zanzibar/my-blue/");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("(//*[@class='icon-x close-popup'])[4]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@class='package-page-nav-list']/li[5]")).click();
        //zanzibar###############
        Screen zanz1 = new Screen();
        Thread.sleep(500L);
        zanz1.find("C:\\Images\\Test\\MapZanz1.PNG"); //identify pause button
        Thread.sleep(500L);
        try {
            int click = zanz1.click("C:\\Images\\Test\\MapZanz1.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(500L);
        WebElement element1 = driver.findElement(By.xpath("//*[@class='drive-distance']"));
        String actualValue = element1.getText();
        if (actualValue.contains("נסיעה ברכב")) {
            System.out.println("Great, found drive distance");
        } else {
            System.out.println("Bug??, did not found drive distance");

        }
        Thread.sleep(500L);
        driver.navigate().refresh();
        Thread.sleep(500L);
        //  driver.findElement(By.xpath("/html/body/div[3]/div[2]/i")).click();
        for (int i = 1; i <= 2; i++) {
            Thread.sleep(500L);
            Screen zanz2 = new Screen();
            Thread.sleep(500L);
            zanz2.find("C:\\Images\\Test\\MapZanz2.png"); //identify pause button
            Thread.sleep(500L);
            try {
                int click = zanz2.click("C:\\Images\\Test\\MapZanz2.png");
            } catch (FindFailed findFailed) {
                findFailed.printStackTrace();
            }
        }
        Thread.sleep(500L);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='content']"));
        String actualValue2 = element2.getText();
        String actualValue3 = actualValue2.substring(0, 22);
        Assert.assertEquals("במרכזו של הפארק הלאומי", actualValue3);
        Thread.sleep(500L);
        logger.info("Great!!complete Zanaibar Map");
        checkMapBarca();
     }
     public void checkMapBarca() throws InterruptedException, FindFailed {
        driver.get(test1+"deals/dealdetails/spain/barcelona/rialto/?startdate=27.01.2019&starttime=16:00:00&outboundflightid=271&enddate=31.01.2019&endtime=19:00:00&inboundflightid=272&destinationcode=63634&dealtype=1&sabresupplier=AK&hotelid=52534&packageid=1497828200&vendor=3&searchkey=2_0_0-Regular_BB_3|");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@class='package-page-nav-list']/li[5]")).click();
        Thread.sleep(1000L);
        driver.navigate().refresh();
        Thread.sleep(1000L);
        Screen barca1=new Screen();
        Thread.sleep(1000L);
        barca1.find("C:\\Images\\Test\\Goel.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = barca1.click("C:\\Images\\Test\\Goel.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        WebElement element3 = driver.findElement(By.xpath("//*[@class='content']"));
        Thread.sleep(1000L);
        String actualValue4 = element3.getText();
        String actualValue5=actualValue4.substring(0,18);
        Assert.assertEquals("עוד מונומנט שתוכנן" , actualValue5);
        Thread.sleep(1000L);
        driver.navigate().refresh();
        Thread.sleep(1000L);
        Screen barca2=new Screen();
        Thread.sleep(1000L);
        barca2.find("C:\\Images\\Test\\Tibi.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = barca2.click("C:\\Images\\Test\\Tibi.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        WebElement element4 = driver.findElement(By.xpath("//*[@class='content']"));
        String actualValue6 = element4.getText();
        String actualValue7=actualValue6.substring(0,27);
        Assert.assertEquals("על הגבעה המשקיפה על ברצלונה" , actualValue7);
        driver.navigate().refresh();
        Thread.sleep(1000L);
        Screen barca3=new Screen();
        Thread.sleep(1000L);
        barca3.find("C:\\Images\\Test\\Barca.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = barca3.click("C:\\Images\\Test\\Barca.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        driver.navigate().refresh();
        Thread.sleep(1000L);
        Screen barca6=new Screen();
        Thread.sleep(1000L);
        barca6.find("C:\\Images\\Test\\BarcaBigMap.png");
        Thread.sleep(1000L);
        try {
            int click = barca6.click("C:\\Images\\Test\\BarcaBigMap.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        driver.navigate().refresh();
        Thread.sleep(1000L);
        Screen barca4=new Screen();
        Thread.sleep(1000L);
        barca4.find("C:\\Images\\Test\\TibiFlag.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = barca4.click("C:\\Images\\Test\\TibiFlag.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        WebElement element8 = driver.findElement(By.xpath("//*[@class='content']"));
        String actualValue8 = element8.getText();
        String actualValue9=actualValue8.substring(0,27);
        Assert.assertEquals("על הגבעה המשקיפה על ברצלונה" , actualValue9);
        Thread.sleep(1000L);
        Screen barca5=new Screen();
        Thread.sleep(500L);
        barca5.find("C:\\Images\\Test\\ReadMore.png");
        Thread.sleep(1000L);
        try {
            int click = barca5.click("C:\\Images\\Test\\ReadMore.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        //driver.close();

    }}


