package decorator.pattern.test;

import decorator.pattern.CheesePizzaDecorator;
import decorator.pattern.Pizza;
import decorator.pattern.PlainPizza;
import decorator.pattern.VeggiePizzaDecorator;

public class PizzaShop {

	public static void main(String[] args) {
		Pizza pizza = new PlainPizza();
		pizza.bake();
		System.out.println("--- New Order");
		Pizza cheesePizza = new CheesePizzaDecorator(new PlainPizza());
		cheesePizza.bake();
		System.out.println("--- New Order");
		Pizza veggiePizza = new VeggiePizzaDecorator(new PlainPizza());
		veggiePizza.bake();
		System.out.println("--- New Order");
		Pizza cheeseVeggiePizza = new CheesePizzaDecorator(new VeggiePizzaDecorator(new PlainPizza()));
		cheeseVeggiePizza.bake();
	}

}
