package EditUserAul;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ALTC_07 {
	int row = 8;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserAul vaf = new EditUserAul();
		vaf.login(row);
		vaf.validate(row);
	}
}
