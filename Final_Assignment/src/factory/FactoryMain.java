package factory;

public class FactoryMain {

	public static void main(String[] args) {
			
			
		PhoneFactory pf= new PhoneFactory();
				
			Manufacturer obj = pf.getInstance("First one ");
			obj.spec();

	}

}
