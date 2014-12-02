package changepassword;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CP_02 {
	int row = 3;
	@Test
	public void runTest() throws IOException, InterruptedException{
		ChangePassword tdf = new ChangePassword();
		tdf.login(row);
		tdf.validate(row);
	}

}
