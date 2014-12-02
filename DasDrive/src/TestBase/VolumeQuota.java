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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class VolumeQuota extends BaseClass{
	Random rm,rm2;
	public String TDSheet = "VolumeQuota";
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wb = driver.findElement(By.xpath(adminmenu));
		System.out.println("onn element ");
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(volumesubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");
		driver.findElement(By.xpath(veditbutton)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		switch (testrunflag) {
		case "y":
			System.out.println(testrunflag);
			System.out.println(spath);
			
			switch (testcaseid) {

			case "VEQ_01": // validate test case
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				driver.findElement(By.xpath(edithuparrow)).click();
				driver.findElement(By.xpath(edithuparrow)).click();
				driver.findElement(By.xpath(editsuparrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				
				//Assert.assertEquals(driver.findElement(By.xpath(Stfield)).getAttribute("value").equals(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
				
				case "VEQ_02": // validate test case
				
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				
				driver.findElement(By.xpath(edithuparrow)).click();
				driver.findElement(By.xpath(editsuparrow)).click();
				driver.findElement(By.xpath(editSQdownarrow)).click();
				driver.findElement(By.xpath(savebprop)).click();
				
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;
			
				case "VEQ_03": // validate test case
					
					//Take a ScreenShots
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					
					driver.findElement(By.xpath(edithuparrow)).click();
					driver.findElement(By.xpath(savebprop)).click();
					
					Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					System.out.println("login successfully" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
					break;
			
					case "VEQ_04": // validate test case
					
					//Take a ScreenShots
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
					
					driver.findElement(By.xpath(edithdownarrow)).click();
					
					driver.findElement(By.xpath(savebprop)).click();
					
					Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
					System.out.println("login successfully" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
					break;
					case "VEQ_05": // validate test case
						
						driver.findElement(By.linkText(cancelblink)).click();
						driver.findElement(By.xpath(addbprop)).click();
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						//driver.findElement(By.xpath(edithdownarrow)).click();
						driver.findElement(By.xpath(savebprop)).click();
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						
						case "VEQ_06": // validate test case
						
						//Take a ScreenShots
						scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						// now save the screenshot to a file some place
						FileUtils.copyFile(scrFile, new File(spath));
						
						driver.findElement(By.xpath(editassignedspace)).getAttribute("value").contains("GB");
						//System.out.println("login successfully" + ss);
						driver.findElement(By.xpath(savebprop)).click();
						
						Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						break;
						case "VEQ_07": // validate test case
							
							//Take a ScreenShots
							scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							// now save the screenshot to a file some place
							FileUtils.copyFile(scrFile, new File(spath));
							
							driver.findElement(By.xpath(Aspace)).getAttribute("value").contains("GB");
							//System.out.println("login successfully" + ss);
							driver.findElement(By.xpath(savebprop)).click();
							
							Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
							System.out.println("login successfully" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
							System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
							break;
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid + "is Failed due to some reason and expected result is" + expectedresult);
			}
			scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// now save the screenshot to a file some place
			FileUtils.copyFile(scrFile, new File(spath));
			xltcdata.setCellData(TDSheet, TDSspath, row, spath);
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
