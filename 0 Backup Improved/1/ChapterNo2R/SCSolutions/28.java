/* 

28.- What does this sequence of statements print?

	String greeting = "Hello";
	System.out.println(greeting.toUpperCase());
	System.out.println(greeting);
	
A.

	HELLO
	hello

Note that the method (toUpperCase) is being applied to the (greeting) String object. However, since the changes are not being stored in another variable then after the upper case version is used by (println) it is automatically discarded, returning the String into its lower case version.

*/

public class HelloToLowerCase {
		
	public static void main(String[] args){

		String greeting = "Hello";
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting);

		System.exit(0);
		
	}

}
