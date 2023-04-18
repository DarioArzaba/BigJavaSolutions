/* 

10.- Write Java statements that initialize a string message with "Hello" and then change it to "hello". Use the replace method.

*/


public class GreetingReplaceStart {

	public static void main(String[] args) {
		
		String greeting = "Hello";
		System.out.println("Greeting : " + greeting);
		greeting = greeting.replace("H", "h");
		System.out.println("Replaced H with h : " + greeting);

		System.exit(0);
	}

}

