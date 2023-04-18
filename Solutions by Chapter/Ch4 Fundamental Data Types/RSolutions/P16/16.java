/* 

16.- Write pseudocode for a program that reads a word and then prints the first character, the last character, and the characters in the middle. For example, if the input is Harry, the program prints H y arr.

A.

	Create scanner
	Get next word from the scanner
	Print the substring that goes from 0 to 1 as the first character
	Print the substring that goes from the letter before the end of the word to the end of the word as the last character.
	Print the substring that goes from 1 to the letter before the end of the word as the characters in the middle


	Scanner in = new Scanner(System.in);
	System.out.print("Word: ");
	String str = in.next();
	System.out.print(str.substring(0,1) + " ");
	System.out.print(str.substring(str.length()-1,str.length()) + " ");
	System.out.print(str.substring(1,str.length()-1) + " ");
	
*/

