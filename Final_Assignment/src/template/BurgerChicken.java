package template;



	public class BurgerChicken extends Burger {

		
		
		boolean custmoerWantsMeat() { return false;}
		

		
		@Override
		void addMeat() {
			
			
		}

		@Override
		void addChicken() {
			
			System.out.println("Adding the Chicken....");
			
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
	
