package Category;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CTC_03 {
	int row = 4;
	@Test
	public void runTest() throws IOException, InterruptedException{
		Categories tdf = new Categories();
		tdf.login(row);
		tdf.validate(row);
	}

}
