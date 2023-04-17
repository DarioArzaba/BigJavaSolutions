/* 

9.- What is the compile-time error in this program?

A. The println() method should get only one string.

Error: The method println(String) in the type PrintStream is not applicable for the arguments (String, String)

*/

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Hello", "World!");
		System.exit(0);
	}
	
}
