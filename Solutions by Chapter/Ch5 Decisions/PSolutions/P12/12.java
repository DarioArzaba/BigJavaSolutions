/* 

12.- When you use an automated teller machine (ATM) with your bank card, you need to use a personal identification number (PIN) to access your account. If a user fails more than three times when entering the PIN, the machine will block the card. Assume that the user’s PIN is “1234” and write a program that asks the user for the PIN no more than three times, and does the following:
	
	If the user enters the right number, print a message saying, “Your PIN is correct”, and end the program.
	If the user enters a wrong number, print a message saying, “Your PIN is incorrect” and, if you have asked for the PIN less than three times, ask for it again.
	If the user enters a wrong number three times, print a message saying “Your bank card is blocked” and end the program.

*/

import java.util.Scanner;

public class ATMPINNumber {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		final int PIN = 1234;
		
		System.out.println("ATM Machine" );
		System.out.print("Enter 4 Digit PIN number: " );
		
		int tempPIN = Integer.parseInt(input.nextLine());
		
		if (PIN == tempPIN){
			System.out.println("\nYour PIN is correct.");
		} else {
			
			System.out.println("\nYour PIN is incorrect.");
			System.out.print("Enter 4 Digit PIN number: " );
			tempPIN = Integer.parseInt(input.nextLine());
			if (PIN == tempPIN){
				System.out.println("\nYour PIN is correct.");
			} else {
				System.out.println("\nYour PIN is incorrect.");
				System.out.print("Enter 4 Digit PIN number: " );
				tempPIN = Integer.parseInt(input.nextLine());
				if (PIN == tempPIN){
					System.out.println("\nYour PIN is correct.");
				} else {
					System.out.println("\nYour PIN is incorrect.");
					System.out.print("Your bank card is blocked.");
				}
			}
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}