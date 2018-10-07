package SanityTest;

import com.jcraft.jsch.Logger;
import org.apache.poi.hslf.record.Sound;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import test2.Util;

import java.util.concurrent.TimeUnit;


 public class RemarketingTriggered extends Testsh {
      @Before
     public  void openwindow() throws InterruptedException {
      openChrome();
    }

    @Test
    public void test4() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        CheckAsseration();
    }

    public void CheckAsseration() throws InterruptedException, FindFailed {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get(test1+"organized/trip/hong-kong-macau/");
        Thread.sleep(1000L);
        String[] remOrg = new String[6];
        for(int i=0; i<=5; i++)
        {
        remOrg[i] =  js.executeScript("return GTDataLayer["+i+"].event;").toString();
        if  (remOrg[i].contains("remarketingTriggered"))
        {
             System.out.println("1:"+ " "+ "Great!! We Found remarketingTriggered in organized");
             break;

        }

        }

       //Check GTDataLayer in Org####

        Thread.sleep(2000L);
        driver.get(test1+"deals/dealdetails/germany/berlin/?startdate=12.08.2018&starttime=14:10:00&outboundflightid=251&enddate=16.08.2018&endtime=18:25:00&inboundflightid=252&destinationcode=50178&dealtype=1&sabresupplier=AV&hotelid=121328115&packageid=-780716461&vendor=3&searchkey=2_0_0-STANDARD%20ROOM_BB_3|");//Check GTDataLayer in Org####
        Thread.sleep(2000L);
        String[] remVac = new String[6];
        for(int i=0; i<=5; i++)
        {
            remVac[i] =  js.executeScript("return GTDataLayer["+i+"].event;").toString();
            if  (remVac[i].contains("remarketingTriggered"))
            {
                System.out.println("2:"+ " "+"Great!! We Found remarketingTriggered in deals ");
                break;

            }

        }//Check GTDataLayer in Vac####
        Thread.sleep(2000L);
        driver.get(test1+"domestichotels/hoteldetails/crowne-plaza-eilat/");//Check GTDataLayer in Domestic####
        String[] remDomes = new String[6];
        for(int i=0; i<=5; i++)
        {
            remDomes[i] =  js.executeScript("return GTDataLayer["+i+"].event;").toString();
            if  (remDomes[i].contains("remarketingTriggered"))
            {
             System.out.println("3:"+ " "+"Great!! We Found remarketingTriggered in domestichotels");
                break;

            }}
          logger.info("Great, Dynamic is working");

        }//Check GTDataLayer in Domestic####



      }












