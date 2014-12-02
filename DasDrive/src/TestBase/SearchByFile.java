package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import DriveTestCasesData.Xls_Reader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class SearchByFile extends BaseClass {
	
	String TDSheet = "SearchByFile";

	String[] para3;
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
		driver.findElement(By.xpath(dammanagermenu)).click();
		System.out.println("onn element ");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(searchsubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			case "SBFTC_01": // validate test case
				try{
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter3);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				
				driver.findElement(By.xpath(applyfilterb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(categoryinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_02": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				
				driver.findElement(By.xpath(applyfilterb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_03": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(namebox)).sendKeys(parameter4);
				driver.findElement(By.xpath(applyfilterb)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_04": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter4);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "SBFTC_05": // validate test case
				try{
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter3);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(namebox)).sendKeys(parameter4);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				} 
				catch(Throwable e){
					System.out.println("file does not exist in selected category");
				}
			break;
			
			case "SBFTC_06": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "SBFTC_07": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "SBFTC_08": // validate test case
				try{
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter3);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_09": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "SBFTC_10": // validate test case
				try{
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_11": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(removefilter)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_12": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(idlink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_13": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(volumelink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_14": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(namelink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			case "SBFTC_15": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(typelink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_16": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(sizelink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_17": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText(modifiedlink)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_18": // validate test case
				try{
				 para3 = parameter3.split(",");
				for(String dd: para3){
					driver.findElement(By.xpath(categorybox)).sendKeys(dd);
					driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				}
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(categoryinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "SBFTC_19": // validate test case
				try{
				 para3 = parameter3.split(",");
				for(String dd: para3){
					driver.findElement(By.xpath(volumebox)).sendKeys(dd);
					driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				}
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_20": // validate test case
				try{
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter3);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.findElement(By.xpath(categoryinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_21": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.findElement(By.xpath(file)).click();
				Assert.assertEquals(driver.findElement(By.xpath(volumeinfo)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_22": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb)).click();
		
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(file)).click();
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
			
			case "SBFTC_23": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb)).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(file)).click();
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
			
			case "SBFTC_24": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb)).click();
			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(file)).click();
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
			
			case "SBFTC_25": // validate test case
				try{
				driver.findElement(By.xpath(next)).click();
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
			
			case "SBFTC_26": // validate test case
				try{
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.findElement(By.linkText("Prev")).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_27": // validate test case
				try{
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					driver.findElement(By.linkText("1")).click();
					Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "SBFTC_28": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(categorybox)).sendKeys(parameter4);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(namebox)).sendKeys(parameter5);
				driver.findElement(By.xpath(applyfilterb));
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
			
			case "SBFTC_29": // validate test case
				try{
				driver.findElement(By.xpath(volumebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(volumebox)).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath(applyfilterb));
				
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
			
			case "SBFTC_30": // validate test case
				try{
				driver.findElement(By.xpath(namebox)).sendKeys(parameter3);
				driver.findElement(By.xpath(applyfilterb));
				
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
			
			case "SBFTC_31": // validate test case
				try{
				para3 = parameter3.split(",");
				for(String dd: para3){
				driver.findElement(By.xpath(categorybox)).sendKeys(dd);
				driver.findElement(By.xpath(categorybox)).sendKeys(Keys.ENTER);
				}
				driver.findElement(By.xpath(applyfilterb));
			
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
