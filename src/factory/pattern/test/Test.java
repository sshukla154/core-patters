package factory.pattern.test;

import factory.pattern.PizzaStore;

public class Test {

	public static void main(String[] args) {

		PizzaStore pizzaStore = new PizzaStore();
		System.out.println("--- Non - Factory Approach ---");
		pizzaStore.orderPizzaWithoutFactoryApproach("cheese");
		System.out.println("---");
		pizzaStore.orderPizzaWithoutFactoryApproach("chicken");
		System.out.println("--- Factory Approach ---");
		pizzaStore.orderPizzaBytFactoryApproach("veggi");

	}

}
