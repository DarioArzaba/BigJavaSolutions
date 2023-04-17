/* 

15.- Repeat Exercise R2.14, but now declare object variables that are initialized with the required objects.

*/

import java.awt.Rectangle;

public class CreateObjectRectString {

	public static void main(String[] args) {
		
		Rectangle rectangleObject = new Rectangle(100, 100, 50,50); 
		String stringObject = new String("Hello, Dave");  
		System.out.println("Rectangle : " + rectangleObject);
		System.out.println("String : " + stringObject);

		System.exit(0);
	}

}
