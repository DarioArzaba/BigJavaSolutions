/* 

16.- Write a Java statement to initialize a variable square with a rectangle object whose top-left corner is (10, 20) and whose sides all have length 40. Then write a statement that replaces square with a rectangle of the same size and top-left corner (20, 20).

*/

import java.awt.Rectangle;

public class TranslateRectangles {

	public static void main(String[] args) {
		
		Rectangle square = new Rectangle(10,20,40,40); 
		square.translate(10,0);  
		System.out.println("Rectangle Object : " + square);

		System.exit(0);
	}

}
