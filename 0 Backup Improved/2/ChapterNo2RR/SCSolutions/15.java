/* 

15.- How can you print out the uppercase version of "Hello, World!"?

A. Strings are objects from the class (String). One of this class methods is (toUpperCase) which can be used on an String object to return the same String but with lower case alphabetic characters turned into upper case. The class String and its methods are described in the documentation:

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--

*/

public class GreetingToUpperCase {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		System.out.println("The upper case version of " + greeting + " is " + greeting.toUpperCase() );
		System.exit(0);
		
	}

}