package AddVolume;

import java.io.IOException;

import org.testng.annotations.Test;

import TestBase.VolumeAddfile;

public class AVST_11 {
	int row = 12;
	@Test
	public void runtest() throws IOException, InterruptedException{
		VolumeAddfile vaf = new VolumeAddfile();
		System.out.println("AVST_11: Click on Up Arrow on Soft Quota field with numeric value less than Hard Quota value");
		vaf.login(row);
		vaf.validate(row);
	}
}
