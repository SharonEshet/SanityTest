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

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class CBDayn extends Testsh{

    public CBDayn() {
    }

    @Before
    public  void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(3000L);
        Search();
        Thread.sleep(1000L);
        SearchAgain();
        Thread.sleep(1000L);
		Thread.sleep(1000L);
		Thread.sleep(1000L);
        Pay();
    }

    public void Search() throws InterruptedException, FindFailed {
        try {
            driver.findElement(By.xpath("//*[@data-tab-type='deals']")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"deals_product_type\"]/li[2]/label")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"deals_product_type\"]/li[3]/label")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"deals_product_type\"]/li[1]/label")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
            Thread.sleep(2000L);
            System.out.println("Complete radio Buttom");
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("MANCHESTER");
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@class='ui-menu-item']")).click();
            logger.info("Great, found Man");
            Thread.sleep(4000L);
            driver.findElement(By.xpath("//*[@id=\"deals_fromDate\"]")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[4]/a")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[2]/td[5]/a")).click();
            Thread.sleep(2000L);
            logger.info("Great, found Date");
            //Search###
            driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();}
        catch (Exception e) {
        driver.get(test1+"dynamicdeals/searchresults?DestinationCode=48596&DealType=Vacation&FromDate=22.10.2018&ToDate=27.10.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");
        }
    }
    public void SearchAgain() throws InterruptedException, FindFailed {
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        Thread.sleep(5000L);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/div/div[1]"));
        String actualValue = element1.getText();

        driver.findElement(By.xpath("//*[@id=\"dealsSearchInfo\"]/div[6]/div[1]/a")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();//SearchAgain
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        Thread.sleep(5000L);

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/div/div[1]"));
        String actualValue2 = element2.getText();
        Assert.assertEquals(actualValue2, actualValue);
        logger.info("Great, Search Again o.k and Same Results Dynamic");
    }
    public void Pay() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@class='button btn-sm btn-block btn-order'])[1]")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button package-order-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button product-total-order-btn hide-when-changed']")).click();
         Thread.sleep(2000L);
         driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        Thread.sleep(2000L);
        //Client Info##########
        driver.findElement(By.xpath("//*[@class=\"form-control like_billions_firstName\"]")).sendKeys("Test");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class=\"form-control like_billions_lastName\"]")).sendKeys("Test");
        Thread.sleep(2000L);
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Customer_MobilePrefix\"]")));
        dropdown.selectByIndex(2);
        driver.findElement(By.xpath("//*[@id=\"Customer_PhoneMobile\"]")).sendKeys("0522749810");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"Customer_Email\"]")).sendKeys("Sha@gmail.com");
        Thread.sleep(2000L);
        Select BDY = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_0__Year\"]")));
        BDY.selectByIndex(14);
        Select BDM = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_0__Month\"]")));
        BDM.selectByIndex(4);
        Select BDD = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_0__Day\"]")));
        BDD.selectByIndex(4);
        Thread.sleep(2000L);
        Select BDY1 = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_1__Year\"]")));
        BDY1.selectByIndex(19);
        Select BDM1 = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_1__Month\"]")));
        BDM1.selectByIndex(8);
        Select BDD1 = new Select(driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_1__Day\"]")));
        BDD1.selectByIndex(24);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_1__FirstName\"]")).sendKeys("David");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ProductItems_0__Passengers_1__LastName\"]")).sendKeys("Elia");
         Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"paymentForm\"]/div[3]/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step1Submitbtn\"]")).click();
        logger.info("Complete payment1!!+ Insurance");
        //ID####
     /*   Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"IdNumber\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"txtCreditCardNumber")).click();
        Thread.sleep(2000L);*/
        logger.info("Great!!Complete payment2!!");
        driver.close();


    }








}



 /*  WebElement element3 = driver.findElement(By.xpath("//*[@id=\"results\"]/div[3]/div/div[2]/div/div[1]/div/span"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element3);
      */


// driver.close();

