package editgroupfileper;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEF_04 {
	int row = 5;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupFilePer vaf = new EditGroupFilePer();
		vaf.login(row);
		vaf.validate(row);
	}
}
