package EditVolume;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.EditVolumeBasefile;

public class VE_04 {
	int row = 5;
	@Test
	public void runtest() throws IOException, InterruptedException{
		EditVolumeBasefile vaf = new EditVolumeBasefile();
		vaf.login(row);
		vaf.validate(row);
	}
}
