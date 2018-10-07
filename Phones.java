package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Phones extends Testsh{

    @Before
    public void openwindow () throws InterruptedException {
       openChrome();
    }

    @Test
    public void Test1() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000L);

       // Check main#####

        driver.get(test1);
        WebElement elementmain1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue21 = elementmain1.getText();
        Assert.assertEquals("03-7771177", actualValue21);
        WebElement elementmain2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue22 = elementmain2.getText();
        Assert.assertEquals("03-7771111", actualValue22);
        logger.info("Great, Main O.K");
        // Check GPCC#####

        driver.get(test1+"/?utm_source=gppc");//*************************
        WebElement elementGPCC1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue1 = elementGPCC1.getText();
        Assert.assertEquals("03-7771004", actualValue1);
        WebElement elementGPCC2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue2 = elementGPCC2.getText();
        Assert.assertEquals("03-7771008", actualValue2);
        logger.info("Great, gppc O.K");
        // Check FaceBook#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=facebook");//***********************
        WebElement elementfacebook1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue3 = elementfacebook1.getText();
        Assert.assertEquals("03-7771005", actualValue3);
        WebElement elementfacebook2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue4 = elementfacebook2.getText();
        Assert.assertEquals("03-7771009", actualValue4);
        logger.info("Great, facebook O.K");
        // Check Go#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=go");//*************************
        WebElement elementgo1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue5 = elementgo1.getText();
        Assert.assertEquals("03-7771032", actualValue5);
        WebElement elementgo2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue6 = elementgo2.getText();
        Assert.assertEquals("03-7771039", actualValue6);
        logger.info("Great, Go O.K");
        // Check from-to#####

       Thread.sleep(2000L);
       driver.get(test1+"/?utm_source=from-to");//*********************Bug
        WebElement elementfromto1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue7 = elementfromto1.getText();
        Assert.assertEquals("03-7771674", actualValue7);
        WebElement elementfromto2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue8 = elementfromto2.getText();
        Assert.assertEquals("03-7771675", actualValue8);
        logger.info("Great, from- to O.K");
        // Check link4u#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=link4u");//***********************
        WebElement elementlink4u1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue9 = elementlink4u1.getText();
        Assert.assertEquals("03-7771676", actualValue9);
        WebElement elementlink4u2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue10 = elementlink4u2.getText();
        Assert.assertEquals("03-7771677", actualValue10);
        logger.info("Great, link-4u O.K");

       // Check sekindo#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=sekindo");//************************
        WebElement elementsekindo1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue11 = elementsekindo1.getText();
        Assert.assertEquals("03-7771678", actualValue11);
        WebElement elementsekindo2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue12 = elementsekindo2.getText();
        Assert.assertEquals("03-7771679", actualValue12);
        logger.info("Great, sekindo O.K");
         // Check netext#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=netex");//***************************
        WebElement elementnetex1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue13 = elementnetex1 .getText();
        Assert.assertEquals("03-7771647", actualValue13);
        WebElement elementnetex2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue14 = elementnetex2.getText();
        Assert.assertEquals("03-7771648", actualValue14);
        logger.info("Great, netex O.K");
        // Check start#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=start");//**************************
        WebElement elementstart1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue15 = elementstart1 .getText();
        Assert.assertEquals("03-7771645", actualValue15);
        WebElement elementstart2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue16 = elementstart2.getText();
        Assert.assertEquals("03-7771646", actualValue16);
        logger.info("Great, start O.K");

       // Check travelist#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=travelist");//*******************************
        WebElement elementtravelist1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue17 = elementtravelist1 .getText();
        Assert.assertEquals("03-7771643", actualValue17);
        WebElement elementtravelist2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue18 = elementtravelist2.getText();
        Assert.assertEquals("03-7771644", actualValue18);
        logger.info("Great, travelist O.K");

// Check trivago#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=trivago");//*******************************
        WebElement elementtrivago1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue19 = elementtrivago1 .getText();
        Assert.assertEquals("03-7771033", actualValue19);
        WebElement elementtrivago2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue20 = elementtrivago2.getText();
        Assert.assertEquals("03-7771037", actualValue20);
        logger.info("Great,trivago O.K");
        // Check kafe#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=kafe");//*********************************
        WebElement elementkafe1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue23 = elementkafe1 .getText();
        Assert.assertEquals("03-7771668", actualValue23);
        WebElement elementkafe2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue24 = elementkafe2.getText();
        Assert.assertEquals("03-7771669", actualValue24);

        // Check uzit#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=uzit");//*********************************
        WebElement elementuzit1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue25 = elementuzit1 .getText();
        Assert.assertEquals("03-7771670", actualValue25);
        WebElement elementuzit2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue26 = elementuzit2.getText();
        Assert.assertEquals("03-7771671", actualValue26);

        // Check 2net#####

        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=2net");//************************************
        WebElement element2net1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue27 = element2net1 .getText();
        Assert.assertEquals("03-7771672", actualValue27);
        WebElement element2net2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue28 = element2net2.getText();
        Assert.assertEquals("03-7771673", actualValue28);
        logger.info("Great, 2net O.K");
        // Check  eshet_nl
        Thread.sleep(2000L);
        driver.get(test1+"/?utm_source=eshet_nl");//***********************************
        WebElement elementeshet_nl1 = driver.findElement(By.xpath("//*[@class='domestic-phone-text']"));
        String actualValue29 = elementeshet_nl1 .getText();
        Assert.assertEquals("03-7771641", actualValue29);
        WebElement elementeshet_nl2 = driver.findElement(By.xpath("//*[@class='abroad-phone-text']"));
        String actualValue30 = elementeshet_nl2.getText();
        Assert.assertEquals("03-7771642", actualValue30);
        logger.info("Great, eshet_nl O.K");

        driver.close();


    }

}
