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

public class editCategoryEntries extends BaseClass{

	String para3,para4, para5, para6;

	String TDSheet = "EditCategoryEntry";
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
		driver.findElement(By.linkText(categoriessubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "SSCT_01": // validate test case
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "SSCT_02": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
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
			
			case "SSCT_03": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
				Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "SSCT_04": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_05": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_06": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_07": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_08": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.xpath(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_09": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_11": // validate test case
				para3 = parameter3+(int)(100 + Math.random()*899);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_12": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_13": // validate test case
				//para3 = parameter3+rm.nextInt(100);
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(parameter3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_14": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_15": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(100 + Math.random()*899);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_16": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_17": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_18": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				//para4 = parameter4+rm.nextInt(100);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_19": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_20": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_21": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(100 + Math.random()*899);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_22": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				//para5 = parameter5+rm.nextInt(100);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_23": // validate test case
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_24": // validate test case
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriescloseb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_25": // validate test case
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriescrossb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_26": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_27": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_28": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_29": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			
			case "SSCT_30": // validate test case
				para3 = parameter3+(int)(10 + Math.random()*89);
				para4 = parameter4+(int)(10 + Math.random()*89);
				para5 = parameter5+(int)(10 + Math.random()*89);
				
				driver.findElement(By.xpath(editcategoryb)).click();
				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.findElement(By.xpath(entriescodetbox)).sendKeys(para4);
				driver.findElement(By.xpath(entriesdesctbox)).sendKeys(para5);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try{
					Assert.assertEquals(driver.findElement(By.xpath(entriesheading)).getText().contains(expectedresult), true);
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
			System.out.println("No Permission in validation");
		}
	//driver.quit();

	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

}
