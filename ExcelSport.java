package SanityTest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import java.util.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import javax.activation.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExcelSport extends Testsh{

    public ExcelSport() throws IOException {
    }//*[@class='col-sm-6 padd-0-all']

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test1);//********************************************************************
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed, IOException, InvalidFormatException {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
      sh();


    }

    public void sh() throws IOException, InvalidFormatException, InterruptedException {
        String filename = "C:/checkSport.xlsx";
        int i = 1;
        try (FileInputStream fis = new FileInputStream(filename)) {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (i <= 3) {
                XSSFRow row = (XSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                while (i <= 3) {
                    XSSFCell cell = (XSSFCell) cells.next();
                    CellType type = cell.getCellTypeEnum();
                    if (type == CellType.STRING) {
                        String origLink = cell.getRichStringCellValue().toString();

                        driver.get(origLink);
                        Thread.sleep(1000);
                        i++;
                        PageFailed(origLink);
                    } else {
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void PageFailed(String origLink) throws InterruptedException, IOException, InvalidFormatException {
        try {
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            Thread.sleep(2000L);
            List<WebElement> numberKid = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));
            Integer numberKid1 = numberKid.size();
            System.out.println(numberKid1+" " + "URL:"+driver.getCurrentUrl());
           }
           catch (Exception e) {
                e.printStackTrace();
            }
        Thread.sleep(2000L);
        List<WebElement> noImage = driver.findElements(By.xpath("//*[@src='https://www.eshet.com/images/global/white-background.jpg']"));
        Integer noImage1 =  noImage.size();
        System.out.println("Number of white Image"+ " "+noImage1 );
        Thread.sleep(2000L);

      //  driver.close();
        }
    public void execKill() throws InterruptedException, IOException, InvalidFormatException {
        try {
            Runtime.getRuntime().exec("taskkill /im chrome.exe /f");
         //   Thread.sleep(2000);
         //   Runtime.getRuntime().exec("TASKILL /F /IM chrome.exe /f");
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

 /*   public void email(){
        // Recipient's email ID needs to be mentioned.
        String to = "Sharonelia123@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "Sharon.Maymon@eshet-tours.co.il";

        // Assuming you are sending email from localhost
        String host = "mail1";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
      //  properties.put("mail.smtp.port", "12220");
        properties.put("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }*/
    }







































