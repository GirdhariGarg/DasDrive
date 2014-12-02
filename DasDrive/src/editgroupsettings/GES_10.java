package editgroupsettings;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GES_10 {
	int row = 11;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupSettings vaf = new EditGroupSettings();
		vaf.login(row);
		vaf.validate(row);
	}
}
