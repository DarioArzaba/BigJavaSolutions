/* 

14.- What does the following set of statements print?

System.out.print("My lucky number is ");
System.out.println(3 + 4 + 5);

A. It prints: 

My lucky number is 12

Note that the method System.out.print() didn't introduce a carriage return but System.out.println() did.
Also note that the numeric result (12) is transformed automatically into a String.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.print("My lucky number is ");
		System.out.println(3 + 4 + 5);
		System.exit(0);
	}
}
