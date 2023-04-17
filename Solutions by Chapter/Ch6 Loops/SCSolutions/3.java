/* 

3.- Modify the program so that the balance after each year is printed. How did you do that?

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
			System.out.println(balance);
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
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years");
	}
}
