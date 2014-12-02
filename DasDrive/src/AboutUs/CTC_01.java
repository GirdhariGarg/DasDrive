package AboutUs;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestBase.AboutUsBasefile;



public  class CTC_01{
	
	int row = 3;
	@Test
	public void runTest() throws IOException, InterruptedException {
		
		AboutUsBasefile.loadURL();
		AboutUsBasefile.validate(row);
		
		
	}
}