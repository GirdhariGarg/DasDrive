package EditUserGI;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.EditUserGI;

public class UGTC_26 {
	int row = 27;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserGI vaf = new EditUserGI();
		vaf.login(row);
		vaf.validate(row);
	}
}
