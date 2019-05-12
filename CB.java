package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class CB extends Testsh {

    public CB() {
    }

    @Before
    public void open() throws InterruptedException, FindFailed {
        openChrome();
    }
    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        Search();
        Thread.sleep(1000L);
		Thread.sleep(1000L);
        SearchAgain();
//Sharon

    }

    public void Search() throws InterruptedException, FindFailed {
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
        System.out.print("Complete Radio Buttom");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("מדריד");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']")).click();
        logger.info("Great, found Madrid");
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"deals_fromDate\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[3]/td[5]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[2]/a")).click();
        Thread.sleep(2000L);
        logger.info("Great, found Date");
        //Search###
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();
    }

    public void SearchAgain() throws InterruptedException, FindFailed {


        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Thread.sleep(5000L);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/div/div[1]"));
        String actualValue = element1.getText();

        driver.findElement(By.xpath("//*[@id=\"dealsSearchInfo\"]/div[6]/div[1]/a")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();//SearchAgain
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Thread.sleep(5000L);

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div/div/div[1]"));
        String actualValue2 = element2.getText();
        Assert.assertEquals(actualValue2, actualValue);
        logger.info("Great, Search Again o.k and Same Results");
    }   }

//Scrolling################################################
      /*  WebElement element3 = driver.findElement(By.xpath("//*[@id=\"results\"]/div[3]/div/div[2]/div/div[1]/div/span"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element3);
      */


// driver.close();


