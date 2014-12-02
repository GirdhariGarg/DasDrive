package upload;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;




public class UTC_02 {
	int row = 3;
	@Test
	public void runtest() throws IOException, InterruptedException{
		Upload vaf = new Upload();
		vaf.login(row);
		vaf.validate(row);
	}
}
