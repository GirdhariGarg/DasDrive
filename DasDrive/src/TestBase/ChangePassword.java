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

public class ChangePassword extends BaseClass {

	String TDSheet = "ChangePassword";
	
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		
		
		
		wb  = driver.findElement(By.xpath(settings));
		driver.findElement(By.xpath(settings)).click();
		System.out.println("Settings dd clicked");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(changepasslink)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "CP_01": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_02": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
			case "CP_03": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
			case "CP_04": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_05": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_06": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_07": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_08": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_09": // validate test case
				
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
			case "CP_10": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
			case "CP_11": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
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
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_12": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_13": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_14": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_15": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_16": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(loginbutton)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(settings)).click();
				System.out.println("Settings dd clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(changepasslink)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(submitb)).click();
			break;
			
			case "CP_17": // validate test case
				driver.findElement(By.xpath(oldpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(newpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(conpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(submitb)).click();
				
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
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
