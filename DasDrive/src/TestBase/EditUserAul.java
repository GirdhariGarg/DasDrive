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

public class EditUserAul extends BaseClass{
	String TDSheet = "EditUserAul";
	
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
		wb = driver.findElement(By.xpath(adminmenu));
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
			
			case "ALTC_01": // validate test case
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "ALTC_02": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_03": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(desclink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_04": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(eventlink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_05": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(createdlink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_06": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(modellink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_07": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(valuelink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_08": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(emailaddresslink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_09": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.linkText(entitylink)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_10": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_11": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				//driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				//driver.findElement(By.cssSelector(editalsearch)).click();
				driver.findElement(By.linkText(previous)).click();
				System.out.println("search button clicked3");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_12": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_13": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_14": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_15": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_16": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_17": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.findElement(By.xpath(searchbox)).sendKeys(parameter3);
				
				driver.findElement(By.cssSelector(editalsearch)).click();
				System.out.println("search button clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			
			case "ALTC_18": // validate test case
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditaultab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
