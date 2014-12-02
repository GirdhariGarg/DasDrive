package VolumeQuota;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEQ_07 {
	
	int row = 8;
	VolumeQuota testbase = new VolumeQuota();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
	

}