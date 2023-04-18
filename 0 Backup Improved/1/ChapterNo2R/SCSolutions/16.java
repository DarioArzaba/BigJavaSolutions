/* 

16.- Suppose you omit the "" characters around Hello, World! from the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a compile-time error. The program won't be even able to run until we fix it.

Error: Hello cannot be resolved to a variable

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println(Hello, World!);
		System.exit(0);
	}
}
