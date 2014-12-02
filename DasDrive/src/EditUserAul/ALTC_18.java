package EditUserAul;

import java.io.IOException;
import org.testng.annotations.Test;

import TestBase.*;
public class ALTC_18 {
	int row =19;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserAul vaf = new EditUserAul();
		vaf.login(row);
		vaf.validate(row);
	}
}
