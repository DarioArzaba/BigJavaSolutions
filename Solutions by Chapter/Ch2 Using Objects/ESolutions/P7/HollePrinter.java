/* 

7.- Write a program HollePrinter that switches the letters "e" and "o" in a string. 
	Use the replace method repeatedly. 
	Demonstrate that the string "Hello, World!" turns into "Holle, Werld!"

*/

public class HollePrinter {
	public static void main(String[] args) {
		String str = "Hello, World!";
		str = str.replace("o","\u2600");
		str = str.replace("e","o");
		str = str.replace("\u2600","e");
		System.out.println("Output: " + str);
		System.exit(0);
	}
}
