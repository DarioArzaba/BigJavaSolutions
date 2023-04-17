/* 

26.- What does this sequence of statements print?

	Rectangle box = new Rectangle(5, 10, 20, 30);
	System.out.println("Before: " + box.getX());
	box.translate(25, 40);
	System.out.println("After: " + box.getX());

A.

	Before: 5.0
	After: 30.0

Note how by using the (translate) method from the (Rectangle) class we managed to changed the (X) value of the (box) object.

*/

import java.awt.Rectangle;

public class RectanglePrintBeforeAfter {
		
	public static void main(String[] args){

		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getX());
		box.translate(25, 40);
		System.out.println("After: " + box.getX());

		System.exit(0);
		
	}

}

