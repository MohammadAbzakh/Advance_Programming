package strategy;

import java.util.Scanner;

public class Strategymain {

	private static Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);
		System.out.println("Enter the 6 numbers:");
		 int n1=x.nextInt();
		 int n2=x.nextInt();
		 int n3=x.nextInt();
		 int n4=x.nextInt();
		 int n5=x.nextInt();
		 int n6=x.nextInt();
		 Context context = new Context(new OperationAvg());	
		 
	      System.out.println("The Average is: " +context.executeStrategy(n1,n2,n3,n4,n5,n6));
	      
	      context = new Context(new OperationSum());	
			 
	      System.out.println("The Sum is: " +context.executeStrategy(n1,n2,n3,n4,n5,n6));
	}

}
