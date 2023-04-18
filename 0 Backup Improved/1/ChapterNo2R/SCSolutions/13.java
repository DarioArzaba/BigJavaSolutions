/* 

13.- Would the program continue to work if you replaced line 7 with this statement?

System.out.println(Hello);

A. No. This method expects a string as it's argument, and all strings must be inside double quotes.

Since Hello is not inside double quotes Java thinks it then Hello MUST be a variable with a String inside.
But that isn't the case, we haven't created a Hello variable, so the program looks for it in vain.
Finally, it generates an error telling us that it failed to find the Hello variable:

- Hello cannot be resolved into a variable.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println(Hello);
		System.exit(0);
	}
}
