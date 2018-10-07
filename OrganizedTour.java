package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class OrganizedTour extends Testsh{

    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
    }

    @Test
    public void Flow() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@data-tab-type='organized']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[1]/div/div/a/i")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][contains(text(),'אירופה')]")).click();
        Thread.sleep(4000L);
        // Check several Countries In Europe
        driver.findElement(By.xpath("//*[@id=\"CountryName\"]")).click();
        WebElement element = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='אוסטריה']"));
        String actualValue = element.getText();
        Assert.assertEquals("אוסטריה", actualValue);
        Thread.sleep(2000L);
        WebElement element1 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='ספרד']"));
        String actualValue1 = element1.getText();
        Assert.assertEquals("ספרד", actualValue1);
        Thread.sleep(2000L);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='גרמניה']"));
        String actualValue2 = element2.getText();
        Assert.assertEquals("גרמניה", actualValue2);
        Thread.sleep(2000L);
      /*  WebElement element3 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='צרפת']"));
        String actualValue3 = element3.getText();
        Assert.assertEquals("צרפת", actualValue3);
        Thread.sleep(2000L);
        WebElement element4 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='שוויץ']"));
        String actualValue4 = element4.getText();
        Assert.assertEquals("שוויץ", actualValue4);*/

    // Check several Countries In Africa
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[1]/div/div/a/i")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][contains(text(),'אפריקה')]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"CountryName\"]")).

    click();
        Thread.sleep(2000L);
    WebElement elementA = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='אתיופיה']"));
    String actualValueA = elementA.getText();
        Assert.assertEquals("אתיופיה",actualValueA);
    WebElement elementA1 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='טנזניה']"));
    String actualValueA1 = elementA1.getText();
        Assert.assertEquals("טנזניה",actualValueA1);
    WebElement elementA2 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='דרום אפריקה']"));
    String actualValueA2 = elementA2.getText();
        Assert.assertEquals("דרום אפריקה",actualValueA2);
    WebElement elementA3 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='מרוקו']"));
    String actualValueA3 = elementA3.getText();
        Assert.assertEquals("מרוקו",actualValueA3);
    // Check Engine
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ContinentName\"]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][contains(text(),'אירופה')]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"CountryName\"]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='גרמניה']")).

    click();
        Thread.sleep(2000L);

    //Dates of travel
        driver.findElement(By.xpath("//*[@id='MonthAndYearHe']")).

    click();
        Thread.sleep(2000L);
       WebElement elementDate = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='דצמבר 2018']"));
       String actualValueDate1 = elementDate.getText();
       Assert.assertEquals("דצמבר 2018", actualValueDate1);
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='דצמבר 2018']")).click();
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//*[@id='MonthAndYearHe']")).click();
       Thread.sleep(2000L);
      WebElement elementDate2 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='ינואר 2019']"));
      String actualValueDate3 = elementDate2.getText();
        Assert.assertEquals("ינואר 2019",actualValueDate3);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='ינואר 2019']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='MonthAndYearHe']")).click();
        Thread.sleep(2000L);
    WebElement elementDate3 = driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='אוקטובר 2018']"));
    String actualValueDate4 = elementDate3.getText();
        Assert.assertEquals("אוקטובר 2018",actualValueDate4);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='collapsable-option'][@data-text='אוקטובר 2018']")).click();

    // Herkev
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();

    WebElement elementHerkev1 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[1]"));
    String actualValueHer1 = elementHerkev1.getText();
        Assert.assertEquals("זוג",actualValueHer1);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[1]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev2 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[2]"));
    String actualValueHer2 = elementHerkev2.getText();
        Assert.assertEquals("זוג + ילד",actualValueHer2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[2]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev3 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[3]"));
    String actualValueHer3 = elementHerkev3.getText();
        Assert.assertEquals("זוג + תינוק",actualValueHer3);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[3]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev4 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[4]"));
    String actualValueHer4 = elementHerkev4.getText();
        Assert.assertEquals("זוג + ילד + תינוק",actualValueHer4);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[4]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev5 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[5]"));
    String actualValueHer5 = elementHerkev5.getText();
        Assert.assertEquals("יחיד",actualValueHer5);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[5]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev6 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[6]"));
    String actualValueHer6 = elementHerkev6.getText();
        Assert.assertEquals("זוג + 2 ילדים",actualValueHer6);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[6]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"organizedSearchForm\"]/div/div/div[3]/div[1]/div/a/i")).

    click();
        Thread.sleep(2000L);
    WebElement elementHerkev7 = driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[7]"));
    String actualValueHer7 = elementHerkev7.getText();
        Assert.assertEquals("שלושה מבוגרים",actualValueHer7);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"tour_candidates\"]/ul/li[7]")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='organized-search-btn']")).

    click();
         Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='button btn-sm btn-block btn-order']")).

    click();
        Thread.sleep(2000L);
    ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().

    window(windows.get(1));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='package-summery-buttons-inner']")).

    click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"capacity_section\"]/div/div[3]/div[2]/div/input")).

    click();
        Thread.sleep(2000L);
    //Client Info#######1
        driver.findElement(By.xpath("//*[@id='orderer_first_name']")).

    sendKeys("Test");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='orderer_last_name']")).

    sendKeys("Test");
        Thread.sleep(2000L);
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Customer_MobilePrefix\"]")));
        dropdown.selectByIndex(2);
        driver.findElement(By.xpath("//*[@id='Customer_PhoneMobile']")).sendKeys("0522749810");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"Customer_Email\"]")).sendKeys("Sha@gmail.com");
        Thread.sleep(2000L);
    Select BDY = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Year\"]")));
        BDY.selectByIndex(14);
    Select BDM = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Month\"]")));
        BDM.selectByIndex(4);
    Select BDD = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_0__Day\"]")));
        BDD.selectByIndex(4);

    //Client Info#######2
        Thread.sleep(2000L);
    Select BDY1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Year\"]")));
        BDY1.selectByIndex(19);
    Select BDM1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Month\"]")));
        BDM1.selectByIndex(8);
    Select BDD1 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_1__Day\"]")));
        BDD1.selectByIndex(24);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_first_name_2\"]")).sendKeys("Test");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_last_name_2\"]")).    sendKeys("Test");
        Thread.sleep(4000L);

    //Client Info#######3
        Thread.sleep(2000L);
    Select BDY2 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_2__Year\"]")));
        BDY2.selectByIndex(19);
    Select BDM2 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_2__Month\"]")));
        BDM2.selectByIndex(8);
    Select BDD2 = new Select(driver.findElement(By.xpath("//*[@id=\"Passengers_2__Day\"]")));
        BDD2.selectByIndex(24);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_first_name_1\"]")).sendKeys("Test");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_last_name_1\"]")).sendKeys("Test");
        Thread.sleep(2000L);//insurance Test######
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[1]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance.selectByIndex(2);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_0\"]")).sendKeys("025410770");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")).click();
        Thread.sleep(2000L);
        Select insurance1 = new Select(driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/select")));
        insurance1.selectByIndex(1);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"passanger_IdentityNumber_1\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_form\"]/div/div[4]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"step_one_btn\"]")).click();
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id=\"customer_id_num\"]")).sendKeys("058633025");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"booking_step2_form\"]/div/div[4]/div[2]/div/div/span")).click();
        Thread.sleep(2000L);
    //driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();

}

}
