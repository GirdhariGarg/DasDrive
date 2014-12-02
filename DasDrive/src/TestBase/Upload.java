package TestBase;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import DriveTestCasesData.Xls_Reader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appModule.BaseClass;

public class Upload extends BaseClass{

	String TDSheet = "Upload", mvalue, para3, req;
	List<WebElement> wblist2;
	Actions ac;
	@Test
	public void validate(int row) throws IOException, InterruptedException {
		
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
		String parameter3 = xltcdata.getCellData(TDSheet, TDPara3, row);
		String parameter4 = xltcdata.getCellData(TDSheet, TDPara4, row);
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//removecategroy();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(dammanagermenu)).click();
		System.out.println("onn element ");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(uploadsubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("after elemant");
		switch (testrunflag) {
		case "y":
			switch (testcaseid) {
			
			
			case "UTC_01": // validate test case
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				Assert.assertEquals(driver.getPageSource().contains(expectedresult), true, "" + xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt" + expectedresult);
			break;
			
			case "UTC_02": // validate test case
				//String category = topcategory();
				//System.out.println("after element " + category);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElement(By.xpath(categoryfield)).sendKeys(category);
				driver.findElement(By.xpath(categoryfield)).sendKeys("girdhari65");
				driver.findElement(By.xpath(categoryfield)).sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.name(addfilesb)).click();
				ProcessBuilder pb = new ProcessBuilder(parameter3, parameter4);
				pb.start();
				WebDriverWait wait = new WebDriverWait(driver, 15);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fileupload']/table/tbody/tr/td[5]/button")));
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fileupload']/table/tbody/tr/td[5]/button")));
				driver.findElement(By.xpath(".//*[@id='fileupload']/div[1]/div[1]/button[1]")).click();
				
				WebDriverWait wait2 = new WebDriverWait(driver, 30);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(uploaddeleteb)));
				
				driver.findElement(By.xpath(submit)).click();// submit button
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
				//String tttt = driver.switchTo().alert().getText();
				//System.out.println(tttt);

				//Assert.assertEquals(driver.getPageSource().contains(expectedresult), true,""+ xltcdata.setCellData(TDSheet, TDResult, row,"Fail"));
				xltcdata.setCellData(TDSheet, TDResult, row, "Pass");
				System.out.println("TestCase Passed With Expected Reuslt " + expectedresult);
				break;
			
			case "UTC_03": // validate test case
				//topcategory();
				//driver.findElement(By.name(addfilesb)).click();
				
				System.out.println(driver.findElement(By.xpath(".//*[@id='s2id_subcategoery']/ul/li/input")).getCssValue("font_size"));
				FirefoxProfile profile  = new FirefoxProfile();
				profile.setEnableNativeEvents(true);
				driver.findElement(By.xpath(".//*[@id='s2id_subcategoery']/ul/li/input")).click();
				wb = driver.findElement(By.xpath("html/body/div[6]/ul"));
				ac = new Actions(driver);
				ac.dragAndDropBy(wb, 50, 100).build().perform();
				
				scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now save the screenshot to a file some place
				FileUtils.copyFile(scrFile, new File(spath));
				xltcdata.setCellData(TDSheet, TDSspath, row, spath);
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
	//driver.quit();

	}

	public void removecategroy() {
		
		driver.findElement(By.xpath(adminmenu)).click();
		driver.findElement(By.linkText(categorysubmenu)).click();
		wblist2 = driver.findElement(By.xpath(".//*[@id='cont']/div[2]/div")).findElements(By.tagName("li"));
		System.out.println(wblist2.size());
		wblist = driver.findElements(By.tagName(rowcount));
		System.out.println(wblist.size());
		int m = wblist2.size()-2;
		
		if (m == 0){
			findyes();
		}
		else{
		for(int j = 2; m>=j; j++){
		findyes();
		driver.findElement(By.linkText(""+j)).click();
			}
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(dammanagermenu)).click();
		System.out.println("onn element ");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText(uploadsubmenu)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	public String topcategory(){
		para3 = "girdhari"+(int)(10 + Math.random()*899);
		
		driver.findElement(By.xpath(adminmenu)).click();
		driver.findElement(By.linkText(categorysubmenu)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		mvalue = driver.findElement(By.xpath(cateditb)).getText();
		System.out.println(mvalue);

		driver.findElement(By.xpath(reqeditpart1+"2"+reqeditpart2)).click();
		
				wb = driver.findElement(By.xpath(categorytype));
				sl= new Select(wb);
				sl.selectByVisibleText("Top Level Single");

				driver.findElement(By.linkText(entriestablink)).click();
				driver.findElement(By.linkText(entriesaddlink)).click();
				driver.findElement(By.xpath(entriesnametbox)).sendKeys(para3);
				driver.manage().window().maximize();
				driver.findElement(By.xpath(entriessaveb)).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector(categorysave)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(dammanagermenu)).click();
				System.out.println("Dam Manager Clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.linkText(uploadsubmenu)).click();
				System.out.println("Upload Submenu Clicked");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				return para3;
				
	}

	public void findyes(){
		for(int i = 2; i<=wblist.size(); i++){
			req = driver.findElement(By.xpath(reqpart1+i+reqpart2)).getText();
			System.out.println(req);
			if (req.contains("Yes")){
				driver.findElement(By.xpath(reqeditpart1+i+reqeditpart2)).click();
				if(driver.findElement(By.xpath(categorytype)).getText().contains("Top Level Single")){
					 wb = driver.findElement(By.xpath(categorytype));
					 sl= new Select(wb);
					 sl.selectByVisibleText("Multiple");
					 driver.findElement(By.xpath(requirecheck)).click();
				}
			else{
				driver.findElement(By.xpath(requirecheck)).click();
				}
				driver.findElement(By.cssSelector(categorysave)).click();
				}
			}
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
	
	
}
