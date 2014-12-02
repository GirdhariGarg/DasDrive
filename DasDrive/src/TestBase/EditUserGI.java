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

public class EditUserGI extends BaseClass{


String para3,para4, para5, para6;
	String TDSheet = "EditUserGI";
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		
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
			
			case "UGTC_01": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			
			case "UGTC_02": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_03": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_04": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_05": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_06": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_07": // validate test case
				try{
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_08": // validate test case
				try{
					para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_09": // validate test case
				try{
					para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_10": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_11": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_12": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_13": // validate test case
				try{
				rm = new Random();
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				para4= parameter4;
				para5 = parameter5;
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter2);
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			
			case "UGTC_14": // validate test case
				try{
				rm = new Random();
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter2);
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			
			case "UGTC_15": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_16": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				//driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				//sdriver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_17": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_18": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_19": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				//driver.findElement(By.xpath(usersdatenmonth)).click();	
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_20": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				for(int i = 1;i<=15; i++){	
					driver.findElement(By.xpath(usersdatenmonth)).click();
					}
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_21": // validate test case
				try{
				driver.findElement(By.xpath(userseditb)).click();
				wblist = driver.findElements(By.xpath(usersrolelist));
				
				for(WebElement wb2: wblist){
					sl = new Select(wb2);
					sl.selectByVisibleText("dam-manager");
					System.out.println("dam manager selected");
				}
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			
			case "UGTC_22": // validate test case
				try{
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_23": // validate test case
				try{
				driver.findElement(By.xpath(userseditb)).click();
				driver.findElement(By.linkText(userseditcancel)).click();
				
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
			
			case "UGTC_24": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				//driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				//driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
				
				driver.findElement(By.xpath(userseditdate)).click();
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_25": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
			
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_26": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
			
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_27": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
			
				driver.findElement(By.xpath(usersdatepick)).click();
				driver.findElement(By.xpath(userseditsave)).click();
				
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
			
			case "UGTC_28": // validate test case
				try{
				para3 = parameter3+(int)(100 + Math.random()*899);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(userseditb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(userseditfullname)).clear();
				System.out.println("insite add user");
				driver.findElement(By.xpath(userseditfullname)).sendKeys(para3);
				driver.findElement(By.xpath(userseditpass)).sendKeys(parameter4);
				driver.findElement(By.xpath(userseditrepass)).sendKeys(parameter5);
			
				wblist = driver.findElements(By.xpath(userseditactive));
				for (WebElement wb3 : wblist){
					sl = new Select(wb3);
					sl.selectByVisibleText("N");
					System.out.println("change active status N");
				}
				driver.findElement(By.xpath(userseditsave)).click();
				driver.findElement(By.xpath(userseditb)).click();
				wblist = driver.findElements(By.xpath(userseditactive));
				for (WebElement wb3 : wblist){
					sl = new Select(wb3);
					sl.selectByVisibleText("Y");
					System.out.println("change active status Y");
				}
				
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
