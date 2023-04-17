/* 

13.- Write an algorithm to settle the following question: 
	A bank account starts out with $10,000. 
	Interest is compounded monthly at 6 percent per year (0.5 percent per month). 
	Every month, $500 is withdrawn to meet college expenses. 
	After how many years is the account depleted?

A.

	Start with $10,000 money in the BankAccount.
	Define the Annual Interest as 6 percent (0.06).
	Define the Monthly College Expenses as $500.
	Define the Monthly Interest as the Annual Interest divided by 12.
	Define the Current Month, Interest and Years as 0.
	While the money on the BankAccount is greater than cero:
		Increment the Current Month by 1
		Define the Interest as the money in the BankAccount times the Monthly Interest divided by 100.
		Redefine the money in the BankAccount as the current money plus the Interest and minus de Monthly College Expenses.
	Define the Years as the Current Month divided by 12.
	End by reporting the value of Years as the years it took for the BankAccount to be depleted.

*/

public class BankAccountOne {

	public static void main(String[] args){
		
		double balance = 10000;
		double annualInterest = 6;
		double monthlyWithdraw = 500;
		double monthlyInterest = (annualInterest/12);
		double interest = 0;
		double months = 0;
		double years = 0;
		
		while (balance > 0){
			months++;
			interest = (balance * (monthlyInterest/100));
			balance = (balance - monthlyWithdraw + interest);
		}
		
		years = (months/12);
		System.out.println("Wait " + years + " years to deplete the account.");
		System.exit(0);
		
	}
	
}

