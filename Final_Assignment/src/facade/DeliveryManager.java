package facade;

public class DeliveryManager {

	String ammount;
	String  fromAccount;
	String ToAccount;
	
	
	
	public DeliveryManager(){
		
	}
	
	public DeliveryManager(String ammount, String  fromAccount, String ToAccount ) {
		this.ammount = ammount;
		this.fromAccount = fromAccount;
		this.ToAccount = ToAccount;
		
	}
	
	
	protected void checkAccountStatus() {
		System.out.println("Checking the account...");
	}
	protected void checkBalance (){
		System.out.println("Checking the Balance...");
	}
	protected void calculatPayment(){
		System.out.println("Calculating the payment...");
	}
	protected void checkTotalAmmount(){
		System.out.println("Total Ammount...");
	}
	protected void checkPackageSent(){
		System.out.println("Package route ....");
	}
	protected void done(String sender,String reciever,String money) {
		
		System.out.println("from "+sender+" to "+reciever+" and it is "+money);
	}

	public void sendDeliveryPackage(String Accountfrom, String Accountto, String ammount) {
		checkAccountStatus();
		checkBalance ();
		calculatPayment();
		checkTotalAmmount();
		checkPackageSent();
		done(Accountfrom, Accountto,ammount);
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return ToAccount;
	}

	public void setToAccount(String toAccount) {
		ToAccount = toAccount;
	}
}
