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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EngineTest extends Testsh {
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        Thread.sleep(3000L);
        driver.manage().window().maximize();
        Thread.sleep(3000L);
        //Engine Test Vacation Hotel#############################################
        String Sh;
        for (int i=1; i<=3; i++) {
            driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).clear();
            Thread.sleep(3000L);
            if (i==1)
            {
                Sh = "אורכ";}

            else if (i==2)
            {
                Sh = "דן";

            }
            else
            {
                Sh = "פת";

            }
            driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).sendKeys("" + Sh + "");


            Thread.sleep(3000L);
            List<WebElement> engine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            System.out.println("Vacation Israel:" +i+ ":" + " "+ engine1.size());
            Thread.sleep(3000L);

        }
        logger.info("Great, Found Israel Hotels");
        driver.findElement(By.xpath("//*[@id=\"domestic_product_type\"]/li[2]/label")).click();
        Thread.sleep(3000L);

        //Engine Flight Israel#####################################################
        List<WebElement> engine2 = driver.findElements(By.xpath("//*[@class='collapsable-option' and @data-code-iata='ETH']"));
        List<WebElement> engine3 = driver.findElements(By.xpath("//*[@class='collapsable-option' and @data-code-iata='TLV']"));
        List<WebElement> engine4 = driver.findElements(By.xpath("//*[@class='collapsable-option' and @data-code-iata='HFA']"));
        List<WebElement> engine5 = driver.findElements(By.xpath("//*[@class='collapsable-option' and @data-code-iata='SDV']"));
        List<WebElement> engine6 = driver.findElements(By.xpath("//*[@class='collapsable-option' and @data-code-iata='TLV,SDV']"));
        Integer engine7= engine2.size()+engine3.size()+ engine4.size()+engine5.size()+engine6.size();
        if (engine7== 10)
        {
            System.out.println("Great, we are ok with Israel Engine=10!!!!!");

        }
        else {
            System.out.println("Bug, Please check????");
        }
        Thread.sleep(3000L);
        logger.info("Great, Found Flight Israel");

        //Hotel Aboard##################################

        driver.findElement(By.xpath("//*[@data-tab-type='hotels']")).click();
        Thread.sleep(3000L);

        String Sh1;
        for (int i=1; i<=3; i++) {
            driver.findElement(By.xpath("//*[@id='search_hotels_dest_input']")).click();
            Thread.sleep(3000L);
            driver.findElement(By.xpath("//*[@id='search_hotels_dest_input']")).clear();
            Thread.sleep(3000L);

            if (i==1)
            {
                Sh1 = "ברצ";}

            else if (i==2)
            {
                Sh1 = "לונ";

            }
            else {
                Sh1 = "ברלין";
            }

            driver.findElement(By.xpath("//*[@id=\"search_hotels_dest_input\"]")).sendKeys("" + Sh1 + "");

            Thread.sleep(4000L);
            List<WebElement> hAengine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            Thread.sleep(6000L);
            System.out.println("Hotel Aboard Total:" + i+":"+ " " +hAengine1.size());
            Thread.sleep(3000L);
        }
        Thread.sleep(2000L);
        logger.info("Great, Found Aboard Hotels");

        //Vacation Package##################################
        driver.findElement(By.xpath("//*[@data-tab-type='deals']")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).clear();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("בול");
        Thread.sleep(6000L);
        List<WebElement> vPengine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
        System.out.println("Vacation Package Total:"+vPengine1.size());
        Thread.sleep(3000L);
        logger.info("Great, Found Vacation Pacakge");

    }}
