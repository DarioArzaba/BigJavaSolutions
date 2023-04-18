/* 

19.- What is the result of the call greeting.replace("World", "Dave").length()?

A. 12

*/

public class ReplacingWords {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		String oldPart = "World";
		String newPart = "Dave";
		
		System.out.println("The number of characters in the String " + greeting + " is " + greeting.length() );
		System.out.println("By replacing " + oldPart + " with " + newPart + " the number of characters becomes " + greeting.replace("World", "Dave").length() );

		System.exit(0);
		
	}

}

