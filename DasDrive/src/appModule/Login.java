package appModule;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.Login_Page;
import utility.Log;
import utility.Utills;
import DriveTestCasesData.Xls_Reader;

public class Login extends BaseClass{
	
	Login(WebDriver driver) {
		super(driver);
	}
	
	public static void execute() throws IOException{
		try{
			if(testrunflag.equalsIgnoreCase("y")){
				
				Login_Page.Emailid_Textbox().sendKeys(parameter1);
				Log.info("Email successfully entered");
				
				Login_Page.password_textbox().sendKeys(parameter2);
				Log.info("Password successfully entered");
				
				Login_Page.login_button().submit();
				Log.info("Clicked on Login Button");
				Utills.takescreenshot();
				
				}else{
				Log.info("Test does not have permission to execute");
				Utills.takescreenshot();
					}
		}catch(Exception e){
			Log.info("Class Login| Method execute| Exception Desc :"+e.getMessage());
			Utills.takescreenshot();
			}
	}

}
