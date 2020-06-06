package template;

public abstract class Burger {

	final void makeBurger() {

		bringBread();

		if (custmoerWantsMeat()) {

			addMeat();

		}
		if (custmoerWantsChicken()) {

			addChicken();

		}
		if (custmoerWantsOnion()) {

			addOnion();

		}
		if (custmoerWantsTomato()) {

			addTomato();

		}

		if (custmoerWantsCheese()) {

			addCheese();

		}

		wrapTheBurger();

	}

	public void bringBread() {

		System.out.println("Bring the bread...");

	}

	abstract void addMeat();

	abstract void addChicken();

	abstract void addOnion();

	abstract void addTomato();

	abstract void addCheese();

	boolean custmoerWantsMeat() {
		return true;
	}

	boolean custmoerWantsChicken() {
		return true;
	}

	boolean custmoerWantsOnion() {
		return true;
	}

	boolean custmoerWantsTomato() {
		return true;
	}

	boolean custmoerWantsCheese() {
		return true;
	}

	public void wrapTheBurger() {

		System.out.println("Wrapping the Burger... ");
	}
}
