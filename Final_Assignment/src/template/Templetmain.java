package template;

import java.util.Scanner;

public class Templetmain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number 1 for Chicken and number 2 for beef:");
		Scanner x = new Scanner(System.in);
		int a =x.nextInt();
		
		if (a == 1) {
			Burger lukesBurger = new BurgerChicken();

			lukesBurger.makeBurger();
		}
		if (a == 2) {
			Burger lukes1Burger = new BurgerBeef();

			lukes1Burger.makeBurger();
		}
	}
}
