/* 

9.- Suppose we enhance the BankAccount class so that each account has an account number. Supply a documentation comment for the constructor public BankAccount(int accountNumber, double initialBalance).

*/

class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
	}
	
	/**
	 Constructs a new bank account with a given initial balance.
	 
	 @param accountNumber the account number for this account
	 @param initialBalance the initial balance for this account
	 */
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
