/* 

2.- Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its perimeter. Use the getWidth and getHeight methods. Also print the expected answer.

*/

import java.awt.Rectangle;

public class PerimeterTester {
	
	public static void main(String[] args) {
		
		Rectangle recObj = new Rectangle(5,10,15,20);	
		System.out.println("Perimeter of Rectangle: " + ((recObj.getWidth()*2)+(recObj.getHeight()*2)));
		System.out.println("Expected: 70.0");
		System.exit(0);
		
	}
	
}
