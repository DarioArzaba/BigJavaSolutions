/* 

38.- What is the effect of the assignment String greeting2 = greeting?

A. The contents of greeting are copied over and now make up the contents greeting2. Meaning that both objects now reference the same text message.

*/

public class StringAssignment {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		String greeting2 = greeting;
		
		System.out.println("Original: " + greeting);
		System.out.println("New: " + greeting2);
		
		System.exit(0);
		
	}

}

