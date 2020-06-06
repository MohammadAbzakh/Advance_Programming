package template;

public class BurgerBeef extends Burger {

	
	boolean custmoerWantsChicken() { return false;}
	

	
	@Override
	void addMeat() {
		
		System.out.println("Adding the Meat....");
		
	}

	@Override
	void addChicken() {
		
	}

	@Override
	void addOnion() {
		
		System.out.println("Adding the Onion....");
		
	}

	@Override
	void addTomato() {
		
		System.out.println("Adding the Tomato....");
		
	}

	@Override
	void addCheese() {
		
		System.out.println("Adding the Cheese....");
		
	}
}
