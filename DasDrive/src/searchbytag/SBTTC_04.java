package searchbytag;


import java.io.IOException;
import org.testng.annotations.Test;
import TestBase.*;

public class SBTTC_04{
	
	int row = 5;
	@Test
	public void testrun() throws IOException, InterruptedException{
		SearchByTag testbase = new SearchByTag();
		testbase.login(row);
		testbase.validate(row);
	}
	}