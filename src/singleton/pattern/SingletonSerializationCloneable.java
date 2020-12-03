package singleton.pattern;

import java.io.Serializable;

public class SingletonSerializationCloneable implements Serializable, Cloneable {

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
	private static SingletonSerializationCloneable instance;

	private SingletonSerializationCloneable() {
	}

	public static SingletonSerializationCloneable getInstance() {
		if (instance == null) {
			instance = new SingletonSerializationCloneable();
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning of this class is not allowed.");
	}

}
