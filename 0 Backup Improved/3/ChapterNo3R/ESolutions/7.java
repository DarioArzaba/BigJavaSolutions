/* 


7.- Add a method public void addInterest(double rate) to the BankAccount class that adds interest at the given rate. For example, after the statements:

	BankAccount momsSavings = new BankAccount(1000);
	momsSavings.addInterest(10); // 10 percent interest

The balance in momsSavings is $1,100. Also supply a BankAccountTester class that prints the actual and expected balance.

*/

class BankAccount {
	
	private double balance;
	
	BankAccount() {
		balance = 0;
	}
	
	BankAccount(double initialBalance){
		balance = initialBalance;
	}
	
	public void deposit(double amountMoney){
		balance = balance + amountMoney;
	}
	
	public void withdraw(double amountMoney) {
		balance = balance - amountMoney;
	}

	public double getBalance(){
		return balance;
	}
	
	public void addInterest(double rate){
		balance += ((rate*balance)/100);
	}
	
}

public class BankAccountInterestTester {
	
	public static void main(String[] args){
		
		BankAccount account = new BankAccount(1000);
		account.addInterest(10);
		System.out.printf("Balance:  $%,.2f%n", account.getBalance());
		System.out.println("Expected: $1,100.00");
		
		System.exit(0);
	}

}