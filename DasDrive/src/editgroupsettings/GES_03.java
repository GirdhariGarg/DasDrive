package editgroupsettings;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GES_03 {
	int row = 4;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupSettings vaf = new EditGroupSettings();
		vaf.login(row);
		vaf.validate(row);
	}
}
