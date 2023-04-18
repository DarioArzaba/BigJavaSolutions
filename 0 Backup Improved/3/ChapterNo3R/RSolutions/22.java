/* 

22.- Design a modification of the BankAccount class in which the first five transactions per month are free and a $1 fee is charged for every additional transaction. Provide a method that deducts the fee at the end of a month. What additional instance variables do you need? Using the object tracing technique described in Section 3.5, trace a scenario that shows how the fees are computed over two months.

*/

class BankAccount {
	
	private double balance;
	private int numTransactions = 0;
	private int fee = 1;
	private int monthFee = 0;
	
	public BankAccount(){
	   balance = 0;
	}
	
	public BankAccount(double initialBalance){
	   balance = initialBalance;
	}
	
	public void deposit(double amount){
	   balance = balance + amount;
	   numTransactions++;
	   countFee();
	}
	
	public void withdraw(double amount){
	   balance = balance - amount;
	   numTransactions++;
	   countFee();
	}
	
	private void countFee(){
		if (numTransactions > 5){
			monthFee += fee;
		}
	}
	
	public void applyFee(){
		if (numTransactions > 5){
			balance -= monthFee;
			monthFee = 0;
		}
		numTransactions = 0;
	}
	
	public double getBalance(){
	   return balance;
	}

}