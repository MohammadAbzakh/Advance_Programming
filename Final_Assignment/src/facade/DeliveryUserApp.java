package facade;

public class DeliveryUserApp extends DeliveryManager{
	
	
	@Override
	public void sendDeliveryPackage(String Accountfrom, String Accountto, String ammount) {
		System.out.println("Delevering ...\n"+"Sending "+ammount+" dollars from "+Accountfrom+" to "+ Accountto);
	}

}
