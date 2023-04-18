/* 

17.- Suppose you change println to printline in the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a compile-time error. The program won't be even able to run until we fix it.

Error: The method printline(String) is undefined for the type PrintStream

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.printline("Hello, World!");
		System.exit(0);
	}
}