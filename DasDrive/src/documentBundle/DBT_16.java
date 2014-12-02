package documentBundle;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;


public class DBT_16 {
	int row = 17;
	@Test
	public void runtest() throws IOException, InterruptedException{
		DocumentBundle vaf = new DocumentBundle();
		vaf.login(row);
		vaf.validate(row);
	}
}
