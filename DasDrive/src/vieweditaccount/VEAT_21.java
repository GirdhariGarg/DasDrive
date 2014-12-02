package vieweditaccount;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;



public class VEAT_21 {
	int row = 22;
	@Test
	public void runtest() throws IOException, InterruptedException{
		ViewEditAccount vaf = new ViewEditAccount();
		vaf.login(row);
		vaf.validate(row);
	}
}
