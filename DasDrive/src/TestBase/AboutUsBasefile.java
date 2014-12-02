package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;
import utility.Utills;

public class AboutUsBasefile extends BaseClass {

	public static String TDSheet = "AboutUs";

	@Test
	public static void validate(int row) throws IOException {
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";

		switch (testrunflag) {
		case "y":
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.findElement(By.xpath(".//*[@id='mainmenu']/ul/li[3]/a"))
					.click();
			System.out.println(testrunflag);

			switch (testcaseid) {
			case "ATC_01":
				driver.findElement(By.xpath(aboutusdrop)).click();
				/*
				 * scrFile = ((TakesScreenshot)
				 * driver).getScreenshotAs(OutputType.FILE); // now save the
				 * screenshot to a file some place FileUtils.copyFile(scrFile,
				 * new File(spath));
				 */
				Utills.takescreenshot();
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try {
					driver.manage().timeouts()
							.implicitlyWait(60, TimeUnit.SECONDS);
					Assert.assertEquals(
							driver.getCurrentUrl().contains(expectedresult),
							true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ " is passed and expected result is "
							+ expectedresult);
				} catch (Exception e) {
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				}
				break;
			case "CTC_01": // validate test case
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.xpath(contactusdrop)).click();
				scrFile = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				try {
					driver.manage().timeouts()
							.implicitlyWait(60, TimeUnit.SECONDS);
					Assert.assertEquals(
							driver.getCurrentUrl().contains(expectedresult),
							true);
					xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
					System.out.println(testcaseid
							+ "is passed and expected result is"
							+ expectedresult);
				} catch (Exception e) {
					System.out.println("Failed testcase" + expectedresult);
					xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				}
				break;
			default:
				xltcdata.setCellData(TDSheet, TDResult, row, "Fail");
				System.out
						.println(testcaseid
								+ " is Failed due to some reason and expected result is "
								+ expectedresult);
			}
			break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission");
		}
		System.out.println(testcaseid + "Test Case is finished");
		// driver.quit();

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
