/* 

27.- What does this sequence of statements print?

	Rectangle box = new Rectangle(5, 10, 20, 30);
	System.out.println("Before: " + box.getWidth());
	box.translate(25, 40);
	System.out.println("After: " + box.getWidth());

A.

	Before: 20.0
	After: 20.0

Note how the (translate) method from the (Rectangle) class can change the (X) and (Y) values but not the Width of the (box) object.

*/

import java.awt.Rectangle;

public class RectangleOtherBeforeAfter {
		
	public static void main(String[] args){

		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getWidth());
		box.translate(25, 40);
		System.out.println("After: " + box.getWidth());

		System.exit(0);
		
	}

}

