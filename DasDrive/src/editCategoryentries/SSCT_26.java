package editCategoryentries;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class SSCT_26 {
	int row = 27;
	@Test
	public void runtest() throws IOException, InterruptedException{
		editCategoryEntries vaf = new editCategoryEntries();
		vaf.login(row);
		vaf.validate(row);
	}
}
