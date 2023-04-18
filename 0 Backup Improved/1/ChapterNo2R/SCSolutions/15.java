/* 

15.- What do the following statements print?

System.out.println("Hello");
System.out.println("");
System.out.println("World");

A. It prints:

Hello

World

Note that the empty string still prints out a carriage return because we are using the method println().

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("");
		System.out.println("World");
		System.exit(0);
	}
}

