/* 

8.- Suppose you want a more powerful bank account abstraction that keeps track of an account number in addition to the balance. How would you change the public interface to accommodate this enhancement?

*/

class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
	}
	
	public BankAccount(double initialBalance, int account) {
		balance = initialBalance;
		accountNumber = account
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
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
}
