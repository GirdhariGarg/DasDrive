package vieweditaccount;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;



public class VEAT_19 {
	int row = 20;
	@Test
	public void runtest() throws IOException, InterruptedException{
		ViewEditAccount vaf = new ViewEditAccount();
		vaf.login(row);
		vaf.validate(row);
	}
}
