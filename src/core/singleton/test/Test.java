package core.singleton.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import core.singleton.EagarSingletonExample;
import core.singleton.SingletonExample;
import core.singleton.SingletonSerialization;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SingletonExample singletonExample1 = SingletonExample.getInstance();
		SingletonExample singletonExample2 = SingletonExample.getInstance();

		System.out.println(singletonExample1 == singletonExample2);
		EagarSingletonExample eagarSingletonExample1 = EagarSingletonExample.getInstance();
		EagarSingletonExample eagarSingletonExample2 = EagarSingletonExample.getInstance();

		System.out.println(eagarSingletonExample1 == eagarSingletonExample2);

		SingletonSerialization singletonSerialization1 = SingletonSerialization.getInstance();
		ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(
				new FileOutputStream(new File("D:\\Code\\core-patters\\src\\core\\singleton\\singleton.txt")));
		objectOutputStream1.writeObject(singletonSerialization1);

		SingletonSerialization singletonSerialization2 = SingletonSerialization.getInstance();
		ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(
				new FileOutputStream(new File("D:\\Code\\core-patters\\src\\core\\singleton\\singleton.txt")));
		objectOutputStream2.writeObject(singletonSerialization2);
		objectOutputStream1.close();
		objectOutputStream2.close();

		System.out.println(objectOutputStream1 == objectOutputStream2);

	}

}
