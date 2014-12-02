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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;



public class VolumeBasefile  extends BaseClass{
	String TDSheet = "Volumes";
	boolean evalue, evalue2, evalue3, evalue1;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath(adminmenu));
		System.out.println("onn element ");
		Actions ac = new Actions(driver);
		ac.moveToElement(wb).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(volumesubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after element ");
		
		switch (testrunflag) {
		case "y":
			System.out.println(testrunflag);
			System.out.println(spath);
			
			switch (testcaseid) {

			case "VST_01": // validate test case

				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_02": // validate test case
				driver.findElement(By.xpath(idprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_03": // validate test case
				driver.findElement(By.xpath(nameprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_04": // validate test case

				driver.findElement(By.xpath(softprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_05": // validate test case

				driver.findElement(By.xpath(hardprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_06": // validate test case

				driver.findElement(By.xpath(damprop)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				break;

			case "VST_07": // validate test case
				
				Assert.assertEquals(driver.getCurrentUrl().contains(expectedresult),true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;

			case "VST_08": // validate test case
				evalue = driver.findElement(By.xpath(vdelete)).isDisplayed();
				System.out.println(evalue);
				
				if (evalue == true){
					driver.findElement(By.xpath(vdelete)).click();
					driver.switchTo().alert().accept();
					
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
			case "VST_09": // validate test case
				 evalue = driver.findElement(By.xpath(vdelete)).isDisplayed();
				System.out.println(evalue);
				
				if (evalue == true){
					driver.findElement(By.xpath(vdelete)).click();
					driver.switchTo().alert().accept();
					
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vpass)).sendKeys(parameter2);
				driver.findElement(By.xpath(vpassdel)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
				
			case "VST_10": // validate test case
				 evalue = driver.findElement(By.xpath(vdelete)).isDisplayed();
				System.out.println(evalue);
				
				if (evalue == true){
					driver.findElement(By.xpath(vdelete)).click();
					driver.switchTo().alert().accept();
					
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(vpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(vpassdel)).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
			case "VST_11": // validate test case
				evalue = driver.findElement(By.xpath(vdelete)).isDisplayed();
				System.out.println(evalue);
				
				if (evalue == true){
					driver.findElement(By.xpath(vdelete)).click();
					driver.switchTo().alert().dismiss();
					
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
				
			case "VST_12": // validate test case
				evalue1 = driver.findElement(By.xpath(vprev)).isEnabled();
				System.out.println(evalue);
				
				if (evalue ==  true){
					driver.findElement(By.xpath(vprev)).click();
					System.out.println("previous is enable");
				}
				else {
					System.out.println("previous is disable");
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
			case "VST_13": // validate test case
				evalue2 = driver.findElement(By.xpath(vnext)).isEnabled();
				System.out.println(evalue);
				
				if (evalue == true){
					driver.findElement(By.xpath(vnext)).click();
					System.out.println("next is enable");
				}
				else {
					System.out.println("next is disable");
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
			case "VST_14": // validate test case
				evalue3 = driver.findElement(By.xpath(vdelete)).isDisplayed();
				System.out.println(evalue3);
				
				if (evalue3 == true){
					driver.findElement(By.xpath(vdelete)).click();
					driver.switchTo().alert().accept();
				}
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//driver.findElement(By.xpath(vpass)).sendKeys(parameter3);
				driver.findElement(By.xpath(vpasscancel)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
				
				break;
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid
						+ "is Failed due to some reason and expected result is"
						+ expectedresult);

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
