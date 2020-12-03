package singleton.pattern;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	/*
	 * Step 1: Private constructor
	 *
	 * Step 2: Public Method which return Object of this class when null else same
	 * object
	 * 
	 * Step 3: private static field of same class type
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonSerialization instance;

	private SingletonSerialization() {
	}

	public static SingletonSerialization getInstance() {
		if (instance == null) {
			/*
			 * This is lazy initialization, as we are creating instance only when
			 * getInstance() is called. to have this eagar initialization we can create its
			 * instance while at the time of loading this class by keeping
			 * 
			 * private static SingletonExample instance = new SingletonExample();
			 * 
			 * Create instance only if instance is null else return as it is ie: Creating
			 * only one instance
			 */
			instance = new SingletonSerialization();
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

}
