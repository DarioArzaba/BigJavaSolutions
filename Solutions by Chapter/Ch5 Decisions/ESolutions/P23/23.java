/* 

23.- Write a program that prompts the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

*/

import java.util.Scanner;

public class CharacterIsVowelOrConsonant {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Character : " );
		String c = input.next();
		
		if (c.length() == 1) {
			char ch = c.charAt(0);
			if (Character.isLetter(ch)){
				if (Character.toString(ch).matches("[aeiouAEIOU?]")){
					System.out.println("Vowel" );
				} else {
					System.out.println("Consonant" );
				}
			} else {
				System.out.println("Error. Input is not a letter (a-z or A-Z)." );
			}
		} else {
			System.out.println("Error. Input needs to have exactly 1 character." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}