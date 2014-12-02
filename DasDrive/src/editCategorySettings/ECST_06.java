package editCategorySettings;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ECST_06 {
	int row = 7;
	@Test
	public void runtest() throws IOException, InterruptedException{
		editcategorysettings vaf = new editcategorysettings();
		vaf.login(row);
		vaf.validate(row);
	}
}
