package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class PackageVacation extends Testsh {

    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
        driver.get(test2+"deals");//******************************************************
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        //Pacakge Vacation
        Thread.sleep(3000L);
        // driver.findElement(By.xpath("//*[@class='tab-wizard-title' and contains(text(),'חבילות נופש')]")).click();
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("אמסטרדם");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[contains(text(),'AMS')]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"deals_fromDate\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[3]/td[6]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[3]/a")).click();
        Thread.sleep(4000L);
        //Serach
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[3]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        //Invite
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button btn-sm btn-block btn-order']")).click();
        Thread.sleep(2000L);
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"hotel-summery-box-section\"]/div[7]/div[5]/div/div/input")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"roomsTotals\"]/div/div[3]/input")).click();
        Thread.sleep(1000L);

        driver.close();

    }

}

