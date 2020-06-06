package factory;


public class PhoneFactory {

	
	public Manufacturer getInstance(String str){
		
		if (str.equals("First one "))
			return new Samsung();
		else if(str.equals("Second one "))
			return new IPhone();
		
		else 
			return new Huawei();
}
}
