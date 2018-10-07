package SanityTest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FlightStatic extends Testsh {

   @Before
  public void openwindow() throws InterruptedException {
     openChrome();
   }
  @Test
  public void Test2() throws InterruptedException, IOException, InvalidFormatException {

    for (int i = 1; i <= 2; i++) {


   flightTest( i);
    }

  }

  public void flightTest(int i) throws InterruptedException, IOException, InvalidFormatException {
    String flightStas = " ";
    String flightStasIn = " ";
    switch (i) {
      case 1:
        flightStas = "https://www.eshet.com/flights/cheap-flights/united_states/newyork/el_al";//el al
        flightStasIn = "https://www.eshet.com/flights/cheap-flights/united_states/newyork/el_alSSSSS";//el al In Correct
                break;
      case 2:
        flightStas = "https://www.eshet.com/flights/cheap-flights/thailand/bangkok/uzbekistan_airways";//Uzibegistan
        flightStasIn = "https://www.eshet.com/flights/cheap-flights/thailand/bangkok/uzbekistan_airwaysssss";//Uzibegistan In Correct
        break;
       default:
        flightStas = "https://www.eshet.com/flights/cheap-flights/romania/bucharest/tarom_romanian_air_transport";//Tarom
        flightStasIn = "https://www.eshet.com/flights/cheap-flights/romania/bucharest/tarom_romanian_air_transportdddddd";//Tarom In Correct
        break;
    }//Select Flight Static

    flightTest(flightStas,flightStasIn);
    Thread.sleep(4000L);
    execKill();



  }


  public void flightTest(String url, String url1) throws InterruptedException {

    Thread.sleep(3000L);
      driver.manage().window().maximize();
      Thread.sleep(2000L);
      driver.get(url);
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@class='margin-small-vertical h4 padd-medium-bottom line-height-clean']")).getText();
     System.out.println("Sharon");
      Thread.sleep(2000L);
      driver.get(url1);
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@class='margin-small-vertical h4 padd-medium-bottom line-height-clean']")).getText();
      Thread.sleep(2000L);
      logger.info("Great, Complete Static Flight");

    }
  public void execKill() throws InterruptedException, IOException, InvalidFormatException {
    try {
      Runtime.getRuntime().exec("taskkill /im chrome.exe /f");
      Thread.sleep(2000);
      Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
      Thread.sleep(2000);
      System.exit(0);
    } catch (Exception e) {
      e.printStackTrace();
    }


  }



}
