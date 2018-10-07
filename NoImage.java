package SanityTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class NoImage extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1+"/flydrivedeals/");//********************************************************************
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[2]/div[1]/span")).click();
        Thread.sleep(3000L);

        List<WebElement> noImage = driver.findElements(By.xpath("//*[@src='https://www.eshet.com/images/global/white-background.jpg']"));


        Integer sh =  noImage.size();
        System.out.println(sh);
        if (sh>=1)
        {
            System.out.println("Bug No Image!!!!!");
        }
        else
        {
            System.out.print("Graet there is Image in this Site!!!!!");
        }

       // driver.close();



    }}