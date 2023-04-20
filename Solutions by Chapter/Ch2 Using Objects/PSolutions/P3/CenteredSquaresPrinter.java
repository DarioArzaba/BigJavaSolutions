/* 

2.- Write a CenteredSquaresPrinter program that constructs a Rectangle object square representing 
	a square with top-left corner (100, 100) and side length 200, 
	prints its location by calling System.out.println(square), 
	applies the grow and translate methods, and calls System.out.println(square) again. 

	The calls to grow and translate should modify the square so that it has half the width and is centered in the original square.

*/

import java.awt.Rectangle;

public class CenteredSquaresPrinter {

	public static void main(String[] args) {
		
		Rectangle square = new Rectangle(100,100,200,200);
		System.out.println(square);
		int x = -(int) square.getWidth()/4;
		int y = -(int) square.getHeight()/4;
		square.grow(x, y);
		square.translate(0, 0);
		System.out.println(square);
		System.exit(0);

	}

}