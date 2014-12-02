package changepassword;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CP_08 {
	int row = 9;
	@Test
	public void runTest() throws IOException, InterruptedException{
		ChangePassword tdf = new ChangePassword();
		tdf.login(row);
		tdf.validate(row);
	}

}
