/* 

39.- After calling greeting2.toUpperCase(), what are the contents of greeting and greeting2?

A. Nothing. Both variables reference the same message, and since the method (toUpperCase) is an accessor and doesn't modify the original then both variables stay the same.

*/

public class GreetingsAssigmentNew {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		String greeting2 = greeting;
		greeting2.toUpperCase();
		
		System.out.println("Original: " + greeting);
		System.out.println("New: " + greeting2);
		
		System.exit(0);
		
	}

}
