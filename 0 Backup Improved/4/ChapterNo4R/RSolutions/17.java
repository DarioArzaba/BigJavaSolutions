/* 

17.- Write pseudocode for a program that reads a name (such as Harold James Morgan) and then prints a monogram consisting of the initial letters of the first, middle, and last name (such as HJM).

A.
	
	Create scanner
	Get next three words from the scanner
	Print the substring that goes from 0 to 1 as the first character from the first name
	Print the substring that goes from 0 to 1 as the first character from the middle name
	Print the substring that goes from 0 to 1 as the first character from the last name
	
	Scanner in = new Scanner(System.in);
	System.out.print("What is your first name? ");
	String first = in.next();
	System.out.print("What is your middle name? ");
	String middle = in.next();
	System.out.print("What is your last name? ");
	String last = in.next();
	System.out.print("Initials: ");
	System.out.print((first.substring(0,1) + middle.substring(0,1) + last.substring(0,1)).toUpperCase());

*/

