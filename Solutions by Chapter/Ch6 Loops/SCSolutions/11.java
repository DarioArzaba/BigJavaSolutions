/* 

11.- Write the for loop of the Investment class as a while loop.

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
		
		//Here was the for loops
		int year = 1;
		while (year <= numberOfYears) {
			double interest = balance * RATE / 100;
			balance = balance + interest;
			year++;
		}
		
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
		invest.waitYears(YEARS);
		double balance = invest.getBalance();
		System.out.printf("The balance after %d years is %.2f\n", YEARS, balance);
		
	}
}

