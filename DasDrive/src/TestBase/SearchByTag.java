package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import DriveTestCasesData.Xls_Reader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class SearchByTag extends BaseClass{

	String TDSheet = "SearchByTag";
	int m;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(dammanagermenu)).click();
		System.out.println("onn element ");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(searchsubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");
		driver.findElement(By.linkText(searchbytag)).click();
		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			case "SBTTC_01": // validate test case
				try{
				driver.findElement(By.xpath(tagfield)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				wblist =  driver.findElements(By.cssSelector(tagslist));
				System.out.println(wblist.size());
				m = wblist.size();
				System.out.println(m);
				for(int i = 1; i<= m; i++){
					
					driver.findElement(By.xpath(tagpart1+i+tagpart2)).click();
					driver.findElement(By.xpath(tagfield)).click();
				}
				
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBTTC_02": // validate test case
				try{
				driver.findElement(By.xpath(tagfield)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				wblist =  driver.findElements(By.cssSelector(tagslist));
				System.out.println(wblist.size());
				
				driver.findElement(By.xpath(tagpart1+wblist.size()+tagpart2)).click();
				driver.findElement(By.xpath(tagfield)).click();
				
				
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
		
			
			case "SBTTC_03": // validate test case
				try{
				driver.findElement(By.xpath(tagfield)).sendKeys(parameter3);
				driver.findElement(By.xpath(tagfield)).sendKeys(Keys.ENTER);
				
				
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBTTC_04": // validate test case
				
				try{
				driver.findElement(By.xpath(tagfield)).sendKeys(parameter3);
				driver.findElement(By.xpath(tagfield)).sendKeys(Keys.ENTER);
				
				
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBTTC_05": // validate test case
				try{
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBTTC_06": // validate test case
				try{
				driver.findElement(By.xpath(tagfield)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				wblist =  driver.findElements(By.cssSelector(tagslist));
				System.out.println(wblist.size());
				 m = wblist.size();
				System.out.println(m);
				for(int i = 2; i<= m; i++){
					
					driver.findElement(By.xpath(tagpart1+i+tagpart2)).click();
					driver.findElement(By.xpath(tagfield)).click();
				}
				
				driver.findElement(By.xpath(searchicon)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("No. of file(s) :" + driver.findElements(By.cssSelector(filecount)).size());
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid + "is Failed due to some reason and expected result is" + expectedresult);
			}
			break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission in validation");
		}
	//driver.quit();

	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
