package editgroupvolper;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEV_05 {
	int row = 6;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupVolPer vaf = new EditGroupVolPer();
		vaf.login(row);
		vaf.validate(row);
	}
}
