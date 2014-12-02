package AddUser;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class AUT_29 {
	int row = 30;
	@Test
	public void runtest() throws IOException, InterruptedException{
		AddUser vaf = new AddUser();
		vaf.login(row);
		vaf.validate(row);
	}
}
