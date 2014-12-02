package Users;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.AddUser;




public class AUT_09 {
	int row = 10;
	@Test
	public void runtest() throws IOException, InterruptedException{
		AddUser vaf = new AddUser();
		vaf.login(row);
		vaf.validate(row);
	}
}
