package AddVolume;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.VolumeAddfile;

public class AVST_15 {
	int row = 16;
	@Test
	public void runtest() throws IOException, InterruptedException{
		VolumeAddfile vaf = new VolumeAddfile();
		vaf.login(row);
		vaf.validate(row);
	}
}
