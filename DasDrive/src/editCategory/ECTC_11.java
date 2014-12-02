package editCategory;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ECTC_11 {
	int row = 12;
	@Test
	public void runtest() throws IOException, InterruptedException{
		editcategory vaf = new editcategory();
		vaf.login(row);
		vaf.validate(row);
	}
}
