package VolumeEncryption;

import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.DamPluginBasefile;
import TestBase.VolumeEncryptionBasefile;


public class VEE_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		VolumeEncryptionBasefile vaf = new VolumeEncryptionBasefile();
		vaf.login(row);
		vaf.validate(row);
	}
}
