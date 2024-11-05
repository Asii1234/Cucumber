package org.helping;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
 public static WebDriver driver;
public static Actions a;
public static Robot r;
	public static  void openChrome() {
     driver =  new ChromeDriver();
	}	
	
	public static void openEdge() {
     driver=new EdgeDriver();
	}
	
	
	public static void launchURL(String url) {
     driver.get(url);
     
	}
	
	public static void maxWindow() {
driver.manage().window().maximize();
	}	
	
	public static  void getTheTitle() {
String title = driver.getTitle();
System.out.println("Page Title :"+title);
	}
	
	public static void getPageUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println("currentUrl"+currentUrl);
	}
	
	public static void closeBrowser() {
driver.quit();
	}
	
	public static void passTheValue(WebElement element,String value) {
    element.sendKeys(value);
    
	}
	
	public static void clickTheButton(WebElement element) {
element.click();
	}
	
	public static void getTheText(WebElement element) {
String text = element.getText();
System.out.println("WebElement Text Value :"+text);
	}
	
	public static void getTheAttribute(WebElement element,String value) {
String attribute = element.getAttribute(value);
System.out.println(attribute);
	}
	
	
	public static void mouseHovering(WebElement element) {
 a = new Actions(driver);
a.moveToElement(element).perform();
	}
	
	private void dragAndDrop(WebElement src,WebElement dsc) {
   a=new Actions(driver);
   a.dragAndDrop(src, dsc).perform();
	}
	
	public static void pressEnter() throws AWTException {
 r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static  void acceptTheAlert() {
Alert al = driver.switchTo().alert();
al.accept();
	}
	
	public void switchToFrame(WebElement refName) {
driver.switchTo().frame(refName);
	}
	
	private void javaScriptSendkeys(WebElement element,String value) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
	}
	
	public static  void getTheScreenshot(String location) throws IOException {
TakesScreenshot tk=(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File f = new File(location);
f.createNewFile();
FileUtils.copyFile(src, f);
	}
	
	private void switchToWindow(int index) {
Set<String> allId = driver.getWindowHandles();
List<String> l = new ArrayList();
l.addAll(allId);
driver.switchTo().window(l.get(index));
	}
	
	
	public static void impWait(int sec) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}	
	
//	
//	public static String getTheDataFromExcel(String loc,String sheet,int row,int cell) throws IOException {
//		File f = new File(loc);
//		
//		FileInputStream fim =  new FileInputStream(f);
//		
//		Workbook book = new XSSFWorkbook(fim);
//		
//		Sheet s = book.getSheet(sheet);
//		
//		Row r = s.getRow(row);
//		
//		Cell c = r.getCell(cell);
//		
//	   int type = c.getCellType();// to find the cell type ----type=1--> string , type=0--> number/date
//	   String data="";
//	   
//	   if (type==1) {// to convert the cell to string 
//		 data = c.getStringCellValue();
//		
//	}
//	   else if (DateUtil.isCellDateFormatted(c)) {// to identify the cell is date format
//		Date d = c.getDateCellValue(); // to convert the cell to date 
//		SimpleDateFormat sim = new SimpleDateFormat();
//		 data = sim.format(d);// to convert date to string
//		
//	}
//	   else {
//		double d = c.getNumericCellValue();// to convert cell to double
//		long l =(long)d; // double to long
//		 data = String.valueOf(l);// long to string
//		
//	}
//	   
//	 return data; // to get the date from the outsite the method 
//	   
//	}
//	
//	
//	public static void executeTime() {
//		Date d = new Date();
//		System.out.println(" Execution :"+d);
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
