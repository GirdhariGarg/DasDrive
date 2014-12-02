package EditUserRL;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class RLTC_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditUserRL vaf = new EditUserRL();
		vaf.login(row);
		vaf.validate(row);
	}
}
