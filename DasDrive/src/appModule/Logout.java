package appModule;


import org.openqa.selenium.WebElement;

import pageObjects.Logout_Page;
import utility.Log;
import utility.Utills;


public class Logout {
	public static WebElement settings_wbelement;
	public static void execute(){
		try{
		
		Logout_Page.settings_menu().click();
		Log.info("Settings dropdown Clicked");
		
		Logout_Page.logout_submenu().click();
		Log.info("Logout button Clicked");
		
		}catch(Exception e){
			Log.info("Class Logout| Method execute| Exception desc" +e.getMessage());
		}
	}
}
