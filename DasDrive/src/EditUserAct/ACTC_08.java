package EditUserAct;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ACTC_08 {
	int row = 9;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserAct vaf = new EditUserAct();
		vaf.login(row);
		vaf.validate(row);
	}
}
