/* 

6.- Write a BankAccountTester class whose main method constructs a bank account, deposits $1,000, withdraws $500, withdraws another $400, and then prints the remaining balance. Also print the expected result

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
	
}

public class BankAccountTester {
	
	public static void main(String[] args){
		
		BankAccount account = new BankAccount();
		account.deposit(1000.0);
		account.withdraw(500.0);
		account.withdraw(400.0);
		System.out.print("Balance: " + account.getBalance());
		System.out.println();
		System.out.println("Expected: 100");
		
		System.exit(0);
	}

}
