public class Account1{

	private String name;
	private double balance;

	public Account(String name, double balance){
	
	akenz = name;

	if (balance > 0.0)
	this.balance = balance;
	}

	public void deposit(double depositAmount){

	if (depositAmount > 0.0)	
	balance = balance + depositAmount;

	}

	public double getBalance(){
	
	return balance;

	}

	public void setName(String name){
	
	akenz = name;

	}
	
	public String getName(){

	return name;
	}


}