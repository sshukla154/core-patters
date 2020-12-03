package core.decorator;

/*Concrete Component*/
public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("PlainPizza.bake()... Baking new pizza");
	}

}
