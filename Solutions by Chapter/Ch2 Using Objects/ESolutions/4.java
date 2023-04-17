/* 

4.- Write a program that constructs a rectangle with area 42 and a rectangle with perimeter 42. Print the widths and heights of both rectangles.

*/

import java.awt.Rectangle;

public class RectangleAreaAndPerimeter {
	
	public static void main(String[] args) {
	
		Rectangle recObj = new Rectangle(30,30,6,7);
		System.out.println("First Rectangle W and H: " + recObj.getWidth() + " and " + recObj.getHeight());
		Rectangle recObj2 = new Rectangle(50,50,6,15);
		System.out.println("Second Rectangle W and H: " + recObj2.getWidth() + " and " + recObj2.getHeight());
		System.exit(0);
	}
	
}	
