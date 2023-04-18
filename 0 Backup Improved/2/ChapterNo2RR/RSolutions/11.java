/* 

11.- Write Java statements that initialize a string message with a message such as "Hello, World" and then remove punctuation characters from the message, using repeated calls to the replace method.

*/


public class ReplacedPunctuations {

	public static void main(String[] args) {
		
		String greeting = "Hello, World!"; 
		System.out.println("Greeting : " + greeting);
		greeting = greeting.replace (",",""); 
		greeting = greeting.replace("!","");  
		System.out.println("Replaced punctuation : " + greeting);

		System.exit(0);
	}

}
