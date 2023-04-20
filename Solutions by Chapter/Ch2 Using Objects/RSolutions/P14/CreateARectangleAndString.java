/* 

14.- Give Java code for objects with the following descriptions: 

	A rectangle with center (100, 100) and all side lengths equal to 50
	A string with the contents “Hello, Dave”

Create objects, not object variables.

*/

import java.awt.Rectangle;

public class CreateARectangleAndString {

	public static void main(String[] args) {
		
		new Rectangle(100, 100, 50,50); 
		new String("Hello, Dave");  

		System.exit(0);
	}

}
