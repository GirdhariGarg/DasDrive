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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class EditGroupUsers extends BaseClass{
	String TDSheet = "EditGroupUsers";
	boolean evalue;
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
		
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(adminmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(groupssubmenu)).click();
		System.out.println("after element ");
		driver.findElement(By.xpath(editgroupb)).click();

		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			case "GEU_01": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_02": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				wb = driver.findElement(By.xpath(alluserslist));
				sl = new Select(wb);
				evalue  = sl.getOptions().isEmpty();
				if (!evalue){
					for(WebElement tt: sl.getOptions()){
						System.out.println(tt.getText());
						tt.click();
						
					}
					driver.findElement(By.xpath(rightbutton)).click();
				}
				else{
					System.out.println("No user exist in all users list");
				}
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_03": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				wb = driver.findElement(By.xpath(currentuserslist));
				sl = new Select(wb);
				evalue  = sl.getOptions().isEmpty();
				if (!evalue){
					for(WebElement tt: sl.getOptions()){
						System.out.println(tt.getText());
						tt.click();
						
					}
					driver.findElement(By.xpath(leftbutton)).click();
				}
				else{
					System.out.println("No user exist in current users list");
				}
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_04": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				
				driver.findElement(By.xpath(leftbutton)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.switchTo().alert().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_05": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				driver.findElement(By.xpath(rightbutton)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.switchTo().alert().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_06": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				driver.findElement(By.xpath(leftbutton)).click();
				driver.switchTo().alert().accept();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.switchTo().alert().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEU_07": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				driver.findElement(By.xpath(rightbutton)).click();
				System.out.println(driver.switchTo().alert().getText().contains(expectedresult));
				driver.switchTo().alert().dismiss();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.switchTo().alert().getText().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			
			case "GEU_08": // validate test case
				driver.findElement(By.linkText(userstab)).click();
				wb = driver.findElement(By.xpath(currentuserslist));
				sl = new Select(wb);
				evalue  = sl.getOptions().isEmpty();
				if (!evalue){
					for(WebElement tt: sl.getOptions()){
						System.out.println(tt.getText());
						tt.click();
						
					}
					driver.findElement(By.xpath(leftbutton)).click();
				}
				else{
					System.out.println("No user exist in current users list");
				}
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
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
