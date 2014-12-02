package volumes;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.VolumeBasefile;

public class VST_10 {
	int row = 11;
	@Test
	public void runTest() throws IOException, InterruptedException{
		VolumeBasefile vbf = new VolumeBasefile();
		vbf.login(row);
		vbf.validate(row);
	}

}
