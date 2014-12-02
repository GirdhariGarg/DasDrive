package documentBundle;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;


public class DBT_03 {
	int row = 4;
	@Test
	public void runtest() throws IOException, InterruptedException{
		DocumentBundle vaf = new DocumentBundle();
		vaf.login(row);
		vaf.validate(row);
	}
}
