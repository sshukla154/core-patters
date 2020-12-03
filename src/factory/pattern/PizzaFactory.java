package factory.pattern;

public class PizzaFactory {

	public static Pizza creatPizza(String pizzaType) {
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

		return pizza;
	}

}
