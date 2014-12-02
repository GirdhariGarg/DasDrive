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

public class LoginBasefile extends BaseClass{
	boolean evalue;
	public String TDSheet = "Login";
	
	@Test
	public void validate(int row) throws IOException {
		
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		String parameter5 = xltcdata.getCellData(TDSheet, TDPara5, row);
		String parameter6 = xltcdata.getCellData(TDSheet, TDPara6, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE); // now save the screenshot to
													// a file some place
		FileUtils.copyFile(scrFile, new File(spath));
		xltcdata.setCellData(TDSheet, TDSspath, row, spath);

		switch (testrunflag) {
		case "y":
			System.out.println(testrunflag);
			switch (testcaseid) {

			case "DLP_01": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult),true);
				System.out.println("login successfully" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println(testcaseid + "is passed and expected result is" + expectedresult);
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
				break;

			case "DLP_02": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
			}
			catch(Throwable e){
				System.out.println("Failed testcase" + expectedresult);
				xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
			}
				break;

			case "DLP_03": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			case "DLP_04": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			case "DLP_05": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			case "DLP_06": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			case "DLP_07": // validate test case System.out.println(testcaseid);
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver.findElement(By.xpath(".//[@id='appFlash']/div")).getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			case "DLP_08": // validate test case
				try{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				evalue = driver
						.findElement(By.xpath(".//[@id='appFlash']/div"))
						.getText().contains(expectedresult);
				System.out.println(evalue);
				if (evalue = true) {
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				}
				}
				catch(Throwable e){
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row,"Fail");
				}
				break;

			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out.println(testcaseid
						+ "is Failed due to some reason and expected result is"
						+ expectedresult);

			}
			break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission");
		}

		
		//driver.quit();
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
