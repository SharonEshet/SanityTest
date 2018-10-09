package SanityTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;


public class BreadCrumbs extends Testsh{
    public BreadCrumbs() {
    }
    @Before
    public void open() throws InterruptedException, FindFailed {
        openChrome();

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        BreadCrumbs();
    }


        public void BreadCrumbs() throws InterruptedException, FindFailed {

         Thread.sleep(2000L);
        driver.get(test1+"DomesticHotels/SearchResults?DomesticType=DomesticHotels&HotelCode=-1&HotelAreasCode=ETH&StartDate=14.02.2019&EndDate=16.02.2019&HotelRooms%5B0%5D.Adults=2&HotelRooms%5B0%5D.Children=0&HotelRooms%5B0%5D.Infants=0");
        Thread.sleep(2000L);//DomesticHotels Eilat#########
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=LGW&Segments%5B0%5D.FromName=%D7%AA%D7%9C%20%D7%90%D7%91%D7%99%D7%91&Segments%5B0%5D.ToName=%D7%9C%D7%95%D7%A0%D7%93%D7%95%D7%9F&Segments%5B0%5D.Date=11.02.2019&Segments%5B1%5D.From=LGW&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=%D7%9C%D7%95%D7%A0%D7%93%D7%95%D7%9F&Segments%5B1%5D.ToName=%D7%AA%D7%9C%20%D7%90%D7%91%D7%99%D7%91&Segments%5B1%5D.Date=18.03.2019");
        Thread.sleep(2000L);//Flights London##########
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"deals/searchresults?DestinationCode=65726&DealType=Vacation&FromDate=21.02.2019&ToDate=24.02.2019&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");
        Thread.sleep(2000L);//Pac London################
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"ski/searchresults?DestinationCode=43278&DealType=Ski&FromDate=28.03.2019&ToDate=31.03.2019&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");//Ski
        Thread.sleep(2000L);//Ski Bansko#############
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"sport/madrid/realmadrid/");
        Thread.sleep(2000L);//Sport Real############
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"organized/trip/magik-beijing/?itineraryid=663&departureid=25842&Startdate=25.03.2019&capacity.adults=2&capacity.children=0&capacity.infants=0");
        Thread.sleep(2000L);//Orag Beijing##############
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item current'])[2]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"organized/asia/thailand/");
        Thread.sleep(2000L);//Orag thailand######
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[3]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"sport/searchresults?DestinationCode=63634&EventId=&EventType=0&Performer=&DealType=Event&FromDate=01.03.2019&ToDate=31.03.2019&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");// Kidom Mondial######
        Thread.sleep(2000L);//Sport Barca
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[2]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"deals/");// Kidom Deal######
        Thread.sleep(2000L);//Deals
        driver.findElement(By.xpath("(//*[@class='breadcrumbs--item'])[2]")).click();
        Thread.sleep(2000L);
        driver.get(test1+"flights/");// Kidom Flights######
        Thread.sleep(2000L);
        driver.findElement(By.xpath("(//*[@class='brad_crumbs '])[1]")).click();
        Thread.sleep(2000L);
        logger.info("Great, Complete Bread Crumbs");
    }}
