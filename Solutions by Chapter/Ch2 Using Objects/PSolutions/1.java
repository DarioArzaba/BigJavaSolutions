/* 

1.- Write a program called FourRectanglePrinter that constructs a Rectangle object, prints its location by calling System.out.println(box), and then translates and prints it three more times, so that, if the rectangles were drawn, they would form one large rectangle, as shown at right. Your program will not produce a drawing. It will simply print the locations of the four rectangles.

*/

import java.awt.Rectangle;

public class FourRectanglePrinter {

	public static void main(String[] args) {

		Rectangle box = new Rectangle(5,10,15,20);
		System.out.println(box);
		box.translate((int)box.getWidth(), 0);
		System.out.println(box);
		box.translate(0, (int)box.getHeight());
		System.out.println(box);
		box.translate(-(int)box.getWidth(), 0);
		System.out.println(box);
		System.exit(0);
		
	}

}