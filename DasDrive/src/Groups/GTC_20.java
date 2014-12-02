package Groups;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GTC_20 {
	int row = 21;
	@Test
	public void runtest() throws IOException, InterruptedException{
		Groups vaf = new Groups();
		vaf.login(row);
		vaf.validate(row);
	}

}
