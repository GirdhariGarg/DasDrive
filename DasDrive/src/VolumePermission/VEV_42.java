package VolumePermission;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEV_42 {
	
	int row = 43;
	VolumePermission testbase = new VolumePermission();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
}