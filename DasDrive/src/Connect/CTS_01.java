package Connect;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.*;

public class CTS_01 {
	int row = 2;
	@Test
	public void runTest() throws IOException, InterruptedException{
		ConnectBasefile tdf = new ConnectBasefile();
		tdf.login(row);
		tdf.validate(row);
	}

}
