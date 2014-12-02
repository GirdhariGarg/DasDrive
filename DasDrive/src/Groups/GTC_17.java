package Groups;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GTC_17 {
	int row = 18;
	@Test
	public void runtest() throws IOException, InterruptedException{
		Groups vaf = new Groups();
		vaf.login(row);
		vaf.validate(row);
	}

}
