package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import appModule.BaseClass;

public class Login_Page extends BaseClass {
	public static WebElement wbelement;
	public Login_Page(WebDriver driver2) {
		super(driver2);
	}

	public static WebElement Emailid_Textbox(){
		try{
			wbelement  = driver.findElement(By.xpath(".//*[@id='UserUsername']"));
			return wbelement;
		}catch(Exception e){
			Log.error("Class Login_Page| Method Emailid_Textbox| Exception desc"+e.getMessage());
			throw(e);
			}
		}
	
	public static WebElement password_textbox(){
		try{
			wbelement = driver.findElement(By.xpath(".//*[@id='UserPassword']"));
			return wbelement;
		}catch(Exception e){
			Log.error("pageObject| Class Login_Page| Method password_textbox| Exception desc"+e.getMessage());
			throw(e);
		}
	}
	
	public static WebElement login_button(){
		try{
			wbelement = driver.findElement(By.xpath(".//*[@id='UserLoginForm']/div[2]/div[1]/div[3]/div/button"));
			return wbelement;
		}catch(Exception e){
			Log.error("pageObject| Class Login_Page| Method login_button| Exception desc"+ e.getMessage());
			throw(e);
		}	
	}
	
}
