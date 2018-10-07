package SanityTest;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelOrder {
    public static WebDriver driver;

    public ExcelOrder() {
    }

    @Test
    public static void openBrowser() throws BiffException, IOException {


        String FilePath = "C:/sharon.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sh = wb.getSheet("Sheet1");
        int totalNoOfRows = sh.getRows();
        int totalNoOfCols = sh.getColumns();

        for(int j=0; j<2;j++){

       for(int i=1; i<totalNoOfRows;i++){
         String sharon = sh.getCell(j, i).getContents();
         if (sharon=="Atlantis")     {
             {
                 System.out.println(sharon);

             }}}}}

    @Test
    public static void closeBrowser() {
      //  System.out.println("Sharon9");
    }
}




















