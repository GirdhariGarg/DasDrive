package AboutUs;



import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.AboutUsBasefile;
import appModule.BaseClass;



public  class ATC_01{
	public int row = 2;
	@Test
	public void main() throws IOException{
		BaseClass.loadURL();
		//AboutUsBasefile.validate(row);
		
	}
}