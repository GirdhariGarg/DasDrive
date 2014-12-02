package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Databasetest {
	static WebDriver driver;
	/*@Test
	public void dbtesting(){
		try{
		// Load Microsoft SQL Server JDBC driver.
		Class.forName("com.mysql.jdbc.driver");

		// Prepare connection url.
		String url = "jdbc:mysql://172.19.0.230:3306/dd_dev?";
		System.out.println(url+"this is url");
		// Get connection to DB.
		Connection con = DriverManager.getConnection(url, "dd_dev", "b0180d5c95153293c9d654974a8aaf94");
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
}*/
	/*public Databasetest(){
		System.out.println("this is constructor");
		
	}
	public void test(){
		System.out.println("this is test Method");
	}*/
	@Test
	public void main(){
	//Databasetest dd = new Databasetest();
	//dd.test();
	//System.out.println("this is method");
		driver =  new FirefoxDriver();
	driver.get("https://drive.dasprivacy.com");
		//Actions ac =new Actions(driver = new FirefoxDriver());
	
	WebDriverWait wait = new  WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Das"));
	System.out.println("this is condition");
	
	}

	
	
}
