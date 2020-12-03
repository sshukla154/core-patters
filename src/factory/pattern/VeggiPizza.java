package factory.pattern;

public class VeggiPizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println("VeggiPizza.preparePizza()...");
	}

	@Override
	public void bakePizza() {
		System.out.println("VeggiPizza.bakePizza()...");
	}

	@Override
	public void cutPizza() {
		System.out.println("VeggiPizza.cutPizza()...");
	}

}
