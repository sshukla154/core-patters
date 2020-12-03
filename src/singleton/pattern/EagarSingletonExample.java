package singleton.pattern;

public class EagarSingletonExample {

	/*
	 * Step 1: Private constructor
	 *
	 * Step 2: Public Method which return Object of this class when null else same
	 * object
	 * 
	 * Step 3: private static field of same class type
	 * 
	 */

	private static EagarSingletonExample instance;
	
	static {
		instance = new EagarSingletonExample();
	}

	private EagarSingletonExample() {
	}

	public static EagarSingletonExample getInstance() {
		return instance;
	}

}
