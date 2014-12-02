package AddUser;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class AUT_07 {
	int row = 8;
	@Test
	public void runtest() throws IOException, InterruptedException{
		AddUser vaf = new AddUser();
		vaf.login(row);
		vaf.validate(row);
	}
}
