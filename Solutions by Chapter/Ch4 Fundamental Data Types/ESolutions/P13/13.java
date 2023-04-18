/*

13.- Write a program that reads a number between 1,000 and 999,999 from the user, where the user enters a comma in the input. Then print the number without a comma. Here is a sample dialog; the user input is in color.

	Please enter an integer between 1,000 and 999,999: 23,456
	23456
	
Hint: Read the input as a string. Measure the length of the string. Suppose it contains n characters. Then extract substrings consisting of the first n – 4 characters and the last three characters.

*/

import java.util.Scanner;

public class NumberCommaDeleter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPlease enter an integer between 1,000 and 999,999 : " );
		
		String number = new String(input.next());
		
		char[] digits = number.toCharArray();
		
		StringBuilder numberNewFormat = new StringBuilder();
		
		for (int i = 0; i < number.length(); i++){
			if (digits[i] != ',') {
				numberNewFormat.append(digits[i]);
			}
		}
		
		System.out.println("Number                                            : " + numberNewFormat );
		
		System.exit(0);
		
	}
	
}