package VolumePermission;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEV_33 {
	
	int row = 34;
	VolumePermission testbase = new VolumePermission();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
}