/* 

21.- Suppose the interest rate was 20 percent. How long would it take for the investment to double?

A. 4 years

*/

public class HelloPrinter {
	public static void main(String[] args) {
		
		int years = 0;
		double interest = 0;
		double balance = 10000;
		double interestPercent = 20;
		double targetBalance = (balance * 2);
		
		while (balance < targetBalance){
			years++;
			interest = ( balance * (interestPercent/100) );
			balance += interest;
		}
		
		System.out.println("Wait " + years + " years for your balance to double.");
		
		System.exit(0);
	}
}
