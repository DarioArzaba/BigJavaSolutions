/* 

1.- Write a program that reads an integer and prints whether it is negative, zero, or positive.

*/

import java.util.Scanner;

public class NegativePositiveOrZeroInt {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Integer Number : " );
		int num = input.nextInt();
		
		if (num > 0){
			System.out.println("Number is Positive" );
		} else if ( num < 0) {
			System.out.println("Number is Negative" );
		} else {
			System.out.println("Number is Zero" );
		}
		
		System.exit(0);

	}
	
}
		
