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

public class ViewEditAccount extends BaseClass {

	String TDSheet = "ViewEditAccount", para3;
	
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
		WebElement wb = driver.findElement(By.xpath(adminmenu));
		System.out.println("onn element ");
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(VEsubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "VEAT_01": // validate test case
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
			break;
			
			
			case "VEAT_02": // validate test case
				driver.findElement(By.xpath(emailid)).getAttribute("readonly").contains("readonly");
				System.out.println("its readonly");
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
			break;
			
			case "VEAT_03": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_04": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_05": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_06": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_07": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_08": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				 wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter2);
				driver.findElement(By.xpath(repass)).sendKeys(parameter2);
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_09": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(pass)).sendKeys(parameter4);
				driver.findElement(By.xpath(repass)).sendKeys(parameter5);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
			break;
			
			case "VEAT_10": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				wb = driver.findElement(By.xpath(active));
				sl = new Select(wb);
				sl.selectByVisibleText("Y");
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_11": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				wb = driver.findElement(By.xpath(active));
				sl = new Select(wb);
				sl.selectByVisibleText("N");
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				
				wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				 ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(VEsubmenu)).click();
				
				wb = driver.findElement(By.xpath(active));
				sl = new Select(wb);
				sl.selectByVisibleText("Y");
				driver.findElement(By.xpath(save)).click();
				
			break;
			
			case "VEAT_12": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(10+Math.floor(Math.random()*90));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_13": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(10+Math.floor(Math.random()*90));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_14": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(100+Math.floor(Math.random()*900));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_15": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(10+Math.floor(Math.random()*90));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_16": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(1+Math.floor(Math.random()*9));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_17": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				
				driver.findElement(By.xpath(fullname)).sendKeys(parameter3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_18": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				para3 = parameter3+(int)(10+Math.floor(Math.random()*90));
				
				driver.findElement(By.xpath(fullname)).sendKeys(para3);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_19": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				driver.findElement(By.xpath(save)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_20": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(cancel)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "VEAT_21": // validate test case
				System.out.println("Start CASE "+ testcaseid);
				
				driver.findElement(By.xpath(date)).getAttribute("readonly").contains("readonly");
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
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
