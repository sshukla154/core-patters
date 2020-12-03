package factory.pattern;

public class ChickenPizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println("ChickenPizza.preparePizza()...");
	}

	@Override
	public void bakePizza() {
		System.out.println("ChickenPizza.bakePizza()...");
	}

	@Override
	public void cutPizza() {
		System.out.println("ChickenPizza.cutPizza()...");
	}

}
