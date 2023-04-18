/* 

2.- Write a program that reads a floating-point number and prints “zero” if the number is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value of the number is less than 1, or “large” if it exceeds 1,000,000.

*/

import java.util.Scanner;

public class NegativePositiveOrZeroDouble {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Double Number : " );
		double num = input.nextDouble();
		boolean zero = false;
		if (Math.abs(num) < 1e-10){
			System.out.println("Number is Zero" );
			zero = true;
		} else if (num > 0){
			System.out.print("Number is Positive" );
		} else {
			System.out.print("Number is Negative" );
		}
		if (Math.abs(num) < 1 && zero == false){
			System.out.print(" and Small" );
		} else if (Math.abs(num) > 1000000){
			System.out.print(" and Large" );
		}
		
		System.exit(0);
		
	}
	
}
