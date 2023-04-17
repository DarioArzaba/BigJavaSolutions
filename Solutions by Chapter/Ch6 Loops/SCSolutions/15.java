/* 

15.- How would you modify the InvestmentRunner.java program to print the balances after 20, 40, …, 100 years?

*/

class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		
	}
	
	public void waitYears(int numberOfYears) {
		
		for (int i = 1; i <= numberOfYears; i++) {
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		year = year + n;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		final int YEARS = 20;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		final int PERIODS = 5;
		for (int i = 1; i <= PERIODS; i++) {
			invest.waitYears(YEARS);
			System.out.printf( "The balance after %d years is %.2f\n", invest.getYears(), invest.getBalance());
		}
	}
}

