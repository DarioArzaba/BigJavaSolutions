/* 

1.- Write an AreaTester program that constructs a Rectangle object and then computes and prints its area. 
	Use the getWidth and getHeight methods. 
	Also print the expected answer.

*/

import java.awt.Rectangle;
public class AreaTester {
	public static void main(String[] args) {
		Rectangle recObj = new Rectangle(5,10,15,20);	
		System.out.println("Area of Rectangle: " + (recObj.getWidth()*recObj.getHeight()));
		System.out.println("Expected: 300.0");
		System.exit(0);
	}
}