/* 

11.- Find at least five compile-time errors in the following program.

	public class HasErrors {
		public static void main(); {
			System.out.print(Please enter two numbers:)
			x = in.readDouble;
			y = in.readDouble;
			System.out.printline("The sum is " + x + y);
		}
	}

A.

	Main method is missing argument (String[] args)
	There is an extra semicolon after main method declaration
	The prompt for the numbers needs to be inside quotes to be considered a string
	There was no Scanner object in initialized to use its methods and read the numbers
	There is no readDouble method in the Scanner class, the intended one is nextDouble
	There is no printline method in the PrintStream Class, the intended one is println

*/

