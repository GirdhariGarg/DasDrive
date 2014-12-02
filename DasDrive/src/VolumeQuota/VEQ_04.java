package VolumeQuota;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class VEQ_04 {
	
	int row = 5;
	VolumeQuota testbase = new VolumeQuota();
	@Test
	public void testrun() throws IOException, InterruptedException{
		testbase.login(row);
		testbase.validate(row);
	}
	

}