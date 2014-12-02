package EditVolume;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.EditVolumeBasefile;

public class VE_01 {
	int row = 2;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditVolumeBasefile vaf = new EditVolumeBasefile();
		vaf.login(row);
		vaf.validate(row);
	}
}
