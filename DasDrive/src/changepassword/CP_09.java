package changepassword;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CP_09 {
	int row = 10;
	@Test
	public void runTest() throws IOException, InterruptedException{
		ChangePassword tdf = new ChangePassword();
		tdf.login(row);
		tdf.validate(row);
	}

}
