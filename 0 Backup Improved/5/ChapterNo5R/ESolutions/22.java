/* 

22.- Write a program that reads in two floating-point numbers and tests whether they are the same up to two decimal places. Here are two sample runs.

	Enter two floating-point numbers: 2.0 1.99998
	They are the same up to two decimal places.
	
	Enter two floating-point numbers: 2.0 1.98999
	They are different.

*/

import java.util.Scanner;

public class NumbersEqualUpToTwoDecimalPlaces {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Number : " );
		double n1 = input.nextDouble();
		
		System.out.print("Enter the Second Number : " );
		double n2 = input.nextDouble();
		
		if (Math.abs(n1 - n2) >= 0.01){
			System.out.println("They are different.");
		} else {
			System.out.println("They are the same up to two decimal places.");
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}


