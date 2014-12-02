package DamPlugin;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.DamPluginBasefile;


public class VED_02 {
	int row = 3;
	@Test
	public void runtest() throws IOException, InterruptedException{
		DamPluginBasefile vaf = new DamPluginBasefile();
		vaf.login(row);
		vaf.validate(row);
	}
}
