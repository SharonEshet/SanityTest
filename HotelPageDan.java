package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HotelPageDan extends Testsh {

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
      driver.get(test1+"domestichotels/hoteldetails/dan-panorama-eilat");
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        //   driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/i")).click();
        Thread.sleep(2000L);
        List<WebElement> infoHotel = driver.findElements(By.className("package-page-nav-list"));
        for(WebElement e : infoHotel) {
            // System.out.println(e.getText());
            Assert.assertEquals("אודות המלון חדרים חשוב לדעת חוות דעת מפה", e.getText());
        }

        //Hotel Info#########

        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[2]/a")).click();//Room
      /*  WebElement room = driver.findElement(By.xpath("//*[@id=\"product_order_details\"]/div[1]/h2"));
        String actualValue = room.getText();
        Thread.sleep(2000L);
        Assert.assertEquals("זמינות חדרים", actualValue);          */
        driver.findElement(By.xpath("//*[@id=\"product_order_details\"]/div[3]/div[3]"));
        driver.findElement(By.xpath("//*[@id=\"product_order_details\"]/div[3]/div[1]"));
        Thread.sleep(2000L);
        logger.info("Room Discription");
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[3]/a")).click();//Important to Know
        Thread.sleep(2000L);
        WebElement know = driver.findElement(By.xpath("//*[@id=\"product_remarks\"]/div[2]/div[1]/div"));
        String actualValue1 = know.getText();
        Assert.assertEquals("קבלת חדרים", actualValue1);
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[5]/a")).click();//map
        //AutoIt--> Map
        Screen s=new Screen();
        Thread.sleep(2000L);
        s.find("C:\\Images\\Map.png"); //identify pause button
        Thread.sleep(2000L);
        try {
            int click = s.click("C:\\Images\\Map.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        logger.info("Play with the Map");

        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[4]/a")).click();//Opinion
        WebElement Opinion = driver.findElement(By.xpath("//*[@id=\"product_yotpo_reviews\"]/div/div/div/div[1]"));
        String actualValue2 = Opinion.getText();
        Thread.sleep(2000L);
        if(actualValue2.contains("לקוחות אשת טורס ששהו במקום הארוח"))
        {
            System.out.println("Great!!Yotpoo");
        }
        else
        {
            System.out.println("Bug??Yotpoo");
        }
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[1]/a")).click();//hotel info
        Thread.sleep(2000L);
        //AutoIt--> Hotel Opinion

      /*No working in Test!!!  try {************************************************************************************

            Thread.sleep(3000L);
            Runtime.getRuntime().exec("C:/Opinion.exe");
            Thread.sleep(4000L);
        } catch (IOException e) {
            e.printStackTrace();
        }****************************************************************************************************************/

        logger.info("Customer Opninion");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[4]/a")).click();//Opinion
        Screen o=new Screen();
        Thread.sleep(2000L);
        o.find("C:\\Images\\CustomerOpninion.png"); //identify Customer Opninion
        Thread.sleep(2000L);
        try {
            int click = o.click("C:\\Images\\CustomerOpninion.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[3]/div/div/ul/li[1]/a")).click();//Hotel Info
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='tour-description-container']/div/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();//Hotel Facility
        Thread.sleep(2000L);
        //Facility**************************
        Screen h=new Screen();
        h.find("C:\\Images\\HotelFacility.png"); //identify pause button
        Thread.sleep(2000L);
        try {
            int click = h.click("C:\\Images\\HotelFacility.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        logger.info("Complete Hotel Facility!!");

        Screen inviteEshet=new Screen();
        inviteEshet.find("C:\\Images\\InviteEshet.png"); //identify pause button
        Thread.sleep(2000L);
        try {
            int click = inviteEshet.click("C:\\Images\\InviteEshet.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        logger.info("Complete Invite in Eshet!!");

        //Location*************************
        driver.findElement(By.xpath("//*[@id=\"tour-description-container\"]/div/div[1]/div/div/div[2]/div/ul/li[3]/span")).click();//Hotel Location
        Thread.sleep(2000L);
        //Facility**************************
        Screen loc=new Screen();
        h.find("C:\\Images\\mapLoc.png"); //identify pause button
        Thread.sleep(2000L);
        try {
            int click = loc.click("C:\\Images\\MapLoc.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        logger.info("Complete Hotel Location and Map O.K!!");

        //Breadcrumbs#####
        List<WebElement> bread = driver.findElements(By.className("breadcrumbs--item"));

        String value0 = ((WebElement)bread.get(0)).getText();
        String value1 = ((WebElement)bread.get(1)).getText();
        String value2 = ((WebElement)bread.get(2)).getText();
        String value3 = ((WebElement)bread.get(3)).getText();
        Assert.assertEquals(value0,"דף הבית>");
        Assert.assertEquals(value1,"מלונות בארץ>");
        Assert.assertEquals(value2,"מלונות באילת>");
        Assert.assertEquals(value3,"דן פנורמה אילת");
        logger.info("Great,breadcrumbs--item !!");
        Thread.sleep(6000L);
        // driver.close();

    }
        }


















