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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExcelFlight extends Testsh {

    public ExcelFlight() throws IOException {
    }

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
      //  Thread.sleep(4000L);
      //  driver.findElement(By.xpath("//*[@id='ZA_CAMP_A_3']")).click();
        Thread.sleep(4000L);
        sh();

    }

    public void sh() throws IOException, InvalidFormatException, InterruptedException {

        String filename = "C:/checkFlight.xlsx";
        int i = 1;
        try (FileInputStream fis = new FileInputStream(filename)) {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (i <= 11) {
                XSSFRow row = (XSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                while (i <= 11) {
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

            driver.get(origLink);
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(4000L);
            List<WebElement> numberKid = driver.findElements(By.xpath("//*[@class='post']"));
            Integer numberKid1 = numberKid.size();
            System.out.println(numberKid1 + " " + "URL:" + driver.getCurrentUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(4000L);
        List<WebElement> noImage = driver.findElements(By.xpath("//*[@src='https://www.eshet.com/images/global/white-background.jpg']"));
        Integer noImage1 = noImage.size();
        System.out.println("Number of white Image" + " " + noImage1);


    }


  /*  public  void  excelWriter(String url, int i)
    {
        try {
            FileInputStream ExcelFile = new FileInputStream(FILE_NAME);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExcelWSheet = ExcelWBook.getSheet("sheet1");
        Row = ExcelWSheet.createRow( i);
        try {

            Cell = Row.createCell(0);
            Cell.setCellValue(url);
            FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
            ExcelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();} catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }*/




       // driver.close();
        }































