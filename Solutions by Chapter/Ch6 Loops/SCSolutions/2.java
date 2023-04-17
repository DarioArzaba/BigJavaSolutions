/* 

2.- If the interest rate is 10 percent per year, how many years does it take for the investment to double? Modify the program and run it.

A. The investment doubled after 8 years

*/

class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) { balance = aBalance;
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
		final double RATE = 10;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years");
	}
}
