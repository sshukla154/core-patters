package core.singleton;

public class SingletonImprovedThreadSafeExample {

	/*
	 * Step 1: Private constructor
	 *
	 * Step 2: Public Method which return Object of this class when null else same
	 * object
	 * 
	 * Step 3: private static field of same class type
	 * 
	 */

	private static volatile SingletonImprovedThreadSafeExample instance;

	private SingletonImprovedThreadSafeExample() {
	}

	public static SingletonImprovedThreadSafeExample getInstance() {
		if (instance == null) {
			/* Class level lock for the particular block which creates object */
			synchronized (SingletonImprovedThreadSafeExample.class) {
				if (instance == null) {
					instance = new SingletonImprovedThreadSafeExample();
				}
			}
		}
		return instance;
	}

}
