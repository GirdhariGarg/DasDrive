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

public class DamPluginBasefile extends BaseClass{

	public String TDSheet = "DamPlugin";
	boolean evalue;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath(adminmenu));
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

			case "VED_01": // validate test case
				driver.findElement(By.xpath(editdamtab)).click(); 
				evalue = driver.findElement(By.xpath(editdamcheck)).isSelected();
				System.out.println("if true than checked"+evalue);
				if(evalue == false ){
					driver.findElement(By.xpath(editdamcheck)).click();
					driver.findElement(By.xpath(savebprop)).click();
				}
				try{
				Assert.assertEquals(driver.findElement(By.xpath(editdamcheck)).isSelected(), true);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				//Take a ScreenShots
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				break;
			
				case "VED_02": // validate test case
				
					driver.findElement(By.xpath(editdamtab)).click(); 
					evalue = driver.findElement(By.xpath(editdamcheck)).isSelected();
					System.out.println("if true than checked"+evalue);
					if(evalue == true){
						driver.findElement(By.xpath(editdamcheck)).click();
						driver.findElement(By.xpath(savebprop)).click();
					}
						try{
						Assert.assertEquals(driver.findElement(By.xpath(editdamcheck)).isSelected(), false, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
						System.out.println("login successfully" + expectedresult);
						xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
						System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
						}
						catch(Throwable e){
							System.out.println("Failed testcase" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
						}
					//Take a ScreenShots
					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now save the screenshot to a file some place
					FileUtils.copyFile(scrFile, new File(spath));
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
