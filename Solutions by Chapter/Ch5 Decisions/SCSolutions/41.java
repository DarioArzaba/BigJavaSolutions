/*

41.- Run the following test program and supply inputs 2 and "three" at the prompts. What happens? Why?

	import java.util.Scanner
	public class Test {
		public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
	
			System.out.print("Enter an integer: ");
			int m = in.nextInt();
	
			System.out.print("Enter another integer: ");
			int n = in.nextInt();
	
			System.out.println(m + " " + n);
	
		}
	}

A. Since we are assuming that the input will be a number and we have not included input validation in the case that the user inputs another value such as text then (n) will not be initialiced becouse the user intered the String "three" instead of the numerical value of (3). The program will terminate with an Error (InputMismatchException) without reaching the last statement.

*/
