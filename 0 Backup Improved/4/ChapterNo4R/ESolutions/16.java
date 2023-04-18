/* 

16.- Write a program that reads in an integer and breaks it into a sequence of individual digits. For example, the input 16384 is displayed as 1 6 3 8 4 You may assume that the input has no more than five digits and is not negative.

*/

import java.util.Scanner;

public class IntegerNumberBreakDown {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Positive Number    : " );
		
		String number = new String(Integer.toString(input.nextInt()));
		
		char[] digits = number.toCharArray();
		
		StringBuilder numberNewFormat = new StringBuilder();
		
		for (int i = 0; i < number.length(); i++){
			numberNewFormat.append(digits[i]);
			numberNewFormat.append(' ');
		}
		
		System.out.println("Number                   : " + numberNewFormat );
		
		System.exit(0);
		
	}
	
}
