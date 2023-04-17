/* 

13.- Calculating the tip when you go to a restaurant is not difficult, but your restaurant wants to suggest a tip according to the service diners receive. Write a program that calculates a tip according to the diner’s satisfaction as follows:
	
	Ask for the diners’ satisfaction level using these ratings: 1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied.
	If the diner is totally satisfied, calculate a 20 percent tip.
	If the diner is satisfied, calculate a 15 percent tip.
	If the diner is dissatisfied, calculate a 10 percent tip.
	Report the satisfaction level and tip in dollars and cents.

*/

import java.util.Scanner;

public class SatisfactionTipBased {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		final int TOTALLY_SATISFIED = 1;
		final int SATISFIED = 2;
		final int DISSATISFIED = 3;
		
		System.out.println("\nTip - Satisfaction Calculator" );
		
		System.out.print("\nEnter total Bill: " );
		double money = input.nextDouble();
		
		System.out.println("1.- Totally Satisfied" );
		System.out.println("2.- Satisfied" );
		System.out.println("3.- Dissatisfied\n" );
		
		System.out.print("Enter your level of satisfaction: " );
		int satisfaction = input.nextInt();
		
		if (satisfaction == TOTALLY_SATISFIED) {
			
			double tip = (Math.round(money * 100.0) / 100.0) * 0.2;
			int dollars = (int)tip;
			int cents = ((int)(tip*100) - (dollars*100));
			System.out.println("\nSugested Tip for Totally Satisfied Customers: " );
			System.out.println(dollars + " dollars with " + cents + " cents.");
			
		} else if (satisfaction == SATISFIED) {
			
			double tip = (Math.round(money * 100.0) / 100.0) * 0.15;
			int dollars = (int)tip;
			int cents = ((int)(tip*100) - (dollars*100));
			System.out.println("\nSugested Tip for Satisfied Customers: " );
			System.out.println(dollars + " dollars with " + cents + " cents.");
			
		} else if (satisfaction == DISSATISFIED) {
			
			double tip = (Math.round(money * 100.0) / 100.0) * 0.1;
			int dollars = (int)tip;
			int cents = ((int)(tip*100) - (dollars*100));
			System.out.println("\nSugested Tip for Dissatisfied Customers: " );
			System.out.println(dollars + " dollars with " + cents + " cents.");
			
		}
		
		
		input.close();
		
		System.exit(0);
		
	}
	
}