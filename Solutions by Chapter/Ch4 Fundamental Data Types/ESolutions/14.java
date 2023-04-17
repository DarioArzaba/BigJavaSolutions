/* 

14.- Write a program that reads a number between 1,000 and 999,999 from the user and prints it with a comma separating the thousands. Here is a sample dialog; the user input is in color:
	
	Please enter an integer between 1000 and 999999: 23456
	23,456

*/

import java.util.Scanner;

public class NumberCommaAdder {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPlease enter an integer between 1000 and 999999 : " );
		
		String number = new String(input.next());
		
		char[] digits = number.toCharArray();
		
		StringBuilder numberNewFormat = new StringBuilder();
		
		int threeDigitCounter = 0;
		
		for (int i = number.length(); i > 0; i--){
			
			if (threeDigitCounter == 3){
				threeDigitCounter = 1;
				numberNewFormat.append(',');
				numberNewFormat.append(digits[i-1]);
			} else {
				threeDigitCounter++;
				numberNewFormat.append(digits[i-1]);
			}
			
		}
		
		numberNewFormat.reverse();
		
		System.out.println("Number                                          : " + numberNewFormat );
		
		System.exit(0);
		
	}
	
}