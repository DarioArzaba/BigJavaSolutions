/* 

37.- Why doesn’t the MoveTester program need to print the width and height of the rectangle?

A. Because the (translate) method we are using doesn't modify the Width and Height of the Rectangle, therefore its dimentions stay the same as when we declared the shape.

*/

import java.awt.Rectangle;

public class GetDimensionsMoveTester {
		
	public static void main(String[] args){
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		box.translate(25, 15);
		System.out.print("x: " + box.getX() + "\n");
		System.out.print("y: " + box.getY() + "\n");
		System.out.print("Width: " + box.getWidth() + "\n");
		System.out.print("Height: " + box.getHeight());
		
		System.exit(0);
		
	}

}

