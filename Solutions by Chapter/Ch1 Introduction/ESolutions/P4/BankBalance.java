/* 

4.- Write a program that prints the balance of an account after the first, second, and third year. The account has an initial balance of 1,000 and earns 5 percent of interest per year.

*/

public class BankBalance {
	
	public static void main(String[] args){
		
		double balance = 1000;
		double interestPercent = 5;
		double interest = 0;
		
		interest = ( balance * (interestPercent/100) );
		balance += interest;
		System.out.println("Balance First Year: $" + balance);
		
		interest = ( balance * (interestPercent/100) );
		balance += interest;
		System.out.println("Balance Second Year: $" + balance);
		
		interest = ( balance * (interestPercent/100) );
		balance += interest;
		System.out.println("Balance Third Year: $" + balance);
		
		System.exit(0);
	
	}
	
}
