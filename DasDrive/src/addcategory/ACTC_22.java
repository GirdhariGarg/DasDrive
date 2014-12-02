package addcategory;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class ACTC_22 {
	int row = 23;
	@Test
	public void runtest() throws IOException, InterruptedException{
		addcategories vaf = new addcategories();
		vaf.login(row);
		vaf.validate(row);
	}
}
