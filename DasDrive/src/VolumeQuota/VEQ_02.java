package VolumeQuota;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEQ_02 {
	
	int row = 3;
	VolumeQuota testbase = new VolumeQuota();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
	

}