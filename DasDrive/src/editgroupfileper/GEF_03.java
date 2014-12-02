package editgroupfileper;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEF_03 {
	int row = 4;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupFilePer vaf = new EditGroupFilePer();
		vaf.login(row);
		vaf.validate(row);
	}
}
