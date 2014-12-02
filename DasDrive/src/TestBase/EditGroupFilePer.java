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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class EditGroupFilePer extends BaseClass{
	String TDSheet = "EditGroupFilePer";
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(adminmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(groupssubmenu)).click();
		System.out.println("after element ");
		driver.findElement(By.xpath(editgroupb)).click();

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "GEF_01": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_02": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Prev")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_03": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Next")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_04": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Prev")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_05": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("ID")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_06": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Read")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_07": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Write")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_08": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Execute")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			
			case "GEF_09": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Created")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEF_10": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(filepermissionstab)).click();
				driver.findElement(By.linkText("Modified")).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid + "is Failed due to some reason and expected result is" + expectedresult);
			}
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
