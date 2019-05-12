package DynamicRem;
import au.com.bytecode.opencsv.CSVReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.codehaus.groovy.tools.shell.util.CommandArgumentParser.parseLine;

public class ExcelDometicHotel extends UtilFeed {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    public BufferedReader br;
    List<String> line = new ArrayList<String>(); List<String> line1 = new ArrayList<String>();List<String> line2 = new ArrayList<String>();
    List<String> line3 = new ArrayList<String>();List<String> line4 = new ArrayList<String>();List<String> line5 = new ArrayList<String>();
    List<String> line6 = new ArrayList<String>(); List<String> line7 = new ArrayList<String>();List<String> line8 = new ArrayList<String>();
    List<String> line9 = new ArrayList<String>();List<String> line10 = new ArrayList<String>();List<String> line11 = new ArrayList<String>();
    List<String> line12 = new ArrayList<String>();List<String> line13 = new ArrayList<String>();List<String> line14 = new ArrayList<String>();
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
        driver.manage().window().maximize();
      }

    @Test
    public void Test1() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='Data/Facebook_DomesticHotel.csv']")).click();
        String GDest = "Facebook_DomesticHotel";
        Thread.sleep(2000);
        Start(GDest);
    }

    public void Start(String GDest) throws Exception {
        Thread.sleep(20000);
        String csvFile = "D:/Users/sharon.maymon/Downloads/" + GDest + ".csv";
        Scanner scanner = new Scanner(new File(csvFile));
        while (scanner.hasNext()) {
            line = parseLine(scanner.nextLine());
                line1.add(line.get(0));line2.add(line.get(1));line3.add(line.get(2));line4.add(line.get(3));
                line5.add(line.get(4));line6.add(line.get(5));line7.add(line.get(6));line8.add(line.get(7));
                line9.add(line.get(8));line10.add(line.get(9));line11.add(line.get(10));line12.add(line.get(11));
                line13.add(line.get(12));line14.add(line.get(13));
                }
          for(int i=1;i<=198;i++)
          {
          if(line1.get(i).isEmpty()|| line2.get(i).isEmpty()|| line3.get(i).isEmpty()|| line4.get(i).isEmpty()||line5.get(i).isEmpty()
                  || line6.get(i).isEmpty()|| line7.get(i).isEmpty()|| line8.get(i).isEmpty()||
                  line9.get(i).isEmpty()||line10.get(i).isEmpty()|| line11.get(i).isEmpty()|| line12.get(i).isEmpty()
                  || line13.get(i).isEmpty()||line14.get(i).isEmpty())
          {
             throw new Exception("Empty Cell"+" "+ i);
          }
                 scanner.close();

    }}
    public static List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators) {
        return parseLine(cvsLine, separators, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }
        return result;
    }

}

