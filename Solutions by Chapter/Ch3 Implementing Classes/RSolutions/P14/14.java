/*

14.- Suppose you want to implement a class TimeDepositAccount. A time deposit account has a fixed interest rate that should be set in the constructor, together with the initial balance. Provide a method to get the current balance. Provide a method to add the earned interest to the account. This method should have no arguments because the interest rate is already known. It should have no return value because you already provided a method for obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a withdraw method that removes the entire balance. Partial withdrawals are not allowed.

*/

	public class TimeDepositAccount {
		
		private double interestRate;
		pirvate double balance;
		
		public TimeDepositAccount(double initialBalance, double initialInterest){
			balance = initialBalance;
			interestRate = initialInterest;
		}
		
		public double currentBalance(){
			return = balance;
		}
		
		public void addInterest(){
			double totalInterest = balance*interestRate; 
			balance += totalInterest;
		}
		
		public double withdrawBalance(){
			double finalBalance = balance;
			balance = 0;
			return finalBalance;
		}
		
	}

