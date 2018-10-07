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
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExcelOrg extends Testsh{


    //  public static final String SAMPLE_XLSX_FILE_PATH = "C:/QA/Links.xlsx";
      public ExcelOrg() throws IOException {
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
        String filename = "C:/checkOrg.xlsx";
        int i = 1;
        try (FileInputStream fis = new FileInputStream(filename)) {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (i <= 5) {
                XSSFRow row = (XSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                while (i <= 5) {
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

        }


}




























