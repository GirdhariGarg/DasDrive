package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import DriveTestCasesData.Xls_Reader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class VolumePermission extends BaseClass{
	Random rm,rm2;
	boolean evalue;
	public String TDSheet = "VolumePermission", para2, para3, para4, para5;
	
	
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		try{
			
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wb = driver.findElement(By.xpath(adminmenu));
		System.out.println("onn element ");
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(volumesubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");
		driver.findElement(By.xpath(veditbutton)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		switch (testrunflag) {
		case "y":
			System.out.println(testrunflag);
			System.out.println(spath);
			
			switch (testcaseid) {

			case "VEV_01": // validate test case
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				//driver.findElement(By.xpath(editvolpername)).click();
				//driver.findElement(By.xpath(savebprop)).click();
				
				
				Assert.assertEquals(driver.findElement(By.xpath(editvolperhead)).getText().contains(expectedresult), true);
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
			case "VEV_02": // validate test case
				rm = new Random();
				para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_03": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(10);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_04": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(100);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_05": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(100);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_06": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_07": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_08": // validate test case
				
			
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(parameter3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_09": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_10": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_11": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				//driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_12": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_13": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(1000);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_14": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(10);
				 para4 = parameter4+rm.nextInt(10);
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_15": // validate test case
				rm = new Random();
				 para3 = parameter3+rm.nextInt(10);
				 para4 = parameter4+rm.nextInt(10);
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
			case "VEV_16": // validate test case
				 rm = new Random();
				 para3 = parameter3+rm.nextInt(100);
				
				driver.findElement(By.xpath(editvolpertab)).click();
				driver.findElement(By.xpath(editvolperaddb)).click();
				driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
				driver.findElement(By.xpath(editvolperread)).click();
				driver.findElement(By.xpath(editvolperwrite)).click();
				driver.findElement(By.xpath(editvolperexecute)).click();
				driver.findElement(By.xpath(editvolperuser)).click();
				driver.findElement(By.xpath(editvolpersave)).click();
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
					case "VEV_17": // validate test case
						rm = new Random();
						para3 = parameter3+rm.nextInt(10);
						para4 = parameter4+rm.nextInt(10);
						 
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
					
					//Take a ScreenShots
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					
					Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					System.out.println("login successfully" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
					break;
					
					case "VEV_18": // validate test case
						rm = new Random();
						para3 = parameter3+rm.nextInt(10);
						para4 = parameter4+rm.nextInt(10);
						 
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_19": // validate test case
						rm = new Random();
						para3 = parameter3+rm.nextInt(10);
						para4 = parameter4+rm.nextInt(10);
						 
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_20": // validate test case
						rm = new Random();
						para3 = parameter3+rm.nextInt(10);
						para4 = parameter4+rm.nextInt(10);
						 
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_21": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						wb = driver.findElement(By.xpath(editvolpergroup));
						sl = new Select(wb);
						sl.selectByIndex(1);
						System.out.println("first value of group selected ");
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_22": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_23": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						
						wb = driver.findElement(By.xpath(editvolpergroup));
						wblist = wb.findElements(By.tagName("option"));
						sl = new Select(wb);
						for (WebElement wb:wblist){
							System.out.println("option"+wb.getText());
							wb.click();
						}
						
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_24": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_25": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						//driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_26": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						
						wblist = driver.findElements(By.xpath(editvolperuserbox));
						for (WebElement wb: wblist){
							System.out.println("select users");
							wb.click();
							
						}
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_27": // validate test case
						rm = new Random();
						para3 = parameter3+rm.nextInt(10);
						para4 = parameter4+rm.nextInt(10);
						 
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperdesc)).sendKeys(para4);
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_28": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_29": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolperclose)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_30": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolperaddb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpercross)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_31": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.findElement(By.xpath(editvolperedithead)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_32": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						//driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						//driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						///driver.findElement(By.xpath(editvolperexecute)).click();
						//driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_33": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						//driver.findElement(By.xpath(editvolperread)).click();
						//driver.findElement(By.xpath(editvolperwrite)).click();
						//driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_34": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolperclose)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_35": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpercross)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_36": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						evalue = driver.findElement(By.xpath(editvolperdelete)).isDisplayed();
						
						if(evalue == true){
							System.out.println("Deleting Volume Permission");
							driver.switchTo().alert().accept();
							
						}
						
						
						/*driver.findElement(By.xpath(editvolpereditb)).click();
						driver.findElement(By.xpath(editvolpername)).sendKeys(para3);
						driver.findElement(By.xpath(editvolperread)).click();
						driver.findElement(By.xpath(editvolperwrite)).click();
						driver.findElement(By.xpath(editvolperexecute)).click();
						driver.findElement(By.xpath(editvolperuser)).click();
						driver.findElement(By.xpath(editvolpersave)).click();*/
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_37": // validate test case
						rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						evalue = driver.findElement(By.xpath(editvolperdelete)).isDisplayed();
						
						if(evalue == true){
							System.out.println("Deleting Volume Permission and click on Ok button");
							driver.switchTo().alert().accept();
							
						}
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_38": // validate test case
						 rm = new Random();
						 para3 = parameter3+rm.nextInt(1000);
						
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.xpath(editvolpereditb)).click();
						evalue = driver.findElement(By.xpath(editvolperdelete)).isDisplayed();
						 if (evalue == true){
							 System.out.println("Clicking on cancel button");
							 driver.switchTo().alert().dismiss();
							 
						 }
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_39": // validate test case
						
						driver.findElement(By.xpath(editvolpertab)).click();
						wb = driver.findElement(By.xpath(editvolpernext));
						evalue = wb.isEnabled();
						
						if (wb.equals(true)){
							System.out.println("click on next button");
							wb.click();
						}
						else{
							System.out.println("Next button is disable");
						}
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_40": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						wb = driver.findElement(By.xpath(editvolperperv));
						evalue = wb.isEnabled();
						
						if (wb.equals(true)){
							System.out.println("click on Previous button");
							wb.click();
						}
						else{
							System.out.println("Previous button is disable");
						}
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_41": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						wb = driver.findElement(By.xpath(editvolperperv));
						evalue = wb.isEnabled();
						
						if (wb.equals(true)){
							System.out.println("click on Previous button");
							wb.click();
						}
						else{
							System.out.println("Previous button is disable");
						}
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_42": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolperidlink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_43": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolpernamelink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_44": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolperreadlink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_45": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolperwritelink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_46": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolperexecutelink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_47": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolpercreatedlink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
					case "VEV_48": // validate test case
						driver.findElement(By.xpath(editvolpertab)).click();
						driver.findElement(By.linkText(editvolpermodifiedlink)).click();
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
				
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid + "is Failed due to some reason and expected result is" + expectedresult);
			}
			scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// now save the screenshot to a file some place
			FileUtils.copyFile(scrFile, new File(spath));
			xltcdata.setCellData(TDSheet, TDSspath, row, spath);
			break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission in validation");
		}
		}
		catch(Throwable e){
			System.out.println("Failed testcase" + expectedresult);
			xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
		}
		//driver.quit();

	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
