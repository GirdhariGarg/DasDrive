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

public class EditGroupVolPer extends BaseClass{
	String TDSheet = "EditGroupVolPer";
	
	
	boolean evalue, evalue2;
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
			
			case "GEV_01": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				wblist = driver.findElements(By.xpath(availvolperbox));
				for(WebElement jj : wblist){
					System.out.println(jj.getText());
					c++;
				}
				System.out.println("volume permissions " + c);
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_02": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				wb = driver.findElement(By.xpath(availvolperbox));
				sl = new Select(wb);
				System.out.println(sl.getOptions());
				for(WebElement jj : sl.getOptions()){
					System.out.println(jj.getText());
					jj.click();
				}
				driver.findElement(By.xpath(volperrightbutton)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_03": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				wb = driver.findElement(By.xpath(currentvolperbox));
				sl = new Select(wb);
				evalue  = sl.getOptions().isEmpty();
				System.out.println(evalue);
				
				wb2 = driver.findElement(By.xpath(availvolperbox));
				sl2 = new Select(wb2);
				evalue2  = sl2.getOptions().isEmpty();
				System.out.println(evalue2);
				if (evalue && !evalue2){
					for (WebElement gm : sl2.getOptions()){
						System.out.println(gm.getText());
						gm.click();
						}
					driver.findElement(By.xpath(volperrightbutton)).click();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					for (WebElement gd : sl.getOptions()){
						System.out.println(gd.getText());
						gd.click();
						}
				driver.findElement(By.xpath(volperleftbutton)).click();
				}
				else{
					if(evalue2){
					for (WebElement gd : sl.getOptions()){
						System.out.println(gd.getText());
						gd.click();
						}
					driver.findElement(By.xpath(volperleftbutton)).click();
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
					
					else{
						System.out.println("No Volume Permission Exist");
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						xltcdata.setCellData(TDSheet, TDSspath, row, spath);
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
				}
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_04": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(volperrightbutton)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_05": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(volperleftbutton)).click();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_06": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(volperrightbutton)).click();
				driver.switchTo().alert().accept();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_07": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(volperrightbutton)).click();
				driver.switchTo().alert().dismiss();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "GEV_08": // validate test case
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(volumepermissionstab)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				wb = driver.findElement(By.xpath(currentvolperbox));
				sl = new Select(wb);
				evalue  = sl.getOptions().isEmpty();
				System.out.println(evalue);
				
				wb2 = driver.findElement(By.xpath(availvolperbox));
				sl2 = new Select(wb2);
				evalue2  = sl2.getOptions().isEmpty();
				System.out.println(evalue2);
				if (evalue && !evalue2){
					for (WebElement gm : sl2.getOptions()){
						System.out.println(gm.getText());
						gm.click();
						}
					driver.findElement(By.xpath(volperrightbutton)).click();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					for (WebElement gd : sl.getOptions()){
						System.out.println(gd.getText());
						gd.click();
						}
				driver.findElement(By.xpath(volperleftbutton)).click();
				}
				else{
					if(evalue2){
					for (WebElement gd : sl.getOptions()){
						System.out.println(gd.getText());
						gd.click();
						}
					driver.findElement(By.xpath(volperleftbutton)).click();
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
					
					else{
						System.out.println("No Volume Permission Exist");
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						xltcdata.setCellData(TDSheet, TDSspath, row, spath);
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
				}
				
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
