package Login;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;



public class DLP_06 {
	int row = 7;
	
	@Test
	public void runTest() throws InterruptedException, IOException{
	LoginBasefile tdf = new LoginBasefile();
	
	
	tdf.login(row);//Loading URL with row value in Test Data sheet
	tdf.validate(row);	

	}

	
}