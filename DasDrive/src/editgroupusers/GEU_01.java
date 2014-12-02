package editgroupusers;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class GEU_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditGroupUsers vaf = new EditGroupUsers();
		vaf.login(row);
		vaf.validate(row);
	}
}
