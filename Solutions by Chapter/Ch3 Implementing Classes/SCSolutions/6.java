/* 

6.- How can you use the methods of the public interface to empty the harrysChecking bank account?

*/

class BankAccount {
	
	private double balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}
	
}

public class WithdrawFromBankAccountBalance {
	
	public static void main(String[] args){
		
		BankAccount harrysChecking = new BankAccount(1000);
		
		harrysChecking.withdraw(harrysChecking.getBalance());
		
		System.out.println("Harrys Balance: " + harrysChecking.getBalance());
		
		System.exit(0);
		
	}
	
}

