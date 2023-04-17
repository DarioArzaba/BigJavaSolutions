/* 

8.- Write a class SavingsAccount that is similar to the BankAccount class, except that it has an added instance variable interest. Supply a constructor that sets both the initial balance and the interest rate. Supply a method addInterest (with no explicit parameter) that adds interest to the account. Write a SavingsAccountTester class that constructs a savings account with an initial balance of $1,000 and an interest rate of 10 percent. Then apply the addInterest method and print the resulting balance. Also compute the expected result by hand and print it.

*/

class SavingsAccount {
	
	private double balance;
	private double interest;
	
	SavingsAccount() {
		balance = 0;
	}
	
	SavingsAccount(double iniBalance, double iniInterest) {
		balance = iniBalance;
		interest = iniInterest;
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
	
	public void addInterest(){
		balance += ((interest*balance)/100);	
	}
	
}

public class SavingsAccountTester {
	
	public static void main(String[] args){
		
		SavingsAccount account = new SavingsAccount(1000 , 10);
		account.addInterest();
		System.out.printf("Balance:  $%,.2f%n", account.getBalance());
		System.out.println("Expected: $1,100.00");
		
		System.exit(0);
	}

}
