package utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Logout_Page;
import appModule.BaseClass;

public class Utills {
	public static WebDriver driver = null;
	public static String sheet;
	public static void takescreenshot() throws IOException {
		try{
			File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(Constant.screenshotpath+"\\"+BaseClass.testcaseid+".jpg"));
		}catch(Exception e){
			Log.info("Class Utills| Method takescreenshot| Exception desc"+ e.getMessage());
		}
		
	}
	public static String getSheetName(String sTestCaseName){
		String value =  sTestCaseName;
		int posi = value.indexOf("_");
		value=value.substring(0, posi);
		
		try{
			switch(value){
			case "ATC":
				sheet = "AboutUs";
			break;
				
			default: System.out.println("No Test Sheet Found");
				}
		}catch(Exception e){
			Log.error("Class Utills| method getSheetName| Exception desc" + e.getMessage());
			throw(e);
			}
		return sheet;
		

	}
	public static String getTestCaseName(String Testname){
		try{
			String value = Testname;
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi= value.lastIndexOf(".");
			value = value.substring(posi+1);
			return value;
		}catch(Exception e){
			Log.error("Class Utills| Method getTestCaseName| Exception desc"+ e.getMessage());
			throw(e);
		}
	}

	public static WebDriver loadURL() {
		WebDriver driver = null;
		switch (Constant.Browser) {
		case "firefox":
			driver = new FirefoxDriver();
			Log.info("Browser launched successfully");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("20 Seconds implecit wait is applied");
			driver.get(Constant.baseurl);
			Log.info("URL launched successfully");
			break;
			
		case "Chrome":
			driver = new ChromeDriver();
			Log.info("Browser launched successfully");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("20 Seconds implecit wait is applied");
			driver.get(Constant.baseurl);
			Log.info("URL launched successfully");
			break;
			
		case "IE":
			driver = new InternetExplorerDriver();
			Log.info("Browser launched successfully");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("20 Seconds implecit wait is applied");
			driver.get(Constant.baseurl);
			Log.info("URL launched successfully");
			break;
			
		default:
			System.out.println("Invalid Browser name");
		}
		return driver;
	}
public static void mousehover(WebElement mainelement, String subelement ){
	try{
	Actions ac = new Actions(driver);
	ac.moveToElement(mainelement).perform();
	if(subelement.equals("Log Out")){
		ac.moveToElement(Logout_Page.logout_submenu());
		Log.info("Logout Sub Menu found Successfully");
		ac.click();
		ac.perform();
		Log.info("Click action is perform on logout button");
	}else{
		Log.error(subelement +" Not found in utility| Class Utills|Method mousehover|");
	}
	}catch(Exception e){
		Log.error("utility| Class Utills|Method mousehover| Exception desc"+e.getMessage());
	}
	
}

public static void wait_for_element(WebElement element){
	try{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Log.info("10 Seconds Explicit wait is applied");
	}catch(Exception e){
		Log.error("utility| Class Utills| Method wait_for_element| Exception desc"+e.getMessage());
	}
}
}
