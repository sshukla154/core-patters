package singleton.pattern;

public class SingletonThreadSafeExample {

	/*
	 * Step 1: Private constructor
	 *
	 * Step 2: Public Method which return Object of this class when null else same
	 * object
	 * 
	 * Step 3: private static field of same class type
	 * 
	 */

	private static SingletonThreadSafeExample instance;

	private SingletonThreadSafeExample() {
	}

	public static SingletonThreadSafeExample getInstance() {

		/* Class level lock for the particular block which creates object */
		synchronized (SingletonThreadSafeExample.class) {
			if (instance == null) {
				instance = new SingletonThreadSafeExample();
			}
		}
		return instance;
	}

}
