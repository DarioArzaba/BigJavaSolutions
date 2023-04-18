/* 

18.- Suppose you change main to hello in the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a run-time error. The program will be successfully compiled and executed. However the JVM will search for a main method and will not be able to find one, terminating the program prematurely.

Error: The main method was not found in the HelloPrinter class, define the main method as follows: public static void main (String [] args) otherwise, you must extend a JavaFX application class (javafx.application.Application)

*/

public class HelloPrinter {
	public static void hello(String[] args) {
		System.out.println("Hello, World!");
		System.exit(0);
	}
}