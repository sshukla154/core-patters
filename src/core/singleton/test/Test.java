package core.singleton.test;

import core.singleton.EagarSingletonExample;
import core.singleton.SingletonExample;

public class Test {

	public static void main(String[] args) {
		SingletonExample singletonExample1 = SingletonExample.getInstance();
		SingletonExample singletonExample2 = SingletonExample.getInstance();

		System.out.println(singletonExample1 == singletonExample2);
		EagarSingletonExample eagarSingletonExample1 = EagarSingletonExample.getInstance();
		EagarSingletonExample eagarSingletonExample2 = EagarSingletonExample.getInstance();

		System.out.println(eagarSingletonExample1 == eagarSingletonExample2);
	}

}
