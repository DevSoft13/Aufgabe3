package challenge3;

public interface SensorDataStorage {
	

    /**

     * This method can be called by a sensor to save a data set.

     * @param time UNIX time when measurement took place

     * @param values sensor data
     * @return 

     * @throws PersistenceException if something unexpected happened. Insufficient right, medium broken, offline..

     */

    void saveData(long time, float [] values) throws Exception;



    // what else could we need? Get inspired by e.g. this:

    // https://docs.oracle.com/javase/7/docs/api/java/util/List.html



    // size() is usually a good idea

    // get at data set at a position as well.

    // what can go wrong.... Declare methods. Don't forget exceptions. Write comments!

}
