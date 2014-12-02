package AddVolume;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.VolumeAddfile;

public class AVST_25 {
	int row = 26;
	@Test
	public void runtest() throws IOException, InterruptedException{
		VolumeAddfile vaf = new VolumeAddfile();
		vaf.login(row);
		vaf.validate(row);
	}
}
