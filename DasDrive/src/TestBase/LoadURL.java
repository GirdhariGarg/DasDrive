package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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

import DriveTestCasesData.Xls_Reader;

	public class LoadURL {
		
	public static WebDriver driver;
	static int row;
	

	public static String TDSspath = "Screenshot Path";
	public static String TDResult = "Result";
	public static String TDTrunflag = "Test Run Flag";
	public static String TDExpectedres = "Expected Result";
	public static String TDTcid = "Test Case ID";
	public static String TDPara1 = "Parameter1";
	public static String TDPara2 = "Parameter2";
	public static String TDPara3 = "Parameter3";
	public static String TDPara4 = "Parameter4";
	public static String TDPara5 = "Parameter5";
	public static String TDPara6 = "Parameter6";
	
	public static String ORSheet = "Sheet1";
	public static String ORSrl = "Serial No.";
	public static String ORObjName = "Object Name";
	public static String OROid = "Object Identification";
	public static String ORType = "Object Type";

	public static String TRSheet = "Sheet1";
	public static String TRRunpara = "Run Parameter";
	public static String TRValue = "Value";

	public static String testcaseid, expectedresult, testrunflag, spath, parameter1,
			parameter2, parameter3, parameter4, parameter5, parameter6, para3, para4, para5, para6;
	
	boolean evalue, evalue1, evalue2, evalue3;
	public static File scrFile;
	Random rm = new Random();
	public static Select sl;
	public static WebElement wb;
	public static List<WebElement> wblist;
	
	public static  Xls_Reader xltcdata =  new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\TestData.xlsx");
	public static  Xls_Reader xltcrunpara =  new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\TestRunParameter.xlsx");
	public static  Xls_Reader xlobjrep = new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\ObjectRepository.xlsx");

	public static String emailprop = xlobjrep.getCellData(ORSheet, OROid, 2);
	public static String passprop = xlobjrep.getCellData(ORSheet, OROid, 3);
	public static String loginbutton = xlobjrep.getCellData(ORSheet, OROid, 4);
	public static String Browser = xltcrunpara.getCellData(TRSheet, TRValue, 4);
	public static String baseurl = xltcrunpara.getCellData(TRSheet, TRValue, 5);
	
	public static String testscreenpath = xltcrunpara.getCellData(TRSheet, TRValue, 7);
	
	public static String aboutusmenu = xlobjrep.getCellData(ORSheet, OROid, 10);
	public static String aboutusdrop = xlobjrep.getCellData(ORSheet, OROid, 11);
	public static String contactusdrop = xlobjrep.getCellData(ORSheet, OROid, 12);
	
	public static String adminmenu = xlobjrep.getCellData(ORSheet, OROid, 13);
	public static String categoriessubmenu = xlobjrep.getCellData(ORSheet, OROid, 128);
	public static String idlink = xlobjrep.getCellData(ORSheet, OROid, 129);
	public static String addcategoryb = xlobjrep.getCellData(ORSheet, OROid, 139);
	public static String titletbox = xlobjrep.getCellData(ORSheet, OROid, 140);
	public static String cattypedd = xlobjrep.getCellData(ORSheet, OROid, 141);
	public static String catdesctbox = xlobjrep.getCellData(ORSheet, OROid, 142);
	public static String requiredckbox = xlobjrep.getCellData(ORSheet, OROid, 143);
	public static String userid = xlobjrep.getCellData(ORSheet, OROid, 144);
	public static String savebcss = xlobjrep.getCellData(ORSheet, OROid, 145);
	public static String cancellink = xlobjrep.getCellData(ORSheet, OROid, 42);
	public static String errormessage = xlobjrep.getCellData(ORSheet, OROid, 224);
	public static String successmessage = xlobjrep.getCellData(ORSheet, OROid, 225);
	public static String userssubmenu = xlobjrep.getCellData(ORSheet, OROid, 77);
	public static String usersaddpass = xlobjrep.getCellData(ORSheet, OROid, 86);
	public static String usersaddrepass = xlobjrep.getCellData(ORSheet, OROid, 87);
	public static String usersaddsave = xlobjrep.getCellData(ORSheet, OROid, 88);
	public static String usersaddb = xlobjrep.getCellData(ORSheet, OROid, 92);
	public static String usersaddemailid = xlobjrep.getCellData(ORSheet, OROid, 93);
	public static String usersaddfullname = xlobjrep.getCellData(ORSheet, OROid, 94);
	public static String usersIDlink = xlobjrep.getCellData(ORSheet, OROid, 70);
	public static String usersdeleteb = xlobjrep.getCellData(ORSheet, OROid, 89);
	public static String usersaddactive = xlobjrep.getCellData(ORSheet, OROid, 90);
	

	public static WebDriver loadURL() {
		
		switch (Browser) {
		
		case "Firefox":
			driver = new FirefoxDriver();
			driver.get(baseurl);
			break;
		case "Chrome":
			driver = new ChromeDriver();
			driver.get(baseurl);
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			driver.get(baseurl);
			break;
		default:
			System.out.println("Invalid Browser name");
		}
		return driver;
	}
	
	public void login(int row ) throws IOException {
		String TDSheet = "Login";
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		parameter1 = xltcdata.getCellData(TDSheet, TDPara1, row);
		parameter2 = xltcdata.getCellData(TDSheet, TDPara2, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
	
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";

		switch (testrunflag) {
		case "y":
			System.out.println(testcaseid+ "Test Case is started");
			loadURL();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
			driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
			driver.findElement(By.xpath(loginbutton)).submit();
			System.out.println(TDSheet);
		break;
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission");
		}
		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		FileUtils.copyFile(scrFile, new File(spath));
		xltcdata.setCellData(TDSheet, TDSspath, row, spath);

	}
	
	}
