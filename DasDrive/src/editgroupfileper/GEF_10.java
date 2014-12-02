package editgroupfileper;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEF_10 {
	int row = 11;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupFilePer vaf = new EditGroupFilePer();
		vaf.login(row);
		vaf.validate(row);
	}
}
