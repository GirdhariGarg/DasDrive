package VolumePermission;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEV_48 {
	
	int row = 49;
	VolumePermission testbase = new VolumePermission();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
}