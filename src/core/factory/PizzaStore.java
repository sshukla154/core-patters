package core.factory;

public class PizzaStore {

	public Pizza orderPizzaWithoutFactoryApproach(String pizzaType) {

		Pizza pizza = null;

		switch (pizzaType) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "chicken":
			pizza = new ChickenPizza();
			break;
		case "veggi":
			pizza = new VeggiPizza();
			break;
		}

		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();

		return pizza;

	}

	public Pizza orderPizzaBytFactoryApproach(String pizzaType) {

		Pizza pizza = PizzaFactory.creatPizza(pizzaType);

		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();

		return pizza;

	}

}
