/* 

4.- The intersection method computes the intersection of two rectangles—that is, 
	the rectangle that would be formed by two overlapping rectangles if they were drawn. 
	
	Write a program IntersectionPrinter that constructs two rectangle objects, 
	prints them and then prints the rectangle object that describes the intersection.

*/

import java.awt.Rectangle;

public class IntersectionPrinter {

	public static void main(String[] args) {

		Rectangle firstRectangle = new Rectangle(50,50,100,200);
		System.out.println("First Rectangle : " + firstRectangle );
		Rectangle secondRectangle = new Rectangle(100,150,200,100);
		System.out.println("Second Rectangle : " + secondRectangle);
		Rectangle intersection = firstRectangle.intersection(secondRectangle);
		System.out.println("Do the rectangles intersect : " + (!intersection.isEmpty()));
		System.out.println("\nTranslate the second rectangle:");
		secondRectangle.translate(75, 0);
		System.out.println("Second Rectangle : " + secondRectangle);
		intersection = firstRectangle.intersection(secondRectangle);
		System.out.println("Do the rectangles intersect : " + (!intersection.isEmpty()));
		System.exit(0);
		
	}

}