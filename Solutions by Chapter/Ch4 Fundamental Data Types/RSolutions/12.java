/* 

12.- Find three run-time errors in the following program.

	public class HasErrors {
		public static void main(String[] args) {
			int x = 0;
			int y = 0;
			Scanner in = new Scanner("System.in");
			System.out.print("Please enter an integer: ");
			x = in.readInt();
			System.out.print("Please enter another integer: ");
			x = in.readInt();
			System.out.println("The sum is " + x + y);
		}
	}

A.
	The scanner constructor used System.in as a string (with quotes) when it intended to use it without quotes.
	There is no readInt() method from the scanner class, the intended method is nextInt()
	When trying to read the second integer it is being assigned to the x variable when we should be using the y variable
	
*/

