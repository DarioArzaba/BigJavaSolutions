/*

10.- An online bank wants you to create a program that shows prospective customers how their deposits will grow. Your program should read the initial balance and the annual interest rate. Interest is compounded monthly. Print out the balances after the first three months. Here is a sample run:

	Initial balance: 1000
	Annual interest rate in percent: 6.0
	After first month: 1005.00
	After second month: 1010.03
	After third month: 1015.08
	
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class MonthlyInterestRateCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Initial Balance                 : ");
		double initialBalance = input.nextDouble();
		
		System.out.print("\nEnter Annual Interest Rate in Percent : ");
		double rate = (input.nextDouble())/12.0;
		double firstMonth = initialBalance + (((rate)/(100.0)))*initialBalance;
		double secondMonth = firstMonth + ((((rate)/(100.0)))*firstMonth);
		double thirdMonth = secondMonth + ((((rate)/(100.0)))*secondMonth);
		
		System.out.printf("\nAfter first month : %.2f \n", firstMonth);
		System.out.printf("\nAfter second month : %.2f \n", secondMonth);
		System.out.printf("\nAfter third month : %.2f \n", thirdMonth);
		
		input.close();
		
		System.exit(0);
	}
	
}