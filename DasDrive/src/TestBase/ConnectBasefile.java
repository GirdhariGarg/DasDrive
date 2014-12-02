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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class ConnectBasefile extends BaseClass{
		 String TDSheet = "Connect";
		 
	@Test
	public void validate(int row) throws IOException, InterruptedException{
		
		switch(testrunflag){
		  	case "y":
		  		driver.findElement(By.xpath(connectmenu)).click();
		  		
		        switch(testcaseid){
					case "CTS_01":                //validate test case
						driver.findElement(By.linkText(windowsconnect)).click();
						scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					    // now save the screenshot to a file some place
					    FileUtils.copyFile(scrFile, new File(spath));
					    xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					    try{
					    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  	 		Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "text is not present");
			  	 		xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
			  	 		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult );
				        }
						catch(Throwable e){
							System.out.println("Failed testcase" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
						}
			  	 	break;
					case "CTS_02":                //validate test case
						try{
						driver.findElement(By.linkText(macconnect)).click();
						scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					    // now save the screenshot to a file some place
					    FileUtils.copyFile(scrFile, new File(spath));
					    xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  	 		Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "text is not present");
			  	 		xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
			  	 		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult );
				        }
						catch(Throwable e){
							System.out.println("Failed testcase" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
						}
			  	 	break;
					case "CTS_03":                //validate test case
						try{
							driver.findElement(By.linkText(iphoneconnect)).click();
							scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						    // now save the screenshot to a file some place
						    FileUtils.copyFile(scrFile, new File(spath));
						    xltcdata.setCellData(TDSheet, TDSspath, row, spath);
						    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  	 		Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "text is not present");
			  	 		System.out.println("login successfully"+expectedresult);
			  	 		xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
			  	 		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult );
				        }
						catch(Throwable e){
							System.out.println("Failed testcase" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
						}
			  	 	break;
					case "CTS_04":                //validate test case
						try{
						driver.findElement(By.linkText(androidconnect)).click();
						scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					    // now save the screenshot to a file some place
					    FileUtils.copyFile(scrFile, new File(spath));
					    xltcdata.setCellData(TDSheet, TDSspath, row, spath);
					    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  	 		Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "text is not present");
			  	 		xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
			  	 		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult );
				        }
						catch(Throwable e){
							System.out.println("Failed testcase" + expectedresult);
							xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
						}
			  	 	break;
			  	 	default:
			  	 			xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
			    	  		System.out.println(testcaseid+ "is Failed due to some reason and expected result is"+ expectedresult);
			  	 		
			  	 			}
					break;
				  	default:
		 			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission");
	      }
		System.out.println(testcaseid +" is finished");
		// driver.quit();
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
