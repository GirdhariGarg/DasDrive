package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class addcategories extends BaseClass {

	String TDSheet = "AddCategory";
	boolean evalue;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		String para3;
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
		driver.findElement(By.linkText(categoriessubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "ACTC_01": // validate test case
				
				driver.findElement(By.linkText(addcategoryb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "");
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_02": // validate test case
				
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				evalue  = (driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult));
				System.out.println(evalue);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true, "");
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "ACTC_03": // validate test case
				para3 = parameter3+(int)(1 + Math.random()*8);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				 evalue  = (driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult));
				System.out.println(evalue);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_04": // validate test case
				para3 = parameter3+(int)(1 + Math.random()*8);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_05": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath); 
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_06": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_07": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_08": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_09": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_10": // validate test case
				para3 = parameter3;
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				//Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "ACTC_11": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_12": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(errormessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_13": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_14": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult),true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_15": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_16": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_17": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_18": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_19": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_20": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.linkText(cancellink)).click();
				
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
			
			case "ACTC_21": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				//driver.switchTo().alert().accept();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
			break;
			
			case "ACTC_22": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.xpath(requiredckbox)).click();
				
				driver.findElement(By.cssSelector(savebcss)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_23": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				//driver.switchTo().alert().accept();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "ACTC_24": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*989);
				System.out.println(para3);
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				driver.close();
				loadURL();
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter6);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
				driver.findElement(By.xpath(loginbutton)).submit();
				
				wb = driver.findElement(By.xpath(adminmenu));
				System.out.println("onn element ");
				ac = new Actions(driver);
				ac.moveToElement(wb).build().perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(categoriessubmenu)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("after element ");
				
				driver.findElement(By.linkText(addcategoryb)).click();
				driver.findElement(By.xpath(userid)).click();
				driver.findElement(By.xpath(titletbox)).sendKeys(para3);
				driver.findElement(By.xpath(catdesctbox)).sendKeys(parameter4);
				wb = driver.findElement(By.xpath(cattypedd));
				sl = new Select(wb);
				sl.selectByVisibleText(parameter5);
				driver.findElement(By.cssSelector(savebcss)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(successmessage)).getText().contains(expectedresult), true);
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
		System.out.println(testcaseid+ "Test Case is finished");
	//driver.quit();

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
