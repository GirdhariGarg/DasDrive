package DamPlugin;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.DamPluginBasefile;


public class VED_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		DamPluginBasefile vaf = new DamPluginBasefile();
		vaf.login(row);
		vaf.validate(row);
	}
}
