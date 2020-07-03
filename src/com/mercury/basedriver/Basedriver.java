package com.mercury.basedriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basedriver {
	public static WebDriver driver = null;

	@BeforeTest
	public void lunchurl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		Thread.sleep(2000);

		System.out.println("Opened browser and mercury site.");
		Reporter.log("Opened browser and mercury site.");
		
		String expectedvalue = driver.findElement(By.xpath(".//*[text()='REGISTER']")).getText();
		Assert.assertEquals("REGISTER", expectedvalue);
		
		System.out.println("Validation: Website navigation succesfull.");

	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();

		System.out.println("Closed browser and mercury site.");
		Reporter.log("Closed browser and mercury site.");

	}

	// test data location

	public static String getdata(String testcasename, int rownumber, int cellnumber) throws IOException {
		File path = new File(".//testdata//Mercury_ExcelData.xlsx");
		FileInputStream src = new FileInputStream(path);// this specifies the path of the test data

		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet ws = wb.getSheet(testcasename);

		String data = ws.getRow(rownumber).getCell(cellnumber).getStringCellValue();// this retrieves the actual info
																					// and sends to the called methods
		return data;

	}

}
