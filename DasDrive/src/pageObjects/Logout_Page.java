package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import appModule.BaseClass;

public class Logout_Page extends BaseClass {
	public static WebElement wbelement = null;
	public Logout_Page(WebDriver driver2) {
		super(driver2);
	}
	
	public static WebElement settings_menu(){
		try{
			wbelement = driver.findElement(By.xpath(".//*[@id='mainpart']/div[2]/div[2]/button"));
			Log.info("Settings menu found on Page");
			return wbelement;
		}catch(Exception e){
			Log.error("pageObjects| Class Logout_Page| Method settings_menu| Exception desc"+e.getMessage());
			throw(e);
			}
	}
	
	public static WebElement logout_submenu(){
		try{
			wbelement  = driver.findElement(By.xpath(".//*[@id='mainpart']/div[2]/div[2]/ul/li[1]/a"));
			Log.info("Logout sub menu found under settings drop down");
			return wbelement;
		}catch(Exception e){
			Log.info("pageObject| Class Logout_page| Method logout_submenu| Exception desc"+e.getMessage());
			throw(e);
		}
		
	}

}
