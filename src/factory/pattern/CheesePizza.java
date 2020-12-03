package factory.pattern;

public class CheesePizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println("CheesePizza.preparePizza()...");
	}

	@Override
	public void bakePizza() {
		System.out.println("CheesePizza.bakePizza()...");
	}

	@Override
	public void cutPizza() {
		System.out.println("CheesePizza.cutPizza()...");
	}

}
