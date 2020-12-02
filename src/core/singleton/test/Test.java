package core.singleton.test;

import core.singleton.SingletonExample;

public class Test {

	public static void main(String[] args) {
		SingletonExample singletonExample1 = SingletonExample.getInstance();
		SingletonExample singletonExample2 = SingletonExample.getInstance();

		System.out.println(singletonExample1 == singletonExample2);
	}

}
