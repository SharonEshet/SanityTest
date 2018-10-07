package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class CheckFilterPrice extends Testsh{

    @Before
    public  void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"DomesticHotels/SearchResults?DomesticType=DomesticHotels&HotelCode=-1&HotelAreasCode=ETH&StartDate=22.11.2018&EndDate=24.11.2018&HotelRooms%5B0%5D.Adults=2&HotelRooms%5B0%5D.Children=0&HotelRooms%5B0%5D.Infants=0");
        driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

    }

    @Test
    public void Test() throws InterruptedException {
         driver.manage().window().maximize();
      //  Thread.sleep(4000L);
      //  driver.findElement(By.xpath("//*[@id='ZA_CAMP_A_3']")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"page-content-container\"]/div[2]/div[2]/div[2]/div[2]/div/div/input[1]")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"sort_types_container\"]/ul/li[4]/span")).click();
        //Check Filters from Low to High
        List<WebElement> LowPrice = driver.findElements(By.className("priceSortJS"));
        for(int i=1; i<LowPrice.size()-1; i++) {
            String value1 = ((WebElement) LowPrice.get(i)).getText();
            String value2 = ((WebElement) LowPrice.get(i + 1)).getText();
            int valueA = Integer.parseInt(value1);
            int valueB = Integer.parseInt(value2);
            System.out.println("#####");
            if (valueA < valueB) {
                System.out.print("Great Low to High!!");
            } else {
                System.out.print("Bug High to Low???");
            }
        }

        //Check Filters from High to Low
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"page-content-container\"]/div[2]/div[2]/div[2]/div[2]/div/div/input[1]")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"sort_types_container\"]/ul/li[5]/span")).click();
        List<WebElement> HigherPrice = driver.findElements(By.className("priceSortJS"));
        for(int i=1;i<HigherPrice.size()-1; i++) {
        String value3 = ((WebElement)HigherPrice.get(i)).getText();
        String value4 = ((WebElement)HigherPrice.get(i+1)).getText();
        int valueC= Integer.parseInt(value3);
        int valueD = Integer.parseInt(value4);
            System.out.println("#####");
        if (valueC > valueD)
        {
            System.out.println("Great Job High to Lower!!");
        }
        else {
            System.out.print("Bug High to Lower!! ");
        }
   //    driver.close();

    }
}}