/* 

7.- The following pseudocode describes how to turn a string containing a ten-digit phone number (such as "4155551212") into a more readable string with parentheses and dashes, like this: "(415) 555-1212".

	Take the substring consisting of the first three characters.
	Surround it with "(" and ") ". This is the area code.
	Concatenate the area code, the substring consisting of the next three characters
	a hyphen, and the substring consisting of the last four characters.
	This is the formatted number.

Translate this pseudocode into a Java program that reads a telephone number into a string variable, computes the formatted number, and prints it.

*/

import java.util.Scanner;

class TelephoneNumberFormatter {
	
	private String digits;
	
	public TelephoneNumberFormatter (String tel) {
		digits = tel;
	}
	
	public String getTelephone(){
		String firstSub = digits.substring(0,3);
		String secondSub = digits.substring(3,6);
		String thirdSub = digits.substring(6, 10);
		String result = new String("(" + firstSub + ") " + secondSub + "-" + thirdSub);
		return result;
	}
}

public class TelephoneNumberFormatterTester {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Ten Digit Telephone Number  : ");
		String telephone = input.next();
		while (telephone.length() != 10) {
			System.out.println("\nError. Number must have ten digits. ");
			System.out.print("Enter Ten Digit Telephone Number  : ");
			telephone = input.next();
		}
		
		TelephoneNumberFormatter number = new TelephoneNumberFormatter(telephone);
		
		String newTelephone = number.getTelephone();
		
		System.out.println("Telephone Number : " + newTelephone);
		
		input.close();
		
		System.exit(0);
	}
	
}
