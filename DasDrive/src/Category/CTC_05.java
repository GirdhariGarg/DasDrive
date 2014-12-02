package Category;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CTC_05 {
	int row = 6;
	@Test
	public void runTest() throws IOException, InterruptedException{
		Categories tdf = new Categories();
		tdf.login(row);
		tdf.validate(row);
	}

}
