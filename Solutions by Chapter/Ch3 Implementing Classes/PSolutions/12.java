/* 

12.- In this project, you will enhance the BankAccount class and see how abstraction and encapsulation enable evolutionary changes to software. Begin with a simple enhancement: charging a fee for every deposit and withdrawal. Supply a mechanism for setting the fee and modify the deposit and withdraw methods so that the fee is levied. Test your class and check that the fee is computed correctly. Now make a more complex change. The bank will allow a fixed number of free transactions (deposits or withdrawals) every month, and charge for transactions exceeding the free allotment. The charge is not levied immediately but at the end of the month. Supply a new method deductMonthlyCharge to the BankAccount class that deducts the monthly charge and resets the transaction count. (Hint: Use Math.max(actual transaction count, free transaction count) in your computation.) Produce a test program that verifies that the fees are calculated correctly over several months.

*/


class BankAccount {
	
	private double balance;
	private int count;
	private double feePercent = 5;
	
	/**
	 * Constructs a bank account with a zero balance.
	 */
	BankAccount() {
		balance = 0;
		count = 0;
	}
	
	/**
	 * Constructs a bank account with a given balance.
	 * @param initialBalance the initial balance
	 */
	BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	/**
	 * Deposits money into the bank account and charges the fee
	 * for the transaction.
	 * @param amount     the amount to deposit
	 */
	void deposit(double amount) {
		balance = (balance + amount) - (amount * feePercent / 100);
		count++;
	}
	
	/**
	 * Withdraws money from the bank account and charges the fee
	 * for the transaction.
	 * @param amount     the amount to withdraw
	 */
	void withdraw(double amount) {
		balance = (balance - amount) - (amount * feePercent / 100);
		count++;
	}
	
	/**
	 * Deducts monthly charge for transactions exceeding free allotment and
	 * resets the transactions count.
	 * @param freeCount  number of transactions allowed with no charge
	 */
	void deductMonthlyCharge(int freeCount) {
		int charge = Math.max(count, freeCount) - freeCount;
		for (int i = 0; i < charge; i++) {
			balance = balance - (balance * feePercent / 100);
		}
		count = 0;
	}
	
	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	double getBalance() {
		return balance;
	}
	
	void setFeePercent(double fee){
		feePercent = fee;
	}
	
}

public class BankAccountTesterFeePercent {
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(1000);
		bankAccount.setFeePercent(10);
		
		bankAccount.deposit(100);
		System.out.print("The balance after deposit: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.deposit(100);
		System.out.print("The balance after deposit: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.deposit(100);
		System.out.print("The balance after deposit: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.deposit(100);
		System.out.print("The balance after deposit: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.deposit(100);
		System.out.print("The balance after deposit: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.withdraw(100);
		System.out.print("The balance after withdrawal: ");
		System.out.println(bankAccount.getBalance());
		
		bankAccount.deductMonthlyCharge(3);
		System.out.print("The balance after deducting monthly charge: ");
		System.out.println(bankAccount.getBalance());
		
		System.exit(0);
		
	}
}

