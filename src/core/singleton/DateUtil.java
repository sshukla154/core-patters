package core.singleton;

public class DateUtil {

	/*
	 * Step 1: Private constructor
	 *
	 * Step 2: Public Method which return Object of this class when null else same
	 * object
	 * 
	 * Step 3: private static field of same class type
	 * 
	 */

	private static DateUtil instance;

	private DateUtil() {
	}

	public static DateUtil getInstance() {
		if (instance == null) {
			/*
			 * Create instance only if instance is null else return as it is ie: Creating
			 * only one instance
			 */
			instance = new DateUtil();
		}
		return instance;
	}

}
