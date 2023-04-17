/* 

18.- The original U.S. income tax of 1913 was quite simple. The tax was
	
	1 percent on the first $50,000.
	2 percent on the amount over $50,000 up to $75,000.
	3 percent on the amount over $75,000 up to $100,000.
	4 percent on the amount over $100,000 up to $250,000.
	5 percent on the amount over $250,000 up to $500,000.
	6 percent on the amount over $500,000.
	
There was no separate schedule for single or married taxpayers. Write a program that computes the income tax according to this schedule.

*/

import java.util.Scanner;

public class SimpleIncomeTaxCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Income : " );
		double income = input.nextDouble();
		
		boolean correct = true;
		int result = 0;
		
		if (income >= 0){
			
			if (income > 500000){
				result = 6;
			} else if (income > 250000){
				result = 5;
			} else if (income > 100000){
				result = 4;
			} else if (income > 75000){
				result = 3;
			} else if (income > 50000){
				result = 2;
			} else if (income >= 0){
				result = 1;
			}
			
		} else {
			System.out.println("Error. The income must be positive." );
			correct = false;
		}
		
		if (correct){
			System.out.println("The income tax is : " + result + " %" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
