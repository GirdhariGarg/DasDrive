package editgroup;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GE_03 {
	int row = 4;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroup vaf = new EditGroup();
		vaf.login(row);
		vaf.validate(row);
	}
}
