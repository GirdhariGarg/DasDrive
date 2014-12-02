package EditUserAct;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ACTC_05 {
	int row = 6;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserAct vaf = new EditUserAct();
		vaf.login(row);
		vaf.validate(row);
	}
}
