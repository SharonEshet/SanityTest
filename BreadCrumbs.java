package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;


public class BreadCrumbs {

    static WebDriver driver;
    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.eshet.com/domestichotels/");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.get("https://www.eshet.com/DomesticHotels/SearchResults?DomesticType=DomesticHotels&HotelCode=-1&HotelAreasCode=ETH&StartDate=23.05.2018&EndDate=26.05.2018&HotelRooms%5B0%5D.Adults=2&HotelRooms%5B0%5D.Children=0&HotelRooms%5B0%5D.Infants=0");
        Thread.sleep(400000L);

    Screen bce=new Screen();//BCEilatHotel--- Search
        bce.find("C://Images/BreadCrumbs/BCEilatHotel.PNG");
        try {
            int click = bce.click("C://Images/BreadCrumbs/BCEilatHotel.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        driver.get("https://www.eshet.com/flights/searchresults/?page=1&fClass=Y&maxWaitingTime=0&stopsNumber&ways=2&origin=TLV&destination=AMS&from1=&to1=&from2=&to2=&from3=&from=04/04/2018&fromHours=%D7%9B%D7%9C+%D7%94%D7%A9%D7%A2%D7%95%D7%AA&to=11/04/2018&toHours=%D7%9B%D7%9C+%D7%94%D7%A9%D7%A2%D7%95%D7%AA&firstDate=04/04/2018&firstDateTime=%D7%9B%D7%9C+%D7%94%D7%A9%D7%A2%D7%95%D7%AA&secondDate=&thirdDate=11/04/2018&thirdDateTime=%D7%9B%D7%9C+%D7%94%D7%A9%D7%A2%D7%95%D7%AA&adult=2&child=0&baby=0&young=0&old=0&amount=673&airline=u2&directFlights=True&calendarOnly=false&isPromotion=53586&tp=qSw6jkR29YA=&_ga=2.257610701.751716651.1515051046-1118571763.1515051046");
        Thread.sleep(4000L);
        Screen bcAmst=new Screen();
        bcAmst.find("C:/Images/BreadCrumbs/BCFlightAboard.png"); //BCFlightToAmst--- Search
        try {
            int click = bcAmst.click("C://Images/BreadCrumbs/BCFlightAboard.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(4000L);

        driver.get("https://www.eshet.com/deals/united-kingdom/london");
        Thread.sleep(4000L);
        Screen bcLondon=new Screen();
        bcLondon.find("C:/Images/BreadCrumbs/BCVacationAborad.png"); //BCVacation--- Searc
        try {
            int click = bcLondon.click("C:/Images/BreadCrumbs/BCVacationAborad.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);

       /* driver.get("https://www.eshet.com/ski/holidays-ski/");//Ski
        Thread.sleep(4000L);
        Screen bcSki=new Screen();
        bcSki.find("C:/Images/BreadCrumbs/BCSkiInHoliday.png"); //BCSki--- Search#########
        try {
            int click = bcSki.click("C:/Images/BreadCrumbs/BCSkiInHoliday.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);*/

        driver.get("https://www.eshet.com/sport/madrid/realmadrid/");
        Thread.sleep(4000L);
        Screen bcSport=new Screen();
        bcSport.find("C:/Images/BreadCrumbs/BCSportReal.png"); //BCSport--- Search########
        try {
            int click = bcSport.click("C:/Images/BreadCrumbs/BCSportReal.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);


        driver.get("https://www.eshet.com/organized/trip/hong-kong-macau?_ga=2.6936948.751716651.1515051046-1118571763.1515051046");
        Thread.sleep(4000L);
        Screen bcTrip=new Screen();
        bcTrip.find("C:/Images/BreadCrumbs/BCOrgVacation.png"); //BCOrgThi--- Search########
        try {
            int click = bcTrip.click("C:/Images/BreadCrumbs/BCOrgVacation.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
         Thread.sleep(2000L);

        driver.get("https://www.eshet.com/organized/asia/thailand/");
        Thread.sleep(4000L);
        Screen bcOrg=new Screen();
        bcTrip.find("C:/Images/BreadCrumbs/BCOrgVacationThi.png"); //BCOrgThi--- Search########
        try {
            int click = bcOrg.click("C:/Images/BreadCrumbs/BCOrgVacationThi.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);

        driver.get("https://www.eshet.com/sport/?_ga=2.59038702.2136663494.1515054638-965303538.1515054638");// Kidom Mondial######
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/div[2]/div/ul/li[11]/article/div[1]/img")).click();
        Thread.sleep(4000L);
        Screen bcMondial=new Screen();
        bcTrip.find("C:/Images/BreadCrumbs/BCMondial.png"); //BCMondial--- Search########
        try {
            int click = bcMondial.click("C:/Images/BreadCrumbs/BCMondial.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        Thread.sleep(2000L);

        driver.get("https://www.eshet.com/deals/");// Kidom Deal######
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div[1]/article/div[1]/img")).click();
        Thread.sleep(4000L);
        Screen bcDeal=new Screen();
        bcTrip.find("C:/Images/BreadCrumbs/BCDeal.png"); //BCDeal--- Search########
        try {
            int click = bcDeal.click("C:/Images/BreadCrumbs/BCDeal.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        Thread.sleep(2000L);

        driver.get("https://www.eshet.com/flights/?_ga=2.20851835.2136663494.1515054638-965303538.1515054638/");// Kidom Flight######
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_MainColumn_Main2Column_ctl00_ctl01_specific_fare_Regular_promotion\"]/article/img")).click();
        Thread.sleep(4000L);
        Screen bcFlight=new Screen();
        bcTrip.find("C:/Images/BreadCrumbs/BCFlight.png"); //BCOrgThi--- Search########
        try {
            int click = bcFlight.click("C:/Images/BreadCrumbs/BCFlight.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }


        Thread.sleep(2000L);

       driver.close();



    }}
