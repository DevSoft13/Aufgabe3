package challenge3;

import org.junit.Assert;
import org.junit.Test;

public class SensorDataStorageTest {
	
	@Test
	public void test1() throws Exception
	{
		
		SensorDataStorage test1 = new SensorDataStorageImpl();
		
		float [] data;
		data = new float[] {1};
		 test1.saveData(20, data);
		

		
		
	}

}
