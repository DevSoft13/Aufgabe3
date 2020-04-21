package challenge3;

public class SensorDataStorageImpl implements SensorDataStorage {

	@Override
	public void saveData(long time, float[] values) throws Exception {
		// TODO Auto-generated method stub
		long ltime = time;
		float fvalues[] = values;
		System.out.println("time: " + ltime + " Temp: " + fvalues[0]);


	}

}
