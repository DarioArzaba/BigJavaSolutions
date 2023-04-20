/* 

9.- Write Java statements that initialize a string message with "Hello" 
and then change it to "HELLO". Use the toUpperCase method.

*/

public class GreetingInUpper {

	public static void main(String[] args) {
		
		String greeting = "Hello";
		System.out.println("Greeting : " + greeting);
		greeting = greeting.toUpperCase();
		System.out.println("Upper case greeting : " + greeting);

		System.exit(0);
	}

}
