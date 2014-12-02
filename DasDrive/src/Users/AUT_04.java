package Users;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.AddUser;




public class AUT_04 {
	int row = 5;
	@Test
	public void runtest() throws IOException, InterruptedException{
		AddUser vaf = new AddUser();
		vaf.login(row);
		vaf.validate(row);
	}
}
