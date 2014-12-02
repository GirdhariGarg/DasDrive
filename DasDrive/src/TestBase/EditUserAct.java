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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class EditUserAct extends BaseClass{

	String TDSheet = "EditUserAct";
	
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		String parameter6 = xltcdata.getCellData(TDSheet, TDPara5, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath(adminmenu));
		System.out.println("onn element ");
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(userssubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "ACTC_01": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(desclink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_02": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(eventlink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_03": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(createdlink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			
			case "ACTC_04": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(modellink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_05": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(usernamelink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_06": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.linkText(useriplink)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_07": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				
				driver.findElement(By.cssSelector(editalsearchb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_08": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				driver.findElement(By.linkText(searchbox)).sendKeys(parameter3);
				driver.findElement(By.cssSelector(editalsearchb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_09": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditacttab)).click();
				driver.findElement(By.linkText(searchbox)).sendKeys(parameter3);
				driver.findElement(By.cssSelector(editalsearchb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true);
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
