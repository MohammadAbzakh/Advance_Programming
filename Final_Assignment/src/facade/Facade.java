package facade;

import java.util.Scanner;

public class Facade {

	public static void main(String[] args) {
		try (Scanner x = new Scanner(System.in)) {
			System.out.println("please enter the sender name ");
		
			String sender = x.nextLine();
			System.out.println("please enter the reciepnt ");
			String reciever =x.nextLine();
			System.out.println("please enter the ammount");
			String money= x.nextLine();
			
			DeliveryManager dm = new DeliveryManager();

			dm.sendDeliveryPackage(sender,reciever,money);
			
		
			System.out.println("================");
			
	
			DeliveryUserApp da= new DeliveryUserApp();
			da.sendDeliveryPackage(sender,reciever,money);
		}

	
	}

}
