package singleton.pattern.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import singleton.pattern.EagarSingletonExample;
import singleton.pattern.SingletonExample;
import singleton.pattern.SingletonSerialization;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
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
		
		SingletonSerialization singletonSerialization3 = null;
		ObjectInputStream objectInputStream3 = new ObjectInputStream(
				new FileInputStream(new File("D:\\Code\\core-patters\\src\\core\\singleton\\singleton.txt")));
		singletonSerialization3 = (SingletonSerialization)objectInputStream3.readObject();
		objectOutputStream1.close();
		objectOutputStream2.close();
		objectInputStream3.close();			

		System.out.println(singletonSerialization1 == singletonSerialization2);
		System.out.println(singletonSerialization1 == singletonSerialization3);

	}

}
