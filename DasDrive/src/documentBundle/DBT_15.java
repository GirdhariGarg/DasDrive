package documentBundle;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;


public class DBT_15 {
	int row = 16;
	@Test
	public void runtest() throws IOException, InterruptedException{
		DocumentBundle vaf = new DocumentBundle();
		vaf.login(row);
		vaf.validate(row);
	}
}
