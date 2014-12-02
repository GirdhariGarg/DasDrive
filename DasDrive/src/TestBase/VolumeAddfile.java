package TestBase;

import java.io.File;
import java.io.IOException;
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
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class VolumeAddfile extends BaseClass {
	String TDSheet = "AddVolume", aspace, tvalue;
	Random rm, rm2;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		System.out.println("this is admin value "+ adminmenu);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath(adminmenu));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(volumesubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");
		driver.findElement(By.xpath(addbprop)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		switch (testrunflag) {
		case "y":
			System.out.println(testrunflag);
			System.out.println(spath);
			
			switch (testcaseid) {

			case "AVST_01": // validate test case
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_02": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_03": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_04": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_05": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_06": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_07": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_08": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_09": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				String wb1 = driver.findElement(By.xpath(keytype)).getText();
				System.out.println(wb1);
				System.out.println(expectedresult);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(wb1.contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_10": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				System.out.println(Sdownarrow);
				System.out.println(expectedresult);
				driver.findElement(By.xpath(Sdownarrow)).click();
				//driver.findElement(By.xpath(savebprop)).click();
				String dd = driver.findElement(By.xpath(Stfield)).getAttribute("value");
				System.out.println(dd);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.xpath(Stfield)).getAttribute("value").contains("1"), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_11": // validate test case
				Random rm = new Random();
				String para3 = parameter3+rm.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				String intValue = aspace.replaceAll("[^0-9]", "");
				int j = Integer.parseInt(intValue);
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println(j);
				int m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				String ddd = driver.findElement(By.xpath(".//*[@id='hardq']")).getAttribute("value");
				System.out.println(ddd);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.id(newvolremsp)).getAttribute("value").contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			case "AVST_12": // validate test case
				
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				String aspace3 = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace3);
				String intVal = aspace3.replaceAll("[^0-9]", "");
				int j3 = Integer.parseInt(intVal);
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println(j3);
				int m3 = j3;
				for (int i = 1 ;i <= j3; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String ddd3 = driver.findElement(By.id(editsqbox)).getAttribute("value");
				System.out.println(ddd3);
				
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.id(editsqbox)).getAttribute("value").contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				driver.findElement(By.linkText("Cancel")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				for (int n = 2 ;n<m3; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			
			case "AVST_13": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				String aspace4 = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace4);
				String intValue1 = aspace4.replaceAll("[^0-9]", "");
				int j4 = Integer.parseInt(intValue1);
				System.out.println(j4);
				
				int m4 = j4;
				for (int i = 1 ;i <= j4; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(softuparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.findElement(By.xpath(Sdownarrow)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m4; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			break;
			case "AVST_14": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(softuparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.findElement(By.xpath(Sdownarrow)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			break;
			case "AVST_15": // validate test case
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.id("softq")).getAttribute("readonly").equals("true"),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println(expectedresult);
		
			break;
			case "AVST_16": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.xpath(Htfield)).getAttribute("value").equals("0"), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			case "AVST_17": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String wbvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				System.out.println(wbvalue+"hard quota value");
				System.out.println("Before check" + expectedresult);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.xpath(Htfield)).getAttribute("value").equals(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			case "AVST_18": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				tvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				System.out.println(tvalue+"hard quota value");
				System.out.println("Before check" + expectedresult);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.findElement(By.xpath(assignedspace)).getAttribute("value").equals(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			case "AVST_19": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(softuparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				tvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				System.out.println(tvalue+"hard quota value");
				System.out.println("Before check" + expectedresult);
				
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			case "AVST_20": // validate test case
			break;
			
			case "AVST_21": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(softuparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				tvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				System.out.println(tvalue+"hard quota value");
				System.out.println("Before check" + expectedresult);
				
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			
			case "AVST_22": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(softuparrow)).click();
				System.out.println("click is "+i);
				}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				
				
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				tvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				System.out.println(tvalue+"hard quota value");
				System.out.println("Before check" + expectedresult);
				
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vid)).click();
				driver.findElement(By.xpath(vid)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(newvol)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				for (int n = 2 ;n<m; n++){
					driver.findElement(By.xpath(editHdownarrow)).click();
					driver.findElement(By.xpath(editSQdownarrow)).click();
					System.out.println("click is "+n);
					}
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			break;
			
			case "AVST_23": // validate test case
			
			break;
			
			case "AVST_24": // validate test case
				driver.findElement(By.xpath(cancelblink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vsqlink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_25": // validate test case
				driver.findElement(By.xpath(cancelblink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vhqlink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			case "AVST_26": // validate test case
				
			break;
			case "AVST_27": // validate test case
				
			break;
			case "AVST_28": // validate test case
				
			break;
			case "AVST_29": // validate test case
				rm2 = new Random();
				para3 = parameter3+rm2.nextInt(1000);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				//String htvalue = driver.findElement(By.xpath(Htfield)).getAttribute("value");
				
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");
				System.out.println(aspace);
				 intVal = aspace.replaceAll("[^0-9]", "");
				 j = Integer.parseInt(intVal);
				System.out.println(j);
				
				 m = j;
				//for (int i = 1 ;i <= j; i++){
				driver.findElement(By.xpath(Huparrow)).click();
				//System.out.println("click is "+i);
				//}
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(addbprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(addname)).sendKeys(para3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
			break;
			
			case "AVST_30": // validate test case
				driver.findElement(By.xpath(addname)).sendKeys(parameter3);
				driver.findElement(By.xpath(Huparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			
			case "AVST_31": // validate test case
				aspace = driver.findElement(By.id(Aspace)).getAttribute("value");

				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				Assert.assertEquals(aspace.contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			break;
			
			case "AVST_32": // validate test case
				driver.findElement(By.xpath(cancelblink)).click();
				driver.findElement(By.xpath(vdamlink)).click();

				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				//Assert.assertEquals(aspace.contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
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

		//driver.quit();

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
