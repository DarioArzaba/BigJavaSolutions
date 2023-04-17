/* 

14.- Consider the question in Exercise R1.13. Suppose the numbers ($10,000, 6 percent, $500) were user selectable. Are there values for which the algorithm you developed would not terminate? If so, change the algorithm to make sure it always terminates

A. 

	Define the amount of money in the BankAccount.
	Define the Annual Interest Percent
	Define the Monthly College Expenses
	Define the Monthly Interest as the Annual Interest divided by 12.
	Define the Current Month, Interest and Years as 0.
	If the Interest is less than the Monthly College Expenses:
		While the money on the BankAccount is greater than cero:
			Increment the Current Month by 1
			Define the Interest as the money in the BankAccount times the Monthly Interest divided by 100.
			Redefine the money in the BankAccount as the current money plus the Interest and minus de Monthly College Expenses.
		Define the Years as the Current Month divided by 12.
		End by reporting the value of Years as the years it took for the BankAccount to be depleted.
	Else if the Interest is equal or greater than the Monthly College Expenses:
		End by reporting that the account will never be depleted with the current input values.

*/

public class BankAccount {

	public static void main(String[] args){
		
		double balance = 10000;
		double annualInterest = 6;
		double monthlyWithdraw = 500;
		
		double monthlyInterest = (annualInterest/12);
		double interest = 0;
		double months = 0;
		double years = 0;
		
		if ( (balance*(monthlyInterest/100)) < monthlyWithdraw ){
			while (balance > 0){
				months++;
				interest = (balance * (monthlyInterest/100));
				balance = (balance - monthlyWithdraw + interest);
			}
			years = (months/12);
			System.out.println("Wait " + years + " years to deplete the account.");
		} else {
			System.out.println("The account will never be depleted with the current values.");
		}
		
		System.exit(0);
		
	}
	
}

