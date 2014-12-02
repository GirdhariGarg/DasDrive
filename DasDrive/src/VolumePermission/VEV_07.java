package VolumePermission;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEV_07 {
	
	int row = 8;
	VolumePermission testbase = new VolumePermission();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
	

}