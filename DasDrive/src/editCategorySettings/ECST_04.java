package editCategorySettings;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ECST_04 {
	int row = 5;
	@Test
	public void runtest() throws IOException, InterruptedException{
		editcategorysettings vaf = new editcategorysettings();
		vaf.login(row);
		vaf.validate(row);
	}
}
