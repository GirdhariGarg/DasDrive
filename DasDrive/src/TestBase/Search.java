package TestBase;

import java.io.File;
import java.io.IOException;
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

public class Search extends BaseClass{
	
	String TDSheet = "Search", rvalue;
	boolean evalue;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		String parameter6 = xltcdata.getCellData(TDSheet, TDPara6, row);
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
			case "STC_01": // validate test case
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
			
			case "STC_02": // validate test case
				try{
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "STC_03": // validate test case
				try{
				 rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_04": // validate test case
				try{
				 rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(downloadb)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_05": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_06": // validate test case
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				 driver.findElement(By.xpath(filepreview)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "STC_07": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				 driver.findElement(By.xpath(bundle)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_08": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				 driver.findElement(By.xpath(bundle)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_09": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(openfile)).click();
				 driver.findElement(By.xpath(auditlog)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_10": // validate test case
				try{
				driver.close();
				driver = new FirefoxDriver();
				driver.get("https://drive.aleris.com:444");
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
				driver.findElement(By.xpath(loginbutton)).submit();
				
				driver.findElement(By.xpath(alerissearch)).click();
				System.out.println("onn element ");
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_11": // validate test case
				try{
				driver.close();
				driver = new FirefoxDriver();
				driver.get("https://drive.aleris.com:444");
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
				driver.findElement(By.xpath(loginbutton)).submit();
				
				
				driver.findElement(By.xpath(volumebox)).sendKeys("vol");
				
				
				driver.findElement(By.xpath(volumeselect)).click();
				driver.findElement(By.xpath(applyfilterb)).click();
				
				System.out.println("onn element ");
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_12": // validate test case
				try{
				driver.close();
				driver = new FirefoxDriver();
				driver.get("https://drive.aleris.com:444");
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter4);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
				driver.findElement(By.xpath(loginbutton)).submit();
				System.out.println("onn element ");
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "STC_13": // validate test case
				try{
				driver.close();
				driver = new FirefoxDriver();
				driver.get("https://drive.aleris.com:444");
				driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
				driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
				driver.findElement(By.xpath(loginbutton)).submit();
				System.out.println("onn element ");
				driver.findElement(By.xpath(bundle)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_14": // validate test case
				try{
				driver.findElement(By.xpath(browse)).click();
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_15": // validate test case
				try{
				driver.findElement(By.linkText(typecol)).click();
				rvalue = driver.findElement(By.xpath(typecolvalue)).getText();
				
				if (rvalue.contains("File")){
					System.out.println("file is exist"+ rvalue);
				}
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_16": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				 System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				
				String url = driver.getCurrentUrl()+"100";
				driver.get(url);
				rvalue = driver.switchTo().activeElement().getText();
				System.out.println("new url is "+ url + rvalue);
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains("Error"), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_17": // validate test case
				try{
					driver.findElement(By.xpath(namebox)).sendKeys(".pdf");
					driver.findElement(By.xpath(applyfilterb)).click();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.findElement(By.xpath(file)).click();
					driver.findElement(By.xpath(filepreview)).click();
					System.out.println(" exist");
					Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					}
					catch(Throwable e){
						System.out.println("Failed testcase" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
					}
			break;
			case "STC_18": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "STC_19": // validate test case
				try{
				rvalue = driver.findElement(By.xpath(file)).getText();
				System.out.println("file name is "+ rvalue);
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(auditlog)).click();
				driver.findElement(By.xpath(next)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				
			break;
			
			case "STC_20": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				rvalue = driver.findElement(By.xpath(gidate)).getText();
				driver.findElement(By.xpath(auditlog)).click();
				Assert.assertEquals(driver.findElement(By.xpath(auditdate)).getText().contains(rvalue), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_21": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				rvalue = driver.getCurrentUrl()+100;
				driver.get(rvalue);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_22": // validate test case
				
			break;
			case "STC_23": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_24": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				rvalue = driver.findElement(By.xpath(filerevdate)).getText();
				System.out.println(rvalue);
				evalue = rvalue.matches("(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d.*)");//mm//dd//yy
				System.out.println(evalue);
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_25": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				rvalue = driver.findElement(By.xpath(filerevsize)).getText();
				System.out.println(rvalue);
				evalue = rvalue.matches("\\d.*");//size
				System.out.println(evalue);
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_26": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(fileradio)).click();
				driver.findElement(By.xpath(filedownload)).click();
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_27": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(fileradio)).click();
				driver.findElement(By.xpath(filerestore)).click();
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_28": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.findElement(By.linkText(cancel)).click();
				Assert.assertEquals(driver.switchTo().activeElement().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			
			case "STC_29": // validate test case
				try{
				driver.findElement(By.linkText(parameter3)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.findElement(By.xpath(filerestore)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_30": // validate test case
				
			break;
			
			
			case "STC_31": // validate test case
		
			break;
			
			case "STC_32": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_33": // validate test case
				
				break;
				
			case "STC_34": // validate test case
				
				break;
			case "STC_35": // validate test case
				
				break;
				
			case "STC_36": // validate test case
				
				break;
				
			case "STC_37": // validate test case
				
				break;	
			case "STC_38": // validate test case
				
				break;
			case "STC_39": // validate test case
				
				break;
			case "STC_40": // validate test case
				
				break;
			case "STC_41": // validate test case
				try{
				driver.findElement(By.linkText(parameter3)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.findElement(By.xpath(filerestore)).click();
				driver.switchTo().alert().accept();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
			break;
			
			case "STC_42": // validate test case
				try{
				driver.findElement(By.xpath(file)).click();
				driver.findElement(By.xpath(filerevisiontab)).click();
				driver.findElement(By.xpath(filerestore)).click();
				driver.switchTo().alert().dismiss();
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
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
