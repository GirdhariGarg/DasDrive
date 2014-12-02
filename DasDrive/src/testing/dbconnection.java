package testing;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DriveTestCasesData.Xls_Reader;























import javax.sql.*;

public class dbconnection
{
	@Test
	
	public void dbtesting() throws SQLException, ClassNotFoundException{
		try{
		// Load mySQL JDBC driver.
		Class.forName("com.mysql.jdbc.driver").newInstance();

		// Prepare connection url.
		//String url = "jdbc:mysql://localhost:3306/dd_dev?";
		String url = "jdbc:mysql://localhost:3306/test?";
		System.out.println(url+"this is url");
		// Get connection to DB.
		//Connection con = DriverManager.getConnection(url, "dd_dev", "b0180d5c95153293c9d654974a8aaf94");
		Connection con = DriverManager.getConnection(url, "root", "girdhari12");
		System.out.println(con+"this is connection");
		// Create statement object which would be used in writing DDL and DML
		// SQL statement.
		Statement stmt = con.createStatement();

		// Send SQL SELECT statements to the database via the Statement.executeQuery
		// method which returns the requested information as rows of data in a
		// ResultSet object.
		System.out.println("connection establish");
		ResultSet result =  stmt.executeQuery("select * from fragments");

		System.out.println(result);
	}catch(Exception e){
		System.out.println(e);
	}

	}
	
	/*@Test
	public void tester() throws InterruptedException{
		 WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://drive.dasprivacy.com:444");
		Actions ac = new Actions(driver);
		//ac.contextClick();
		
		System.out.println("window handle "+ driver.getWindowHandle());
		System.out.println("window handle All "+ driver.getWindowHandles());
		System.out.println("hash code is "+ driver.hashCode());
		System.out.println("Class is "+ driver.getClass());
		ac.contextClick(driver.findElement(By.xpath(".//*[@id='UserLoginForm']/div[2]/div[2]/div/h1")));
	}*/
	
}

	/*String ORSheet = "Sheet1";
	String ORSrl = "Serial No.";
	String ORObjName = "Object Name";
	String OROid = "Object Identification";
	String ORType = "Object Type";
	
	Xls_Reader xlobjrep = new Xls_Reader(
		"C:\\Users\\CBTECH5\\workspace\\DAS Drive\\src\\DriveTestCasesData\\ObjectRepository.xlsx");
	
	String emailprop = xlobjrep.getCellData(ORSheet, OROid, 2);
	String passprop = xlobjrep.getCellData(ORSheet, OROid, 3);
	String loginbutton = xlobjrep.getCellData(ORSheet, OROid, 4);
    public static void main( String args[] ){

      // String to be scanned to find the pattern.
     // String line = "This order was placed for QT3000! OK?";
      String line = "12/31/2014 06:58 AM";//mm//dd//yy
     // String pattern = "(.*)(\\d+)(.*)";
      String pattern = "(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d.*)";//mm//dd//yy
      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      System.out.println("Found value: " + m);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
      } else {
         System.out.println("NO MATCH");
      }
    	//int i = (int)(100 + Math.random()*900);
    	//System.out.println(i+ "value");
    	
    	//System.out.println(Runtime.getRuntime().totalMemory());
    	boolean user = true;

    	if ( !user ) {
    	System.out.println("it's flase1");
    	}
    	else {
    	System.out.println("it's true1");
    	}
    	//boolean user = true;

    	if ( user == true) {
    	System.out.println("it's true2");
    	}
    	else {
    	System.out.println("it's false2");
    	} 
    
    	
   }*/
	
    //@Test
    //public void run() throws IOException{
    //	String ff = this.toString();
    //	System.out.println(ff);
   // }
    	/*FirefoxProfile profile = new FirefoxProfile();
    	
    	WebDriver  driver =  new FirefoxDriver();
   
    	//profile.setPreference("intl.accept_languages", "jp");
    	Cookie cookie = new Cookie("key","value");
    	
		driver.get("https://drive.dasprivacy.com:444");
		driver.manage().addCookie(cookie);
		Set<Cookie> allcookie = driver.manage().getCookies();
		for(Cookie loadcookie : allcookie){
			System.out.println(String.format( "name"+ loadcookie.getName(), "value"+ loadcookie.getValue(), "Expiry"+loadcookie.getExpiry()));
			driver.manage().deleteCookie(loadcookie);
			driver.manage().deleteAllCookies();
			driver.manage().deleteCookieNamed("_pk_id.8.4574");
		}*/
    	
    	
    	
    
    
   /* //Data Provider example start
    @DataProvider(name = "Authetication")
	public static Object[][] credetial(){
		return new Object[][]{{"testuser1", "girdhari"}, {"testuser", "passwordno"}};
    }
    @Test(dataProvider = "Authetication")
    public void login(String username, String pass){
    	System.out.println(username);
    	System.out.println(pass);
    	
    	
    }
    //Data Provider example finish
    
    //Explicit Wait Example Start
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
    
	}
	//Explicit Wait Example Finish

		//driver.findElement(By.xpath(emailprop)).sendKeys("girdharicom@gmail.com");
		//driver.findElement(By.xpath(passprop)).sendKeys("girdhari123");
		//driver.findElement(By.xpath(loginbutton)).submit();
		
		//driver.findElement(By.linkText("Admin")).click();
		//driver.findElement(By.linkText("Categories")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//String  wb = driver.findElement(By.linkText("Categories")).getCssValue("font-size");
		//System.out.println(wb);
		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		//FileUtils.copyFile(scrFile, new File("c://"));
		/*for(int i = 2;21>=i;i++){
		driver.findElement(By.xpath(".//*[@id='cont']/div[2]/table/tbody/tr["+i+"]/td[8]/div/a[2]")).click();
		driver.switchTo().alert().accept();
		}
		driver.manage().deleteAllCookies();
		
		
    	driver.close();
    }
    
}*/
/*@Test
public void tester(){
	//DesiredCapabilities capability= DesiredCapabilities.internetExplorer();
	//capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	System.setProperty("webdriver.ie.driver", "D:\\Only for Selenium use\\IE webdriver server\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://google.com");
	driver.quit();
}*/

/*@Test
public void tester2(){
	//WebDriver driver = new RemoteWebDriver(DesiredCapabilities.chrome());
	//DesiredCapabilities capability= DesiredCapabilities.chrome();
	//capability.setCapability(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, true);
	System.setProperty("webdriver.chrome.driver", "D:\\Only for Selenium use\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.quit();
}*/
	//image verification 
	/*int invalid = 0;
	int valid  = 0;
	int htvalid=0;
@SuppressWarnings({ "deprecation", "resource" })
@Test
public void imagetest() throws  IOException{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://codebase.co.in");
	List <WebElement> wblist =  driver.findElements(By.tagName("img"));
	System.out.println(wblist.size());
	for(WebElement wb1 : wblist ){
		System.out.println(wb1.getText());
		boolean ff = wb1.isDisplayed();
		
		System.out.println(ff);
		if(wb1.isDisplayed() == true){
			System.out.println("Image is display"+wb1.getText()+wb1.getLocation()+wb1.getAttribute("src"));
			HttpResponse response = new DefaultHttpClient().execute(new HttpGet(wb1.getAttribute("src")));
			if(response.getStatusLine().getStatusCode()!=200){
				htvalid++;
			}
			valid++;
		}else{
			System.out.println("Image is not  display"+wb1.getText()+wb1.getLocation()+wb1.getAttribute("src"));
			invalid++;
	}
		
		}
	System.out.println("No. of Missing images"+invalid);
	System.out.println("No. of visible images"+valid);
	System.out.println("No. of missing ht images"+htvalid);
}}*/
/*public void imagevalidate(WebElement wb) throws ClientProtocolException, IOException{
	
	@SuppressWarnings("deprecation")
	HttpResponse response = new DefaultHttpClient().execute(new HttpGet(wb.getAttribute("src")));
	if(response.getStatusLine().getStatusCode()!= 200){
		invalid++;
	}
	
}
	
}*/