package Groups;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GTC_11 {
	int row = 12;
	@Test
	public void runtest() throws IOException, InterruptedException{
		Groups vaf = new Groups();
		vaf.login(row);
		vaf.validate(row);
	}
}
