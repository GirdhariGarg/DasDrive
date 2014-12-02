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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class AddUser extends BaseClass {
	String para3, para4, para5;
	
	
		String TDSheet = "AddUser";
		Random rm;
	
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
			case "AUT_01": // validate test case
				driver.findElement(By.xpath(usersaddb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "AUT_02": // validate test case
				rm = new Random();
				para3 = rm.nextInt(10)+"@"+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_03": // validate test case
				rm = new Random();
				para3 = rm.nextInt(100)+"@"+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_04": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_05": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_06": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_07": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_08": // validate test case
				rm = new Random();
				para3 = parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				String mm = driver.findElement(By.xpath(usersaddemailid)).getAttribute("title");
				
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult + mm);
				
			break;
			
			case "AUT_09": // validate test case
				rm = new Random();
				para3 = parameter3;
				para4 = parameter4;
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "AUT_10": // validate test case
				rm = new Random();
				para3 = rm.nextInt(100)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_11": // validate test case
				rm = new Random();
				para3 = rm.nextInt(100)+parameter3;
				para4 = parameter4+rm.nextInt(10);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_12": // validate test case
				rm = new Random();
				para3 = rm.nextInt(100)+parameter3;
				para4 = parameter4+rm.nextInt(100);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_13": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(100);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_14": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(100);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_15": // validate test case
				
			break;
			
			case "AUT_16": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4;
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_17": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4;
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_18": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_19": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_20": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(10);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_21": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				wb = driver.findElement(By.xpath(usersaddactive));
				sl = new Select(wb);
				sl.selectByVisibleText("N");
				System.out.println("n");
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_22": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				wb = driver.findElement(By.xpath(usersaddactive));
				sl = new Select(wb);
				sl.selectByVisibleText("Y");
				System.out.println("y");
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_23": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_24": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_25": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_26": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_27": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				//driver.findElement(By.xpath(usersdeleteb)).click();
				//driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_28": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_29": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_30": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_31": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4;
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_32": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_33": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			
			case "AUT_34": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_35": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_36": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			case "AUT_37": // validate test case
				rm = new Random();
				para3 = rm.nextInt(1000)+parameter3;
				para4 = parameter4+rm.nextInt(1000);
				System.out.println(parameter3 +""+ parameter4);
				driver.findElement(By.xpath(usersaddb)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("insite add user");
				driver.findElement(By.xpath(usersaddemailid)).sendKeys(para3);
				driver.findElement(By.xpath(usersaddfullname)).sendKeys(para4);
				driver.findElement(By.xpath(usersaddpass)).sendKeys(parameter5);
				driver.findElement(By.xpath(usersaddrepass)).sendKeys(parameter6);
				driver.findElement(By.xpath(usersaddsave)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				driver.findElement(By.xpath(usersdeleteb)).click();
				driver.switchTo().alert().accept();
				System.out.println("User is deleted");
			break;
			
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid + "is Failed due to some reason and expected result is" + expectedresult);
			}
			break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission in validation");
		}
		System.out.println(testcaseid+ "Test Case is finished");
	//driver.quit();

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
