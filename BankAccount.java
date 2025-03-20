
public class BankAccount {

	
	public static String accountnumber;
	
	public static double balance;
	
	public static double deposit( double amount){
		balance += amount;
	}
	
	public static double withdraw(double amount){
		balance += amount;
	}
	
	public static double getBalance(){
		return balance;
	}
}
