/* 

5.- Look into the API documentation of the Rectangle class and locate the method void add(int newx, int newy) 
	Read through the method documentation. 
	Then determine the result of the following statements:

	Rectangle box = new Rectangle(5, 10, 20, 30);
	box.add(0, 0);

	Write a program AddTester that prints the expected and actual location, width, and height of box 
	after the call to add.

	Note: Rectangles can be described geometrically by their starting (upper left) and ending (lower right) points or corners. 
	The method (add) moves the starting point coordinates but leaves the ending point where it currently is. 
	It only works with positive coordinates that are lower than the current starting point coordinates 
	(Effectively increasing the rectangle size).
	
*/

import java.awt.Rectangle;

public class RectangleMoveOrigin {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Starting location, width and height: (" + box.getX() + ", " + box.getY() + "), " + box.getWidth() + ", " + box.getHeight());
		box.add(0, 0);
		System.out.println("Actual location, width and height: (" + box.getX() + ", " + box.getY() + "), " + box.getWidth() + ", " + box.getHeight());
		System.out.println("Expected location, width and height: (0.0, 0.0), 25.0, 40.0");
		System.exit(0);
	}
}	

