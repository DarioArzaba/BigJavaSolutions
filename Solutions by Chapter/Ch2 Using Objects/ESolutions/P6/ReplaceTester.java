/* 

6.- Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s" with "$". 
	Use the replace method. 
	Demonstrate that you can correctly encode the string "Mississippi". 
	Print both the actual and expected result.

*/

public class ReplaceTester {
	public static void main(String[] args) {
		String str = "Mississippi";
		str = str.replace("i", "!");
		str = str.replace("s", "$");
		System.out.println("Output: " + str);
		System.exit(0);
	}
}

