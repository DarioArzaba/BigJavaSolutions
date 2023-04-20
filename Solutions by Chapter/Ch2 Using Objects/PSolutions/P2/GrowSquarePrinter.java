/* 

2.- Write a GrowSquarePrinter program that constructs a Rectangle object square representing 
	a square with top-left corner (100, 100) and side length 50, 
	prints its location by calling System.out.println(square), 
	applies the translate and grow methods, and calls System.out.println(square) again. 

	The calls to translate and grow should modify the square so that it has twice the size and the same top-left corner as the original.

*/

import java.awt.Rectangle;

public class GrowSquarePrinter {

	public static void main(String[] args) {

		Rectangle square = new Rectangle(100,100,50,50);
		System.out.println(square);
		int x = (int) square.getWidth()/2;
		int y = (int) square.getHeight()/2;
		square.grow(x, y);
		square.translate(x, y);
		System.out.println(square);
		System.exit(0);
		
	}

}