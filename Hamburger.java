package SanityTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import ExampleYoni.Utilities.CommonOps;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import org.sikuli.script.FindFailed;

import org.sikuli.script.Screen;

import static Mobile.EngineTest.ET;

public class Hamburger extends Testsh{

    final static Logger logger = LoggerFactory.getLogger("Test:");

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://chrome.google.com/webstore/detail/user-agent-switcher-for-c/djflhoibgkdhkhhcedjiklpkjnoahfmg");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

    }

    @Test
    public void test3() throws InterruptedException, FindFailed, AWTException {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        Screen add = new Screen();
        Thread.sleep(1000L);
        add.find("C:\\Images\\AddToChrome.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = add.click("C:\\Images\\AddToChrome.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(10000L);

        Screen addExt = new Screen();
        Thread.sleep(1000L);
        addExt.find("C:\\Images\\AddExt.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = addExt.click("C:\\Images\\AddExt.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);

        Screen addExt1 = new Screen();
        Thread.sleep(1000L);
        addExt1.find("C:\\Images\\AddExt1.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = addExt1.click("C:\\Images\\AddExt1.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(1000L);
        Screen ios = new Screen();
        Thread.sleep(1000L);
        ios.find("C:\\Images\\IOS.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = ios.click("C:\\Images\\IOS.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        Screen iphone = new Screen();
        Thread.sleep(1000L);
        iphone.find("C:\\Images\\iphone6.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = iphone.click("C:\\Images\\iphone6.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        //SportTest();
        ET();
        Thread.sleep(1000L);
       // Headline();
        Thread.sleep(1000L);
       // OrgTest();
        Thread.sleep(1000L);
       // VacationTest();
        Thread.sleep(1000L);
        dealsTest();
        Thread.sleep(1000L);
        OrgUpdateDates();
        Thread.sleep(1000L);
        lastMinTest();
        Thread.sleep(1000L);

        //End Init############# Start Hamburger
        logger.info("Start Hamburger");
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[3]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[4]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[4]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[6]/a")).click();
        Thread.sleep(1000L);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/a[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[1]/div[2]/ul/li[7]/a")).click();
        Thread.sleep(1000L);
        logger.info("Great, Complete Hamburger");
        Thread.sleep(1000L);
        SportTest();
        Thread.sleep(1000L);
        ET();
        Thread.sleep(1000L);
        Headline();
        Thread.sleep(1000L);
        OrgTest();
        Thread.sleep(1000L);
        VacationTest();
        Thread.sleep(1000L);
       dealsTest();
        Thread.sleep(1000L);
        lastMinTest();
        Thread.sleep(1000L);
        OrgUpdateDates();

    }

    public void ET() throws InterruptedException {
        driver.get(test1 +"DomesticHotels/?_ga=2.24251386.1547015120.1515671829-407786526.1515671829");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"domestic_hotel_selected_name\"]")).click();
        logger.info("Check Vacation Area");
        Thread.sleep(3000L);
        //Engine Test Vacation Hotel#############################################
        String Sh;
        for (int i = 1; i <= 3; i++) {
            driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).clear();
            Thread.sleep(3000L);
            if (i == 1) {
                Sh = "אורכ";
            } else if (i == 2) {
                Sh = "דן";

            } else {
                Sh = "פת";

            }
            driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).sendKeys("" + Sh + "");
            Thread.sleep(3000L);
            java.util.List<WebElement> engine1 = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
            System.out.println("Vacation Israel:" + i + ":" + " " + engine1.size());
            Thread.sleep(3000L);
        }
        logger.info("Great, Found Israel Hotels");
        Thread.sleep(1000L);
        driver.get(test1);
        driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[2]/div/a/div[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@class='text-hp-mobile padd-medium-right' and contains(text(),'טיסות לאילת')]")).click();
        Thread.sleep(1000L);
        //Engine Flight Israel#####################################################
        java.util.List<WebElement> engine2 = driver.findElements(By.xpath("//*[@class='col-xs-11 select-option-item'][@data-dest-code='ETH']"));
        java.util.List<WebElement> engine3 = driver.findElements(By.xpath("//*[@class='col-xs-11 select-option-item'][@data-dest-code='TLV']"));
        java.util.List<WebElement> engine4 = driver.findElements(By.xpath("//*[@class='col-xs-11 select-option-item'][@data-dest-code='HFA']"));
        java.util.List<WebElement> engine5 = driver.findElements(By.xpath("//*[@class='col-xs-11 select-option-item'][@data-dest-code='SDV']"));
        List<WebElement> engine6 = driver.findElements(By.xpath("//*[@class='col-xs-11 select-option-item'][@data-dest-code='TLV,SDV']"));
        Integer engine7 = engine2.size() + engine3.size() + engine4.size() + engine5.size() + engine6.size();
        if (engine7 == 10) {
            System.out.println("Great, we are ok with Israel Engine=10!!!!!");

        } else {
            System.out.println("Bug, Please check????");
        }
        Thread.sleep(3000L);
        logger.info("Great, Found Flight Israel");

    }

      public  void Headline() throws InterruptedException {
          logger.info("Great, Start HeadLine");
          driver.get(test1);
          Thread.sleep(2000L);
          //HeadLine##########
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[1]/div/a")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          Thread.sleep(1000L);
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[2]/div/a")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          Thread.sleep(1000L);
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[3]/div/a/div[2]")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[4]/div/a/div[2]")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[5]/div/a/div[2]")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[6]/div/a/div[2]")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          driver.findElement(By.xpath("//*[@id=\"homenav\"]/div[2]/div[2]/ul/li[7]/div/a/div[2]")).click();
          Thread.sleep(1000L);
          driver.navigate().back();
          logger.info("Great, Complete HeadLine");

      }

    public  void OrgUpdateDates() throws InterruptedException {

        Thread.sleep(2000L);
        driver.get(test1+"organized/trip/albania-765/?itineraryid=765&departureid=24229&startdate=06/12/2018&capacity.adults=2&capacity.children=0&capacity.infants=0");
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        Thread.sleep(6000L);
        driver.findElement(By.xpath("//*[@id=\"tour-details-summery-section\"]/div/div/div[1]/a")).click();
        WebElement otherDate = driver.findElement(By.xpath("//*[@id=\"tour-name-price-section\"]/div[2]/div/div[1]/span[2]/span"));
        String otherDate1 ="€"+otherDate.getText();
        Thread.sleep(2000L);//Check if User can change Dates
        WebElement otherDateAfter = driver.findElement(By.xpath("//*[@id=\"dates_options_popup_wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]"));
        String otherDateAfter1 = otherDateAfter.getText();
        Assert.assertEquals(otherDate1, otherDateAfter1);
        Thread.sleep(2000L);
        System.out.println(otherDate1+ " "+ otherDateAfter1);
       // driver.findElement(By.xpath("//*[@id=\"ininerary-package-0-6\"]")).click();
        Thread.sleep(2000L);
        WebElement otherDateAfter2 = driver.findElement(By.xpath("//*[@id=\"dates_options_popup_wrapper\"]/div/div/div/div[2]/div/div[7]/div/div[2]/div[1]"));
        String otherDateAfter3 = otherDateAfter2.getText();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"dates_options_popup_wrapper\"]/div/div/div/div[2]/div/div[7]/div/div[2]/div[1]")).click();
        Thread.sleep(3000L);
        WebElement otherDate2 = driver.findElement(By.xpath("//*[@id=\"tour-name-price-section\"]/div[2]/div/div[1]/span[2]/span"));
        String otherDate3 ="€"+otherDate2.getText();
        String  otherDate4 =otherDate3.substring(0, otherDate3.length() - 4) + otherDate3.substring(otherDate3.length() - 3);
        Assert.assertEquals(otherDate4, otherDateAfter3) ;
        logger.info("Great, Update Dates+ Price Pass");
    }



    public  void OrgTest() throws InterruptedException {

        driver.get(test1+"Organized/");//***********************
        logger.info("Great, Start Org Test");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='continents_destinations']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-name='Europe']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='organized-search-btn']")).click();
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"results\"]/ul[1]/li/div[1]/div/div[2]/div[1]/div/h4")).click();
        Thread.sleep(3000);
        logger.info("Check Invite in Vaction and start Payment#1");
        driver.findElement(By.xpath("//*[@class='order-btn online-order-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='orderer_first_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='orderer_last_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='input_normal phone_number']")).sendKeys("2749819");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_MobilePrefix']")).sendKeys("050");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_Email']")).sendKeys("sha@gmail.com");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Year']")).sendKeys("1987");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Month']")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Day']")).sendKeys("22");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='passanger_first_name_1']")).sendKeys("Testsh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='passanger_last_name_1']")).sendKeys("Testsh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='passanger_last_name_1']")).sendKeys("Testsh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Year']")).sendKeys("1980");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Month']")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Day']")).sendKeys("23");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='checkbox_normal_label']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='step_one_btn']")).click();
        Thread.sleep(1000);
        logger.info("Great, Compelete Org Test");
        logger.info("Compelete Payment#1");

    }
    public void VacationTest() throws InterruptedException, FindFailed {
        logger.info("Great, Start Vacation Test");
        Thread.sleep(1000);
        driver.get(test1+"DomesticHotels/?_ga=2.24251386.1547015120.1515671829-407786526.1515671829");
        driver.findElement(By.xpath("//*[@id=\"domestic_hotel_selected_name\"]")).click();
        logger.info("Check Vacation Area");
       // driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search_domestic_hotel_input\"]")).sendKeys("אילת");
        logger.info("Check Eilat");
        Thread.sleep(2000);
        Screen eilat = new Screen();
        Thread.sleep(3000L);
        eilat.find("C:\\Images\\Mobile\\Vacation\\Eilat.png"); //identify pause button
        Thread.sleep(3000L);
        try {
            int click = eilat.click("C:\\Images\\Mobile\\Vacation\\Eilat.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"uiDates\"]")).click();
        logger.info("Check pick date");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"dateDepart\"]/div/table/tbody/tr[5]/td[4]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"dateArrive\"]/div/table/tbody/tr[5]/td[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"btnSelectDates\"]/a")).click();
        Thread.sleep(3000);
        Screen vacationIsr = new Screen();
        Thread.sleep(3000L);
        vacationIsr.find("C:\\Images\\Mobile\\Vacation\\VacationIsr.png"); //identify pause button
        Thread.sleep(3000L);
        try {
            int click = vacationIsr.click("C:\\Images\\Mobile\\Vacation\\VacationIsr.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"domestic-search-btn\"]/span")).click();
        logger.info("Check Search");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"domestic-search-btn\"]/span")).getText();
        logger.info("Check Search");
        Thread.sleep(3000);
        List<WebElement> image = driver.findElements(By.xpath("//*[@class='product-main-img']"));

        Integer sh =  image.size();
        System.out.println(sh);
        if (sh>=8)
        {
            System.out.println("Great Image!!!!!");
        }
        else
        {
            System.out.print("Bug with Image in this Site!!!!!");
        }
        logger.info("Check Images in Vaction Eilat");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='results']/ul[1]/li/div[1]/div/div[2]/div[1]/div/a/h4")).click();
        Thread.sleep(2000);
        WebElement e=driver.findElement(By.xpath("//*[@id=\"package_product_page\"]/div[1]/div[4]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[6]/div/div[2]/span[3]/span[2]"));
        Coordinates cor=((Locatable)e).getCoordinates();
        cor.inViewPort();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"package_product_page\"]/div[1]/div[4]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        logger.info("Check Invite in Vaction and start Payment#1");
        driver.findElement(By.xpath("//*[@id='orderer_first_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='orderer_last_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='input_normal phone_number']")).sendKeys("2749819");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_MobilePrefix']")).sendKeys("050");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_Email']")).sendKeys("sha@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Year']")).sendKeys("1987");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Month']")).sendKeys("2");
         Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Day']")).sendKeys("22");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='checkbox_normal_label']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='step_one_btn']")).click();
        Thread.sleep(1000);
        logger.info("Great, Compelete Vacation Test");
        logger.info("Compelete Payment#1");
        }

       public  void SportTest() throws InterruptedException, FindFailed {
        driver.get(test1+"sport/");//***********************
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id='sport_selected_dest_name']")).click();
        logger.info("Check Sport Events");
        driver.findElement(By.xpath("//*[@id=\"search_event_input\"]")).sendKeys("מדריד");
        driver.findElement(By.xpath("//*[@id='ui-id-2']/li[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sportSearchForm\"]/div/div[4]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='product-total-price']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='button deal-order-button thin']")).click();
        Thread.sleep(2000);
        logger.info("Check Invite in Vaction and start Payment#1");
        driver.findElement(By.xpath("//*[@id='orderer_first_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='orderer_last_name']")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='input_normal phone_number']")).sendKeys("2749819");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_MobilePrefix']")).sendKeys("050");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Customer_Email']")).sendKeys("sha@gmail.com");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Year']")).sendKeys("1987");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Month']")).sendKeys("2");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_0__Day']")).sendKeys("22");
        Thread.sleep(1000);
        logger.info("Start Client#2");
        driver.findElement(By.xpath("//*[@id='passanger_first_name_1']")).sendKeys("sha");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='passanger_last_name_1']")).sendKeys("may");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Year']")).sendKeys("1980");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Month']")).sendKeys("6");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='Passengers_1__Day']")).sendKeys("26");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='checkbox_normal_label']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='step_one_btn']")).click();
        Thread.sleep(1000);
        logger.info("Compelete Payment#1");
        }
         public  void dealsTest() throws InterruptedException, FindFailed {
          driver.get(test1 + "deals/");//***********************
          driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[2]/div/div[1]/ul/li[1]/article/div[1]/img")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@class='button deal-order-button thin']")).click();
          Thread.sleep(2000);
          logger.info("Check Invite in deals and start Payment#1");
           driver.findElement(By.xpath("//*[@id='orderer_first_name']")).sendKeys("Test");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='orderer_last_name']")).sendKeys("Test");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@class='input_normal phone_number']")).sendKeys("2749819");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Customer_MobilePrefix']")).sendKeys("050");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Customer_Email']")).sendKeys("sha@gmail.com");
           Thread.sleep(1000);
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_0__Year']")).sendKeys("1987");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_0__Month']")).sendKeys("2");
           Thread.sleep(1000);
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_0__Day']")).sendKeys("22");
           Thread.sleep(1000);
           logger.info("Start Client#2");
           driver.findElement(By.xpath("//*[@id='passanger_first_name_1']")).sendKeys("sha");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='passanger_last_name_1']")).sendKeys("may");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_1__Year']")).sendKeys("1980");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_1__Month']")).sendKeys("6");
           Thread.sleep(1000);
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='Passengers_1__Day']")).sendKeys("26");
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@class='checkbox_normal_label']")).click();
           Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='step_one_btn']")).click();
           Thread.sleep(1000);
           logger.info("Compelete deals Payment#1");
    }

    public  void lastMinTest() throws InterruptedException, FindFailed {
        driver.get(test1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='text-hp-mobile' and contains(text(),'הרגע האחרון')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[2]/div/div[1]/ul/li[1]/article/div[2]/div[1]/h4/a")).click();
        Thread.sleep(1000);
        System.out.println("Click Image Vacation Aboard");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[1]/div/div/div/div[4]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[2]/div/div[4]/ul/li[1]/article/div[2]/div[1]/h4/a")).click();
        Thread.sleep(1000);
        System.out.println("Click Image Org");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[1]/div/div/div/div[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[2]/div/div[1]/ul/li[1]/article/div[2]/div[1]/h4/a")).click();
        Thread.sleep(1000);
        System.out.println("Click Image All");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[1]/div/div/div/div[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"items-pagination-slider-wrapper\"]/div[2]/div/div[2]/ul/li[2]/article/div[2]/div[1]/h4/a")).click();
        Thread.sleep(1000);
        System.out.println("Click Image Israel");
        driver.navigate().back();

    }
}

