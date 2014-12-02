package editgroupvolper;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEV_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupVolPer vaf = new EditGroupVolPer();
		vaf.login(row);
		vaf.validate(row);
	}
}
