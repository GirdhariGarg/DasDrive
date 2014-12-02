package searchbyfile;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class SBFTC_07{
	
	int row = 8;
	@Test
	public void testrun() throws IOException, InterruptedException{
		SearchByFile testbase = new SearchByFile();
		testbase.login(row);
		testbase.validate(row);
	}
	/*@BeforeClass
	public void testflag(){
		String testrunflag = testbase.xltcdata.getCellData(testbase.TDSheet, testbase.TDTrunflag, row);
		if(testrunflag == "N"){
			throw new SkipException("Skipping – This is not ready for testing ");
		}
	}
	@BeforeTest
	public void loadURL() {
		switch (testbase.Browser) {
		case "Firefox":
			driver = new FirefoxDriver();
			driver.get(testbase.baseurl);
			break;
		case "Chrome":
			driver = new ChromeDriver();
			driver.get(testbase.baseurl);
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			driver.get(testbase.baseurl);
			break;
		default:
			System.out.println("Invalid Browser name");
			}
		}
	@Test(priority = 0)
	void firsttest() throws IOException {
		testbase.login(row, driver); // Login user
		}
	
	@Test(priority = 1)
	public void validate() throws IOException {
		String testcaseid = testbase.xltcdata.getCellData(testbase.TDSheet, testbase.TDTcid, row);
		String expectedresult = testbase.xltcdata.getCellData(testbase.TDSheet, testbase.TDExpectedres, row);
		 //String testrunflag = testbase.xltcdata.getCellData(TDSheet, testbase.TDTrunflag, row);
		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult);
		String  spath = testbase.testscreenpath + "\\" + testbase.TDSheet + "\\" + testbase.testcaseid + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		FileUtils.copyFile(scrFile, new File(spath));
		testbase.xltcdata.setCellData(testbase.TDSheet, testbase.TDSspath, row, testbase.spath);
		
		Assert.assertEquals(driver.getPageSource().contains(testbase.expectedresult),true,""+ testbase.xltcdata.setCellData(testbase.TDSheet,testbase.TDResult, row, "Fail"));
		testbase.xltcdata.setCellData(testbase.TDSheet, testbase.TDResult, row,"Pass");
		System.out.println(testcaseid+ "is passed and expected result is"+ expectedresult);
	}
	*/

}