/* 

17.- Write Java statements that initialize two variables square1 and square2 to refer to the same square with center (20, 20) and side length 40.

*/

import java.awt.Rectangle;

public class SameObjectReference {

	public static void main(String[] args) {
		
		Rectangle square = new Rectangle(10,20,40,40); 
		square.translate(10,0);
		Rectangle square1 = square; 
		Rectangle square2 = square1;
		System.out.println("Rectangle Object : " + square);
		System.out.println("Rectangle Object 1 : " + square1);
		System.out.println("Rectangle Object 2 : " + square2);
		
		System.exit(0);
	}

}

